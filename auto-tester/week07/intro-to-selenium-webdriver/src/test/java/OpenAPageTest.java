import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenAPageTest {

  private static WebDriver driver;

  @BeforeAll
  public static void setup() {
    WebDriverManager.chromedriver().setup();
  }

  @Test
  public void openAPageTest() throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }

}
