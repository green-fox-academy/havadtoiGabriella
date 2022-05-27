import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Locale;
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
import org.openqa.selenium.support.ui.Select;


import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlayWithForms {
  private static WebDriver driver;
  private By submitButton = By.cssSelector("div.col-md-7.col-lg-8 > form > button");

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
  public void formTest() throws InterruptedException {
    driver.get("https://getbootstrap.com/docs/5.0/examples/checkout/");
    driver.findElement(By.id("address")).sendKeys("1234, Main Street");

    WebElement checkbox = driver.findElement(By.id("same-address"));
    assertThat(driver.findElement(By.id("same-address")).isSelected())
        .as("Checkbox shouldn't be checked.")
        .isFalse();
    checkbox.click();

    assertThat(driver.findElement(By.id("credit")).isSelected())
        .as("Credit card should be the default select.")
        .isTrue();

    WebElement radioButton = driver.findElement(By.id("paypal"));
    JavascriptExecutor ex = (JavascriptExecutor) (driver);
    ex.executeScript("arguments[0].click", radioButton);

    String backgroundColor =driver.findElement(submitButton)
            .getCssValue("background-color");
    assertThat(backgroundColor)
        .as("Background color should be: rgba(13, 110, 253, 1")
        .isEqualTo("rgba(13, 110, 253, 1)");

    assertThat(driver.findElement(submitButton).getText())
        .as("Checkout button's text should be: Continue to checkout.")
        .isEqualTo("Continue to checkout");

    assertThat(driver.findElement(By.cssSelector(".badge.bg-primary.rounded-pill")).getText())
        .as("Cart should contain 3 element.")
        .isEqualTo("3");

    assertThat(driver.findElement(By.cssSelector("span[class='text-success']")).getText())
        .as("Discount should be $5.")
        .isEqualTo("−$5");

    assertThat(driver.findElement(By.tagName("strong")).getText())
        .as("Total should be $20.")
        .isEqualTo("$20");

    driver.findElement(submitButton).submit();
    assertThat(driver.findElement(By.xpath("//*[contains(@id, 'cc-cvv')]/following-sibling::div[1]")).getText())
        .as("Error message should be: Security code required.")
        .isEqualTo("Security code required");

    driver.findElement(By.id("firstName")).sendKeys("Xyz");
    driver.findElement(By.id("lastName")).sendKeys("Abc");
    driver.findElement(By.id("username")).sendKeys("XyzAbc");
    driver.findElement(By.id("address")).sendKeys("1234, Main Str.");
    Select country = new Select(driver.findElement(By.id("country")));
    country.selectByVisibleText("United States");
    Select state = new Select(driver.findElement(By.id("state")));
    state.selectByVisibleText("California");
    driver.findElement(By.id("zip")).sendKeys("1234");
    driver.findElement(By.id("cc-name")).sendKeys("Xyz Abc");
    driver.findElement(By.id("cc-number")).sendKeys("122456789");
    driver.findElement(By.id("cc-expiration")).sendKeys("0823");
    driver.findElement(By.id("cc-cvv")).sendKeys("840");
    driver.findElement(submitButton).submit();
  }

}
