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
public class ToDoTest {
  private static WebDriver driver;

  @BeforeAll
  public void setup() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setUpEachTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void lambdaTest() throws InterruptedException {
    driver.get("https://lambdatest.github.io/sample-todo-app/");
    driver.findElement(By.id("sampletodotext")).sendKeys("kittycat");
    driver.findElement(By.id("addbutton")).submit();
    assertThat(driver.findElement(By.xpath("//ul/li[last()]")).getText())
        .as("Last checkbox name should be kittycat.")
        .isEqualTo("kittycat");

    driver.findElement(By.name("li3")).click();
    assertThat(driver.findElement(By.name("li3")).isSelected())
        .as("Third element should be selected.");

    driver.findElement(By.name("li6")).click();
    assertThat(driver.findElement(By.name("li6")).isSelected())
        .as("Last element should be selected.");

    List<WebElement> checkedElements = driver.findElements(By.className("done-true"));
    List<WebElement> allElements = driver.findElements(By.xpath("//ul/li"));
    assertThat(allElements.size() - checkedElements.size() == 4)
        .as(" 2 of 6 should be selected")
        .isTrue();

    assertThat(driver.findElement(By.id("addbutton")).getCssValue("background-color"))
        .as("Background color should be: rgba(51, 122, 183, 1)")
        .isEqualTo("rgba(51, 122, 183, 1)");

    assertThat(driver.findElement(By.cssSelector("#addbutton")).getAttribute("value"))
        .as("Add button value should be: add.")
        .isEqualTo("add");
  }
}
