package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabInventoryPage extends BasePage {

  public SwagLabInventoryPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "logout_sidebar_link")
  WebElement logoutButton;
  @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
  WebElement burgerMenuButton;


  public SwagLabLoginPage logout() {
    burgerMenuButton.click();
    logoutButton.click();
    return new SwagLabLoginPage(driver);
  }

}
