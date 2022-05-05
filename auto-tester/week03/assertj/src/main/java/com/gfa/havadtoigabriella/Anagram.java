package com.gfa.havadtoigabriella;

import java.util.Arrays;

public class Anagram {
  /*Create an Anagram class in your project.
Create a function in your class that takes two String parameters.
It should return a boolean value whether they are anagrams or not.
(Use the one you have written in the Functions workshop, if you have it)
Create an AnagramTest class in your test source.
Instantiate an Object from your class in the test
Use .isTrue() and .isFalse() to create two test cases for your function.
   */
  public static boolean isAnagram(String firstWorld, String secondWorld) {
    if (firstWorld.length() != secondWorld.length()) {
      return false;
    }
    char[] firstWorldToArray = firstWorld.toCharArray();
    char[] secondWorldToArray = secondWorld.toCharArray();
    Arrays.sort(firstWorldToArray);
    Arrays.sort(secondWorldToArray);
    return Arrays.equals(firstWorldToArray, secondWorldToArray);
  }
}
