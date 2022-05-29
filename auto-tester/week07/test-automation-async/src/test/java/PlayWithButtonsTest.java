import static org.assertj.core.api.Assertions.assertThat;

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

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlayWithButtonsTest {
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
  public void dynamicButtonsTest() {
    driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
    driver.findElement(By.id("button00")).click();
    waitForElementAndClickOnIt(driver, By.id("button01"));
    waitForElementAndClickOnIt(driver, By.id("button02"));
    waitForElementAndClickOnIt(driver, By.id("button03"));
    assertThat(driver.findElement(By.id("buttonmessage")).getText())
        .as("The message should be: All Buttons Clicked")
        .isEqualTo("All Buttons Clicked");
  }

  @Test
  public void disabledDynamicButtonsTest() {
    driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
    waitForElementAndClickOnIt(driver, By.id("button00"));
    waitForElementAndClickOnIt(driver, By.id("button01"));
    waitForElementAndClickOnIt(driver, By.id("button02"));
    waitForElementAndClickOnIt(driver, By.id("button03"));
    assertThat(driver.findElement(By.id("buttonmessage")).getText())
        .as("The message should be: All Buttons Clicked")
        .isEqualTo("All Buttons Clicked");
  }

  public void waitForElementAndClickOnIt(WebDriver driver, By locator) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    element.click();
  }

}