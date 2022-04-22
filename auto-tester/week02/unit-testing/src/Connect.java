public class Connect {
  /*Create a static method in your class which has two String parameter
The method should connect the two parameterized String into one String and return this String.
Follow these steps:
Add a new test case
create two String
use the assertEquals to test the result of the created method
Run them
Create different test where you test the result of your method does not equal with expected value
Run them
Fix your code if needed
   */

  public static String concatStrings(String first, String second) {
    String trimmedFirst = first.trim();
    String trimmedSecond = second.trim();
    String concatenatedString = trimmedFirst + trimmedSecond;
    return concatenatedString;
  }
}
