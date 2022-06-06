package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NxtGenAiAcademySuccessPage extends BasePage {
  public NxtGenAiAcademySuccessPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[@class='elementor-widget-container']")
  WebElement successMessage;

  @Step("Get message after successful registration")
  public String getSuccessMessage() {
    return successMessage.getText();
  }
}
