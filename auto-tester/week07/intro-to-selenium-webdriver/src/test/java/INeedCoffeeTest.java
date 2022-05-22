import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;

public class INeedCoffeeTest {

  private static WebDriver driver;

  @BeforeAll
  public static void setUp() {
    WebDriverManager.chromedriver().setup();
  }

  @Test
  public void coffeePageTest() {
    driver = new ChromeDriver();
    driver.get("https://www.hasbean.co.uk/");
    driver.manage().window().maximize();
    checkPageTitle("Hasbean: Specialty coffee supply, roasted to order.");
    driver.findElement(By.xpath("//*[text()='Search']")).click();
    driver.findElement(By.name("q")).sendKeys("brazil");
    driver.findElement(By.xpath("//*[@id='mega-menu-search']/div/div[1]/div[1]/form/div/button"))
        .click();
    driver.findElement(By.xpath("//img[@alt='Hasbean Logo']")).click();
    driver.navigate().refresh();
    checkPageTitle("Hasbean: Specialty coffee supply, roasted to order.");
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }

  public void checkPageTitle(String expectedTitle) {
    String actualTitle = driver.getTitle();
    assertThat(actualTitle).isEqualTo(expectedTitle);
  }
}
