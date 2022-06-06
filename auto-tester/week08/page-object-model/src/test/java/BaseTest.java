import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {

  WebDriver driver;
  protected static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);

  @BeforeEach
  public void setup() throws IOException {
    LOG.info("Setup the driver");
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
  }

  @AfterEach
  public void tearDown() {
    LOG.info("Shut down the driver");
    driver.quit();
  }
}
