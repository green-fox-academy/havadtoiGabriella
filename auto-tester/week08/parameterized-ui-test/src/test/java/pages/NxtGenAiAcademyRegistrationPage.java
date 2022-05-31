package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NxtGenAiAcademyRegistrationPage extends BasePage {

  public NxtGenAiAcademyRegistrationPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "vfb-5")
  WebElement firstNameField;
  @FindBy(id = "vfb-7")
  WebElement lastNameField;
  @FindBy(id = "vfb-8-1")
  WebElement maleGenderField;
  @FindBy(id = "vfb-8-2")
  WebElement femaleGenderField;
  @FindBy(id = "vfb-3")
  WebElement verificationField;
  @FindBy(id = "vfb-14")
  WebElement emailField;
  @FindBy(id = "vfb-4")
  WebElement submitButton;

  public void load() {
    driver.get("https://nxtgenaiacademy.com/demo-site/");
  }

  public void fillFirstName(String firstName) {
    firstNameField.sendKeys(firstName);
  }

  public void fillLastName(String lastName) {
    lastNameField.sendKeys(lastName);
  }

  public void pickGenderRandomly() {
    getRandomGender().click();
  }

  public void fillEmailField(String email) {
    emailField.sendKeys(email);
  }

  public void fillVerificationField(String verificationNumber) {
    verificationField.sendKeys(verificationNumber);
  }

  public NxtGenAiAcademySuccessPage clickSubmitButton() {
    submitButton.click();
    return new NxtGenAiAcademySuccessPage(driver);
  }


  private WebElement getRandomGender() {
    List<WebElement> list = new ArrayList<>();
    list.add(maleGenderField);
    list.add(femaleGenderField);
    Random r = new Random();
    return (list.get(r.nextInt(list.size())));
  }

}
