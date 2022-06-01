import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandleAlert extends BaseTest{

  @Test
  public void alertTest(){
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.name("cusid")).sendKeys("1234567");
    driver.findElement(By.name("submit")).click();
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
  }
}
