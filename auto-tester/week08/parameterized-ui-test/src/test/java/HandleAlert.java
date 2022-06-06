import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandleAlert extends BaseTest{

  @Test
  @Description("Accepting the alert after submitting Customer ID")
  @Severity(SeverityLevel.NORMAL)
  public void alertTest() {
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    String parentWindow = driver.getWindowHandle();
    driver.switchTo().frame("gdpr-consent-notice");
    driver.findElement(By.id("save")).click();
    driver.switchTo().window(parentWindow);
    driver.findElement(By.name("cusid")).sendKeys("1234567");
    driver.findElement(By.name("submit")).click();
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
  }

}
