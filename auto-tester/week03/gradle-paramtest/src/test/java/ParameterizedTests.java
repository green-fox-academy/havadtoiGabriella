import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

  @ParameterizedTest
  @ValueSource(ints = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20})
  void isEvenShouldReturnTrue(int number) {
    assertTrue(Parameterized.isEven(number));
  }
}
