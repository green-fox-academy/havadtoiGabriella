import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.NxtGenAiAcademyRegistrationPage;
import pages.NxtGenAiAcademySuccessPage;

public class NxtGenAiAcademyRegistrationPageTest extends BaseTest {

  @ParameterizedTest
  @CsvFileSource(resources = "nextGen.csv", numLinesToSkip = 1)
  public void successFullRegistrationTest(String firstName, String lastName, String email,
                                          String verificationNumber) {
    NxtGenAiAcademyRegistrationPage regPage = new NxtGenAiAcademyRegistrationPage(driver);
    regPage.load();
    regPage.fillFirstName(firstName);
    regPage.fillLastName(lastName);
    regPage.pickGenderRandomly();
    regPage.fillEmailField(email);
    regPage.fillVerificationField(verificationNumber);
    NxtGenAiAcademySuccessPage nxtGenAiAcademySuccessPage = regPage.clickSubmitButton();
    assertThat(nxtGenAiAcademySuccessPage.getSuccessMessage())
        .as("Successful registration should give the message: Registration Form is Successfully Submitted")
        .contains("Registration Form is Successfully Submitted.");
  }
}
