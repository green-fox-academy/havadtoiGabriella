import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WaitForProgressTest {
  private static WebDriver driver;
  private By downloadModal = By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog-buttons ui-draggable']");
  private By closeButton = By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");

  @BeforeAll
  public void setup() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setUpEachTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void waitForCloseButton() throws InterruptedException {
    driver.get("https://jqueryui.com/resources/demos/progressbar/download.html");
    driver.findElement(By.id("downloadButton")).click();
    assertThat(driver.findElement(downloadModal)
        .isDisplayed())
        .as("The dialog modal should be open.")
        .isTrue();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.textToBe(closeButton, "Close"));
    driver.findElement(closeButton)
        .click();
    assertThat(driver.findElement(downloadModal)
        .isDisplayed())
        .as("The dialog modal should be open.")
        .isFalse();
  }
}