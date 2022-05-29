import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AjaxCall2Test {
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
  public void ajaxTest() {
    driver.get("http://uitestingplayground.com/ajax");
    WebElement triggerButton = driver.findElement(By.id("ajaxButton"));
    triggerButton.click();
    WebElement firstSuccessMessage = waitForElement(driver, (By.xpath("//div/p[@class='bg-success']")));
    assertThat(firstSuccessMessage.getText())
        .as("The message 'Data loaded with AJAX get request' should appear.")
        .isEqualTo("Data loaded with AJAX get request.");
    triggerButton.click();
    WebElement secondSuccessMessage = waitForElement(driver, (By.xpath("//p[@class='bg-success'][2]")));
    assertThat(secondSuccessMessage.getText())
        .as("The message 'Data loaded with AJAX get request' should appear again, under the first one.")
        .isEqualTo("Data loaded with AJAX get request.");
  }

  public WebElement waitForElement(WebDriver driver, By locator) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    return wait.until(ExpectedConditions.elementToBeClickable(locator));
  }
}
