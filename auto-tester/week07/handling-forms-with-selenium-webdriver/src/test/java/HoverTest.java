import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HoverTest {
  private static WebDriver driver;

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
  public void hoverTest() throws InterruptedException {
    driver.get("http://the-internet.herokuapp.com/hovers");
    Actions hover = new Actions(driver);
    WebElement secondFigure = driver.findElement(By.xpath("//*[contains(@class, 'figure')]/following-sibling::div[1]"));
    hover.moveToElement(secondFigure);
    hover.build().perform();
    assertThat(driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/h5")).isDisplayed());
    assertThat(driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/a")).getText()).isEqualTo("View profile");
  }
}