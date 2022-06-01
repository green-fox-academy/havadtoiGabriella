package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabLoginPage extends BasePage {
  public SwagLabLoginPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "user-name")
  WebElement userNameField;
  @FindBy(id = "password")
  WebElement passwordField;
  @FindBy(id = "login-button")
  WebElement submitButton;
  @FindBy(tagName = "h3")
  WebElement errorMessage;

  public void load() {
    driver.get("https://www.saucedemo.com/");
  }

  public void fillUserNameField(String username) {
    userNameField.sendKeys(username);
  }

  public void fillPasswordField(String password) {
    passwordField.sendKeys(password);
  }

  public SwagLabInventoryPage clickLoginButton() {
    submitButton.click();
    return new SwagLabInventoryPage(driver);
  }

  public String getErrorMessage() {
    return errorMessage.getText();
  }
}
