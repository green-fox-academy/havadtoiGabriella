import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LetsColor extends BaseTest {

  @Test
  @Description("Using JSExecutor")
  @Severity(SeverityLevel.MINOR)
  public void jsExecutorTest() {
    driver.get("https://courses.letskodeit.com/practice");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement nameField = driver.findElement(By.id("name"));
    js.executeScript("arguments[0].style.border='3px solid yellow';", nameField);
    js.executeScript("arguments[0].value='your name';", nameField);
    WebElement confirmButton = driver.findElement(By.id("confirmbtn"));
    js.executeScript("arguments[0].click();", confirmButton);
    Alert alert = driver.switchTo().alert();
    alert.dismiss();
    driver.switchTo().frame(0);
    js.executeScript("window.scrollBy(0,300)", "");
    WebElement termsAndCond = driver.findElement(By.linkText("Terms & Conditions"));
    js.executeScript("arguments[0].style.border='3px dotted green';", termsAndCond);
    driver.switchTo().parentFrame();
    WebElement hideShow = driver.findElement(By.id("displayed-text"));
    js.executeScript("arguments[0].style.backgroundColor ='red';", hideShow);
  }
}
