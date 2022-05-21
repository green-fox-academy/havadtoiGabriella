import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;

public class NavigationTest {
  private static WebDriver driver;

  @BeforeAll
  public static void setUp() {
    WebDriverManager.chromedriver().setup();
  }

  @Test
  public void navigationTest() {
    driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/");
    driver.manage().window().maximize();
    checkPageTitle("W3Schools Online Web Tutorials");
    driver.navigate().to("https://www.javatpoint.com/");
    checkPageTitle("Tutorials List - Javatpoint");
    driver.navigate().back();
    checkPageTitle("W3Schools Online Web Tutorials");
    driver.navigate().forward();
    driver.findElement(By.name("search")).sendKeys("java tutorial");
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

