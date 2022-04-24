import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WorkingWithStringsTest {

  @Test
  void countWordsMethodReturnsTheNumberOfWordsInTheGivenSentence() {
    String sentence = "Do or do not, there is no try";
    assertEquals(8, WorkingWithStrings.countWords(sentence));
  }

  @Test
  void countWordsMethodReturnsTheIncorrectNumberOfWordsInTheGivenSentence() {
    String sentence = "Do or do not, there is no try";
    assertNotEquals(6, WorkingWithStrings.countWords(sentence));
  }

  @Test
  void insertMissingWordMethodReturnsFullSentence() {
    assertEquals("Do or do not, there is no try",
        WorkingWithStrings.insertMissingWord("Do or do , there is no try"));
  }

  @Test
  void insertMissingWordMethodNotReturnsFullSentence() {
    String sentence = "Do or do not, there is no try";
    assertNotEquals("Do or do , there is no try",
        WorkingWithStrings.insertMissingWord("Do or do , there is no try"));
  }

  @Test
  void isItContainsUppercaseLettersMethodReturnsTrueCorrectly() {
    String sentence = "Do or do not, there is no try";
    assertEquals(true, WorkingWithStrings.isItContainsUppercaseLetters(sentence));
  }

  @Test
  void isItContainsUppercaseLettersMethodReturnsFalseCorrectly() {
    String sentence = "do or do not, there is no try";
    assertEquals(false, WorkingWithStrings.isItContainsUppercaseLetters(sentence));
  }

  @Test
  void isItContainsUppercaseLettersMethodReturnsFalseWhileSentenceContainsUppercase() {
    String sentence = "Do or do not, there is no try";
    assertNotEquals(false, WorkingWithStrings.isItContainsUppercaseLetters(sentence));
  }

}