package com.gfa.havadtoigabriella;

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println((createPalindrome("alpinista")));
  }

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

