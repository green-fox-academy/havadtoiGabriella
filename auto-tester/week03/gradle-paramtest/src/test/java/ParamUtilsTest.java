import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParamUtilsTest {

  @ParameterizedTest
  @ValueSource(strings = {"alfa", "bomb", "edge", "gang", "kayak", "pump", "row"})
  void firstAndLast(String input) {
    assertTrue(ParamUtils.firstAndLast(input));
  }

  @ParameterizedTest
  @CsvSource({"1,1",
      "3,9",
      "7,49",
      "19,361",
      "54,2916",
      "256,65536"})
  void squared(int base, int squared) {
    assertEquals(squared, ParamUtils.squared(base));
  }
}