import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;

public class NavigationTest {
  private static WebDriver driver;

  @BeforeAll
  public static void setUp() {
    WebDriverManager.chromedriver().setup();
  }

  @Test
  public void navigationTest() throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.navigate().to("https://www.javatpoint.com/");
    driver.navigate().back();
    Thread.sleep(3000);
    String title = driver.getTitle();
    assertThat(title)
        .as("Title should be W3Schools Online Web Tutorials")
        .isEqualTo("W3Schools Online Web Tutorials");
    driver.navigate().forward();
    driver.findElement(By.name("search")).sendKeys("java tutorial");
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }
}

