import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrueOrFalseTest {

  @Test
  void isGreaterMethodReturnsTrueWhenFirstNumberGreaterThanSecond() {
    int first = 12;
    int second = 6;
    assertTrue(TrueOrFalse.isGreater(first,second));
  }

  @Test
  void isGreaterMethodReturnsFalseWhenFirstNumberSmallerThanSecond() {
    int first = 12;
    int second = 26;
    assertFalse(TrueOrFalse.isGreater(first,second));
  }

}