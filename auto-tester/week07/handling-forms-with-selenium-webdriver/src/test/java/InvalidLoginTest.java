import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InvalidLoginTest {
  private static WebDriver driver;
  private By username = By.id("user-name");
  private By password = By.id("password");
  private By loginButton = By.id("login-button");
  private By errorButton = By.cssSelector("div.error-message-container.error");

  @BeforeAll
  public void setup() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setUpEachTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void invalidLoginTest() {
    driver.get("https://www.saucedemo.com/");
    WebElement userNameField = driver.findElement(username);
    WebElement passwordField = driver.findElement(password);
    passwordField.sendKeys("secret_sauce");
    driver.findElement(loginButton).click();
    clearWebField(passwordField);
    WebElement missingUserNameErrorMessage = driver.findElement(errorButton);
    assertThat(missingUserNameErrorMessage.getText())
        .as("Username is required.")
        .isEqualTo("Epic sadface: Username is required");

    userNameField.sendKeys("standard_user");
    driver.findElement(loginButton).click();
    WebElement missingPasswordErrorMessage = driver.findElement(errorButton);
    assertThat(missingPasswordErrorMessage.getText())
        .as("Password is required.")
        .contains("Epic sadface: Password is required");

    passwordField.sendKeys("secret_saucee");
    driver.findElement(loginButton).click();
    WebElement wrongPasswordErrorMessage = driver.findElement(errorButton);
    assertThat(wrongPasswordErrorMessage.getText())
        .as("Username and password do not match.")
        .contains("Epic sadface: Username and password do not match any user in this service");
  }

  public void clearWebField(WebElement element) {
    while (!element.getAttribute("value").equals("")) {
      element.sendKeys(Keys.BACK_SPACE);
    }
  }
}
