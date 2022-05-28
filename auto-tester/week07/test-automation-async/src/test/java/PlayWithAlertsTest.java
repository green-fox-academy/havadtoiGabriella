import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlayWithAlertsTest {
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
  public void alertsTest() {
    //case 1
    driver.get(
        "https://web.archive.org/web/20180920010422/http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    driver.switchTo().alert();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Alert alertFirst = wait.until(ExpectedConditions.alertIsPresent());
    String firstAlertText = alertFirst.getText();
    alertFirst.accept();
    assertThat(firstAlertText).isEqualTo("I am an alert box!")
        .as("First alert text should be: I am an alert box!");

    //case 2
    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
    Alert alertSecond = wait.until(ExpectedConditions.alertIsPresent());
    alertSecond.accept();
    assertThat(driver.findElement(By.id("confirm-demo")).getText()).isEqualTo("You pressed OK!")
        .as("You pressed OK!");

    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
    alertSecond = wait.until(ExpectedConditions.alertIsPresent());
    alertSecond.dismiss();
    assertThat(driver.findElement(By.id("confirm-demo")).getText()).isEqualTo("You pressed Cancel!")
        .as("You pressed Cancel!");

    //case 3
    List<WebElement> buttons =
        driver.findElements(By.xpath("//button[@class='btn btn-default btn-lg']"));
    WebElement promtButton = buttons.get(1);
    promtButton.click();
    Alert alertThird = wait.until(ExpectedConditions.alertIsPresent());
    alertThird.dismiss();
    assertThat(driver.findElement(By.id("prompt-demo"))
        .getText())
        .isEqualTo("")
        .as("No message should appear");

    promtButton.click();
    alertThird.sendKeys("Gabi");
    alertThird.accept();
    assertThat(driver.findElement(By.id("prompt-demo"))
        .getText())
        .isEqualTo("You have entered 'Gabi' !")
        .as("Message should be: You have entered 'Gabi' !");
  }
}
