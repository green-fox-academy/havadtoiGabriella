import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import pages.SwagLabInventoryPage;
import pages.SwagLabLoginPage;

public class SwagLabCookiesTest extends BaseTest {

  @Test
  public void deleteSessionCookieTest() {
    SwagLabLoginPage loginPage = new SwagLabLoginPage(driver);
    loginPage.load();
    loginPage.fillUserNameField("standard_user");
    loginPage.fillPasswordField("secret_sauce");
    loginPage.clickLoginButton();
    Set<Cookie> allCookies = driver.manage().getCookies();
    for (Cookie cookie : allCookies) {
      System.out.println(cookie.getName());
    }
    driver.manage().deleteCookieNamed("session-username");
    driver.navigate().refresh();
    assertThat(driver.getCurrentUrl())
        .as("Browser should be redirected to Login Page, url should be: https://www.saucedemo.com/")
        .isEqualTo("https://www.saucedemo.com/");
  }

  @Test
  public void logoutButtonTest() {
    SwagLabLoginPage loginPage = new SwagLabLoginPage(driver);
    loginPage.load();
    loginPage.fillUserNameField("standard_user");
    loginPage.fillPasswordField("secret_sauce");
    SwagLabInventoryPage inventoryPage = loginPage.clickLoginButton();
    inventoryPage.logout();
    assertThat(driver.manage().getCookies())
        .as("Session cookie should be deleted.")
        .isEmpty();
  }
}
