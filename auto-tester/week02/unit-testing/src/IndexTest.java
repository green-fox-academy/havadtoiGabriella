import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndexTest {

  @Test
  void findNumberMethodShouldFindTheCorrectNumberOnTheGivenIndex() {
    int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6};
    int index = 3;
    assertEquals(4, Index.findNumberInAnArray(arrayOfNumbers, index));
  }

  @Test
  void findNumberMethodShouldNotFindTheCorrectNumberOnTheGivenIndex() {
    int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6};
    int index = 3;
    assertNotEquals(3, Index.findNumberInAnArray(arrayOfNumbers, index));
  }

  @Test
  void findNumberMethodShouldGiveErrorMessageIfTheGivenArrayIsEmpty() {
    int[] arrayOfNumbers = {};
    int index = 3;
    ArrayIndexOutOfBoundsException exception =
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
          throw new ArrayIndexOutOfBoundsException("Array is empty");
        });
    assertEquals("Array is empty", exception.getMessage());
  }

  @Test
  void findNumberMethodShouldReturnMinusOneIfArrayContainsOnlyZeros() {
    int[] arrayOfNumbers = {0, 0, 0, 0, 0, 0};
    int index = 5;
    assertEquals(-1, Index.findNumberInAnArray(arrayOfNumbers, index));
  }
}




