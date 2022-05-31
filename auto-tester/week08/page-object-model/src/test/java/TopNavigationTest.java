import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.BlogPage;
import pages.HomePage;
import pages.TopNavigation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TopNavigationTest extends BaseTest {

  @Test
  public void navigationToHomePageTest() {
    TopNavigation topNavigation = new TopNavigation(driver);
    topNavigation.load();
    HomePage homePage = topNavigation.goToHome();
    assertThat(homePage.isBlogMenuItemDisplayed())
        .as("Blog menu item should be displayed.")
        .isTrue();
  }

  @Test
  public void navigationToBlogPageTest() {
    TopNavigation topNavigation = new TopNavigation(driver);
    topNavigation.load();
    BlogPage blogPage = topNavigation.goToBlog();
    assertThat(blogPage.isFirstBlogPostDisplayed())
        .as("First blogpost should be displayed.")
        .isTrue();
  }
}
