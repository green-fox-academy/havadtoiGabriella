import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityFunctions {

  public WebElement findByButtonText(WebDriver driver, String text) {
    WebElement button = driver.findElement(By.xpath("//button[text()='" + text + "']"));
    if (button == null) {
      throw new NoSuchElementException("No matching button was found");
    } else {
      return button;
    }
  }

  public WebElement findByPlaceholderText(WebDriver driver, String placeholderText) {
    WebElement element = driver.findElement(By.xpath("//input[@placeholder=’" + placeholderText + "*’])"));
    if (element == null) {
      throw new NoSuchElementException("No matching element was found");
    } else {
      return element;
    }
  }

  public WebElement findByLabelText(WebDriver driver, String labelText) {
    WebElement inputField = driver.findElement(By.xpath("//label[contains(text(), " + labelText + ")]/following-sibling::input"));
    if (inputField == null) {
      throw new NoSuchElementException("No matching input field was found");
    } else {
      return inputField;
    }
  }
}
