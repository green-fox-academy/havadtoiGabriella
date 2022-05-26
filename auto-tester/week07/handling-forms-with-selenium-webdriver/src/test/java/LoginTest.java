import io.github.bonigarcia.wdm.WebDriverManager;
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
public class LoginTest {
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
  public void loginTest() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
    WebElement userNameField = driver.findElement(By.id("user-name"));
    assertThat(userNameField.isDisplayed())
        .as("Username field should be visibly.")
        .isTrue();
    userNameField.sendKeys("standard_user");
    WebElement passwordField = driver.findElement(By.id("password"));
    assertThat(passwordField.isDisplayed())
        .as("Password field should be visibly.")
        .isTrue();
    passwordField.sendKeys("secret_sauce");
    WebElement loginButton = driver.findElement(By.id("login-button"));
    assertThat(loginButton.isDisplayed())
        .as("Login button should be displayed.")
        .isTrue();
    loginButton.click();
    driver.findElement(By.id("react-burger-menu-btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("logout_sidebar_link")).click();
  }
}
