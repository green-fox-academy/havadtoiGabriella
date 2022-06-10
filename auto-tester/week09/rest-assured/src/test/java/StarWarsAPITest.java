import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StarWarsAPITest {

  @BeforeAll
  public void setup() {
    RestAssured.baseURI = "https://swapi.dev";
    RestAssured.basePath = "/api";
  }

  @Test
  public void responseTimeTest() {
    get("/people/1")
        .then()
        .time(lessThan(3000L));
  }
}