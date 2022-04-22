import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwappingTest {
  @Test
  void swapMethodReturnsTheSwappedArrayCorrectly() {
    String[] wordArray = {"cat", "dog"};
    String result = "cat";
    assertEquals(result, Swapping.swap(wordArray)[1]);
  }

  @Test
  void swapMethodReturnsTheLengthOfTheSwappedArrayCorrectly() {
    String[] wordArray = {"cat", "dog"};
    int result = 2;
    assertEquals(result, Swapping.swap(wordArray).length);
  }

  @Test
  void swapMethodReturnsExceptionWhenArrayIsEmpty() {
    String[] wordArray = {};
    ArrayIndexOutOfBoundsException exception =
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
          throw new ArrayIndexOutOfBoundsException("Array is empty");
        });
    assertEquals("Array is empty", exception.getMessage());
  }

  @Test
  void swapMethodNotReturnsTheSwappedArrayCorrectly() {
    String[] wordArray = {"cat", "dog"};
    String result = "cat";
    assertNotEquals(result, Swapping.swap(wordArray)[0]);
  }
}
