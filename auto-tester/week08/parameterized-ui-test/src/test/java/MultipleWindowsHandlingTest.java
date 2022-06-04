import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class MultipleWindowsHandlingTest extends BaseTest {

  @Test
  public void multipleWindowsTest() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.get("https://demo.guru99.com/popup.php");
    String parentWindow = driver.getWindowHandle();
    driver.switchTo().frame("gdpr-consent-notice");
    driver.findElement(By.id("save")).click();

    for (int i = 0; i < 3; i++) {
      driver.findElement(By.linkText("Click Here")).click();
      driver.switchTo().window(parentWindow);
    }

    Set<String> handles = driver.getWindowHandles();
    Iterator<String> iterator = handles.iterator();
    iterator.next();

    while (iterator.hasNext()) {
      driver.switchTo().window(iterator.next());
      driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("thisTest@test.com");
      driver.findElement(By.name("btnLogin")).click();
    }

    driver.switchTo().window(parentWindow);
  }
}
