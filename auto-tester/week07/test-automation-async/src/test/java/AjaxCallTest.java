import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AjaxCallTest {
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
  public void ajaxCallTest() {
    driver.get("http://uitestingplayground.com/ajax");
    driver.findElement(By.id("ajaxButton")).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));
    wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//div/p[@class='bg-success']"))));
    assertThat(driver.findElement(By.xpath("//div/p[@class='bg-success']")).getText())
        .as("The message 'Data loaded with AJAX get request' should appear.")
        .isEqualTo("Data loaded with AJAX get request.");
  }
}