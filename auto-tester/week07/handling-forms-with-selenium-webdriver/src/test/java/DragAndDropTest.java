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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DragAndDropTest {
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
  public void dragAndDropTest() {
    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
    WebElement fromElement = driver.findElement(By.id("draggable"));
    WebElement toElement = driver.findElement(By.id("droppable"));
    Actions builder = new Actions(driver);
    Action dragAndDrop = builder.clickAndHold(fromElement)
        .moveToElement(toElement)
        .release(toElement)
        .build();
    dragAndDrop.perform();
    String backgroundColor = toElement
        .getCssValue("background-color");
    assertThat(backgroundColor)
        .as("Background color should be: rgba(255, 250, 144, 1)")
        .isEqualTo("rgba(255, 250, 144, 1)");

  }
}
