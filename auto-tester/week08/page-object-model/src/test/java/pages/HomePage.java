package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
  public HomePage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = "a[href= '/blog']")
  WebElement blogPageButton;

  public boolean isBlogMenuItemDisplayed() {
    LOG.info("Checking if Blog button in menu bar is displayed");
    return blogPageButton.isDisplayed();
  }
}
