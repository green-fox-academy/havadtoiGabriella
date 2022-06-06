package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigation extends BasePage {

  public TopNavigation(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//a[@class = 'nav-link active']")
  WebElement homePageButton;
  @FindBy(css = "a[href= '/shop']")
  WebElement shopButton;
  @FindBy(css = "a[href= '/blog']")
  WebElement blogPageButton;
  @FindBy(css = "a[href= '/about']")
  WebElement aboutButton;

  public void load() {
    LOG.info("Loading page");
    driver.get("https://test-automation-demo.greenfox.academy/");
  }

  public HomePage goToHome() {
    LOG.info("Clicking on HomePage button");
    homePageButton.click();
    return new HomePage(driver);
  }

  public BlogPage goToBlog() {
    LOG.info("Clicking on Blog button");
    blogPageButton.click();
    return new BlogPage(driver);
  }

}
