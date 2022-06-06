package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {

  public BlogPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = "a[href = '/2021/05/29/Take-a-Trip-to-the-Dordogne-France-s-Overlooked-Paradise/']")
  WebElement firstBlogPost;

  public boolean isFirstBlogPostDisplayed() {
    LOG.info("Checking if first blogpost is displayed");
    return firstBlogPost.isDisplayed();
  }
}
