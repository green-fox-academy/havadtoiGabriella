import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WebScraperTest {

  private static WebDriver driver;
  private String baseUrl;
  private final By LIST_OF_BLOG_POSTS = By.cssSelector("#blog-section > div");

  @BeforeAll
  public void setup() {
    WebDriverManager.chromedriver().setup();
    baseUrl = "https://test-automation-demo.greenfox.academy/";
  }

  @BeforeEach
  public void setupEachTest() {
    driver = new ChromeDriver();
    driver.get(baseUrl);
    driver.manage().window().maximize();
  }

  @AfterEach
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void openPageTest() {
    checkPageTitle("");
    getUrl("https://test-automation-demo.greenfox.academy/");
  }

  @Test
  public void findingElementByIdAndClassTest() {
    WebElement menuButton = checkIfElementByIdIsDisplayed("menu-button", "Menu button should be displayed");
    System.out.println(menuButton.getText());

    WebElement redirectLink = checkIfElementByIdIsDisplayed("redirect-link", "Redirect link should be displayed");
    System.out.println(redirectLink.getText());

    WebElement activeElement = checkIfElementByClassIsDisplayed("active", "Active should be displayed");
    System.out.println(activeElement.getText());

    WebElement introElement = checkIfElementByClassIsDisplayed("intro", "Intro should be displayed");
    System.out.println(introElement.getText());
  }

  @Test
  public void findingLinksAndNavigatingTest() throws InterruptedException {
    Thread.sleep(3000);
    WebElement elementByLinkTextHome = driver.findElement(By.linkText("Home"));
    assertThat(elementByLinkTextHome.getText())
        .as("Text should be: Home")
        .isEqualTo("Home");

    WebElement linkToTheBlogPostsPage = driver.findElement(By.linkText("Blog"));
    assertThat(linkToTheBlogPostsPage.getText())
        .as("Text should be: Blog")
        .isEqualTo("Blog");
    linkToTheBlogPostsPage.click();
    checkPageTitle("blog");

    List<WebElement> listOfBlogPosts = driver.findElements(LIST_OF_BLOG_POSTS);
    for (WebElement element : listOfBlogPosts) {
      assertThat(element.isDisplayed())
          .as("Each blog post should be displayed")
          .isTrue();
    }
  }

  @Test
  public void extractingInformationTest() {
    System.out.print("Number of images on the Home page is: ");
    System.out.println(driver.findElements(By.tagName("img")).size());
    System.out.print("Number of links on the Home page is: ");
    System.out.println(driver.findElements(By.tagName("a")).size());
    System.out.print("Number of blog posts on the Home page is: ");
    System.out.println(driver.findElements(By.cssSelector("#blog-section > div")).size());

    driver.findElement(By.linkText("Blog")).click();
    List<WebElement> listOfBlogPosts = driver.findElements(LIST_OF_BLOG_POSTS);
    String articleHeader;
    String articleBody;
    for (int i = 0; i < listOfBlogPosts.size(); i++) {
      listOfBlogPosts.get(i).click();
      articleHeader = driver.findElement(By.tagName("h2")).getText();
      articleBody = driver.findElement(By.tagName("article")).getText();
      FileIO.writeToFile(articleHeader + ".txt", articleBody);
      driver.navigate().back();
    }
  }

  public void checkPageTitle(String expectedTitle) {
    String actualTitle = driver.getTitle();
    assertThat(actualTitle).isEqualTo(expectedTitle);
  }

  public void getUrl(String expectedUrl) {
    String actualUrl = driver.getCurrentUrl();
    assertThat(actualUrl).isEqualTo(expectedUrl);
  }

  public WebElement checkIfElementByIdIsDisplayed(String id, String asMessage) {
    WebElement element = driver.findElement(By.id(id));
    assertThat(element.isDisplayed())
        .as("asMessage")
        .isTrue();
    return element;
  }

  public WebElement checkIfElementByClassIsDisplayed(String className, String asMessage) {
    WebElement element = driver.findElement(By.className(className));
    assertThat(element.isDisplayed())
        .as(asMessage)
        .isTrue();
    return element;
  }

}
