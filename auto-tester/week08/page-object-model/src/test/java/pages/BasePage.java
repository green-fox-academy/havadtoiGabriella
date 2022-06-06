package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;
  protected static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

  public BasePage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    PageFactory.initElements(driver, this);
  }
}

