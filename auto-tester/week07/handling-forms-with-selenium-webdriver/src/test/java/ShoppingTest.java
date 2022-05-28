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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShoppingTest {
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
  public void webshopTest() throws InterruptedException {
    driver.get("http://automationpractice.com/index.php");
    Actions hover = new Actions(driver);
    hover.moveToElement(driver.findElement(By.className("replace-2x"))).build().perform();
    driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")).click();
    driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")).click();
    WebElement plusIcon = driver.findElement(By.id("cart_quantity_up_1_1_0_0"));
    plusIcon.click();
    plusIcon.click();
    Thread.sleep(2000);
    assertThat(driver.findElement(By.id("total_price_container")).getText())
        .as("Total price should be: $51.53 ")
        .isEqualTo("$51.53");
    driver.findElement(
        By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
    driver.findElement(By.id("email_create")).sendKeys("tinyTester3@test.com");
    driver.findElement(By.id("SubmitCreate")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("Little");
    driver.findElement(By.id("customer_lastname")).sendKeys("Tester");
    driver.findElement(By.id("passwd")).sendKeys("1234ABC");
    driver.findElement(By.id("firstname")).sendKeys("Little");
    driver.findElement(By.id("lastname")).sendKeys("Tester");
    driver.findElement(By.id("address1")).sendKeys("My Company");
    driver.findElement(By.id("city")).sendKeys("Szeged");
    Select state = new Select(driver.findElement(By.id("id_state")));
    state.selectByVisibleText("Alabama");
    driver.findElement(By.id("postcode")).sendKeys("12341");
    Select country = new Select(driver.findElement(By.id("id_country")));
    country.selectByVisibleText("United States");
    driver.findElement(By.id("phone_mobile")).sendKeys("06702976542");
    driver.findElement(By.id("alias")).sendKeys("MyAdress Home");
    driver.findElement(By.id("submitAccount")).click();
    driver.findElement(By.xpath("//button[@class = 'button btn btn-default button-medium']"))
        .click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(
            By.xpath("//button[@class = 'button btn btn-default standard-checkout button-medium']"))
        .click();
    driver.findElement(By.xpath("//a[@class = 'cheque']")).click();
    driver.findElement(By.xpath("//button[@class = 'button btn btn-default button-medium']"))
        .click();
    assertThat(driver.findElement(By.xpath("//p[@class = 'alert alert-success']")).getText())
        .as("Successful order message should be: Your order on My Store is complete.")
        .isEqualTo("Your order on My Store is complete.");
  }
}