package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    PageFactory.initElements(driver, this);
  }
}

