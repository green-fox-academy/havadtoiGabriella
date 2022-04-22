public class Swapping {
  /*Create a static method with a parameter of a String array. Fill it with 2 words of your choice. It should return the array after the elements have been swapped.
For example: ["black", "white"], after running the method it returns ["white", "black"]
Follow these steps:
Add a new test case
create an array of Strings
create a 'String result' which is the first or second element of the returned array
use the assertEquals to test whether the result is equal to what you expect
Run them
Create different tests where you test your method with:
length of the array
an empty array
not equals with expected value
Run them
Fix your code if needed
   */
  public static String[] swap(String[] wordArray) {
    if (wordArray.length == 0) {
      throw new ArrayIndexOutOfBoundsException("Array is empty.");
    }
    String temp = wordArray[0];
    wordArray[0] = wordArray[1];
    wordArray[1] = temp;
    return wordArray;
  }
}
