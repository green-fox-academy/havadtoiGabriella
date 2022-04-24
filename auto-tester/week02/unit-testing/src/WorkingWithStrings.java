import java.util.Arrays;

public class WorkingWithStrings {
  /*Create a class with the name WorkingWithStrings
Create a static method in your class which has one String parameter. This is the sentence: "Do or do not, there is no try"
The method should count the words in the sentence and return this number as an integer.
Add a new test case for this count method
Examine positive and negative cases
Create another static method with same parameter as before but with this sentence: "Do or do , there is no try"
The method should insert the missing word into the right place and return the correct sentence
Add a new test case for this insert method
Examine positive and negative cases
Create another static boolean method with same parameter and the correct sentence
The method should examine whether the sentence contains uppercase letters or not.
Add a new test case for this insert method
Examine positive and negative cases
   */

  public static int countWords(String sentence) {
    String[] wordArray = sentence.split(" ");
    return wordArray.length;
  }

  public static String insertMissingWord(String sentence) {
    String[] wordArray = sentence.split(" ");
    String[] newArray = new String[wordArray.length];
    String wordToInsert = "not,";
    String toFind = " ,";
    int index = 0;
    for (int i = 0; i < wordArray.length; i++) {
      if (toFind.contains(wordArray[i])) {
        index = i;
      }
    }
    for (int i = 0; i < wordArray.length; i++) {
      newArray[i] = wordArray[i];
      newArray[index] = wordToInsert;
    }
    String fullSentence = String.join(" ", newArray);
    return fullSentence;
  }

  public static boolean isItContainsUppercaseLetters(String sentence) {
    for (int i = 0; i < sentence.length(); i++) {
      if (Character.isUpperCase(sentence.charAt(i))) {
        return true;
      }
    }
    return false;
  }
}
