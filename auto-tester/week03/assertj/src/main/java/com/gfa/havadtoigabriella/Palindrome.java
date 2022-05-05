package com.gfa.havadtoigabriella;

public class Palindrome {
  /*Create an PalindromeTest class in your test source.
Instantiate an Object from your class in the test
Use isEqualTo(), .startsWith() and .endsWith() to create three test cases for your function.
Test your function with an empty string.
   */
  public static String createPalindrome(String word) {
    char[] wordToArray = word.toCharArray();
    char[] wordBackwardsArray = new char[word.length()];
    int j = word.length() - 1;
    for (int i = 0; i < word.length(); i++) {
      wordBackwardsArray[j] = wordToArray[i];
      j--;
    }
    String wordBackwards = new String(wordBackwardsArray);
    String finalWord = word + wordBackwards;
    return finalWord;
  }
}
