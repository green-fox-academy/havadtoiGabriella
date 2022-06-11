import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.List;
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

  @Test
  public void responseBodyTest() {
    get("/people/5")
        .then()
        .assertThat().statusCode(200).and()
        .body("hair_color", containsString("brown"));
  }

  @Test
  public void responseBodyTest2() {
    get("/starships/9")
        .then()
        .assertThat().statusCode(200).and()
        .body(containsString("Death Star"));
  }

  @Test
  public void responseBodyTest3() {
    Response response = get("/species/5");
    JsonPath js = response.jsonPath();
    List filmArray = js.get("films");
    assertThat(filmArray.size(), equalTo(2));
  }

  @Test
  public void searchForPlanetByNameTest() {
    given()
        .param("search", "Kamino")
        .when()
        .get("/planets")
        .then()
        .log().ifValidationFails()
        .statusCode(200)
        .body("results.terrain", contains("ocean"))
        .and()
        .body("count", equalTo(1));
    ;
  }
}
