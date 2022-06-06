import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

  WebDriver driver;

  @BeforeEach
  public void setup() throws IOException {
    Properties properties = new Properties();
    InputStream resourceAsStream = this.getClass().getResourceAsStream("/test.properties");
    properties.load(resourceAsStream);
    String browser = properties.getProperty("browser");
    if (browser.equals("chrome")) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    } else if (browser.equals("firefox")) {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
    } else {
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @Attachment
  private byte[] takeScreenshot(WebDriver driver) {
    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
  }

  @AfterEach
  public void tearDown() {
    takeScreenshot(driver);
    driver.quit();
  }
}