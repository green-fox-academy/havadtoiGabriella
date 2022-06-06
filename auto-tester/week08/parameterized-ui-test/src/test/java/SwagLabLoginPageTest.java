import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.SwagLabLoginPage;

public class SwagLabLoginPageTest extends BaseTest {

  @ParameterizedTest
  @Description("Testing unsuccessful registrations with invalid data from csv.file")
  @Severity(SeverityLevel.CRITICAL)
  @CsvFileSource(resources = "source.csv", numLinesToSkip = 1)
  public void invalidDataLoginTest(String username, String password) {
    SwagLabLoginPage loginPage = new SwagLabLoginPage(driver);
    loginPage.load();
    loginPage.fillUserNameField(username);
    loginPage.fillPasswordField(password);
    loginPage.clickLoginButton();
    assertThat(loginPage.getErrorMessage())
        .as("With invalid data input, the error message should be: Epic sadface: Username and password do not match any user in this service")
        .contains("Epic sadface: Username and password do not match any user in this service");
  }

}
