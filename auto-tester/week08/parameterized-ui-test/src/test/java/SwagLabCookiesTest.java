import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import pages.SwagLabInventoryPage;
import pages.SwagLabLoginPage;

public class SwagLabCookiesTest extends BaseTest {

  @Test
  @Description("Deleting session cookie")
  @Severity(SeverityLevel.NORMAL)
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
  @Description("Testing logout")
  @Severity(SeverityLevel.NORMAL)
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
