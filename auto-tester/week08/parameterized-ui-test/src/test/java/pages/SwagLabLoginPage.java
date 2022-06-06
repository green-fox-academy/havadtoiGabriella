package pages;

import io.qameta.allure.Step;
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

  @Step("Loading page")
  public void load() {
    driver.get("https://www.saucedemo.com/");
  }

  @Step("Enter username {0}")
  public void fillUserNameField(String username) {
    userNameField.sendKeys(username);
  }

  @Step("Enter password {0}")
  public void fillPasswordField(String password) {
    passwordField.sendKeys(password);
  }

  @Step("Click on the login button")
  public SwagLabInventoryPage clickLoginButton() {
    submitButton.click();
    return new SwagLabInventoryPage(driver);
  }
  @Step("Get error message for unsuccessful login")
  public String getErrorMessage() {
    return errorMessage.getText();
  }
}
