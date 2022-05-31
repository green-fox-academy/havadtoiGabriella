package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NxtGenAiAcademySuccessPage extends BasePage {
  public NxtGenAiAcademySuccessPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[@class='elementor-widget-container']")
  WebElement successMessage;

  public String getSuccessMessage() {
    return successMessage.getText();
  }
}
