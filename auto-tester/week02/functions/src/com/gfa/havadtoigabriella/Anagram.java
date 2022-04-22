package com.gfa.havadtoigabriella;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("dog", "god"));
  }

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
