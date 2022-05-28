import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalendarTest {
  private static WebDriver driver;

  @BeforeAll
  public void setup() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setUpEachTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void testTheDate() {
    driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
    WebElement dateBox = driver.findElement(By.id("datetimepicker"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].value = arguments[1]",
        dateBox, "08/20/2032 11:30 PM");
    assertThat(dateBox.getAttribute("value"))
        .as("Target date should be: 08/20/2032 11:30 PM")
        .isEqualTo("08/20/2032 11:30 PM");
  }
}