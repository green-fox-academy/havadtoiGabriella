public class Index {
  /*Create a static method in your class which has two parameter: an array of integers and one integer as the index
  It should return an integer, exactly the element under the given index from the array. For example, in case of [2,4,7], int index = 2, it returns 7.
  Follow these steps:
  Add a new test case
  create an array of integers
  use the assertEquals to test the result of the created method
  Run them
  Create different tests where you test your method with:
  an empty array
  the array contains only zeros
  not equals with expected value
  Run them
  Fix your code if needed
   */
  public static int findNumberInAnArray(int[] arrayOfIntegers, int index) {
    if (arrayOfIntegers.length == 0) {
      throw new ArrayIndexOutOfBoundsException("Array is empty");
    }
    boolean allZeros = true;
    for (int i = 0; i < arrayOfIntegers.length; i++) {
      if (arrayOfIntegers[i] != 0) {
        allZeros = false;
      }
    }
    if (allZeros) {
      return -1;
    }
    return arrayOfIntegers[index];
  }
}

