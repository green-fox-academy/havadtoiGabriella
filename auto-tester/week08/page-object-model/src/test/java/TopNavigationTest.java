import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import pages.BlogPage;
import pages.HomePage;
import pages.TopNavigation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TopNavigationTest extends BaseTest {

  @Test
  public void navigationToHomePageTest(TestInfo testInfo) {
    LOG.info("Start of test: " + testInfo.getDisplayName());
    TopNavigation topNavigation = new TopNavigation(driver);
    topNavigation.load();
    HomePage homePage = topNavigation.goToHome();
    assertThat(homePage.isBlogMenuItemDisplayed())
        .as("Blog menu item should be displayed.")
        .isTrue();
    LOG.info("End of test"+ testInfo.getDisplayName());
  }

  @Test
  public void navigationToBlogPageTest(TestInfo testInfo) {
    LOG.info("Start of test: " + testInfo.getDisplayName());
    TopNavigation topNavigation = new TopNavigation(driver);
    topNavigation.load();
    BlogPage blogPage = topNavigation.goToBlog();
    assertThat(blogPage.isFirstBlogPostDisplayed())
        .as("First blogpost should be displayed.")
        .isTrue();
    LOG.info("End of test"+ testInfo.getDisplayName());

  }
}
