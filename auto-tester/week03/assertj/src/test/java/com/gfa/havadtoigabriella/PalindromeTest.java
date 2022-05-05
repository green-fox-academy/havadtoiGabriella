package com.gfa.havadtoigabriella;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PalindromeTest {

  /*Use isEqualTo(), .startsWith() and .endsWith() to create three test cases for your function.
Test your function with an empty string.
   */
  @Test
  void createPalindromeShouldReturnPalindromeWhenGivenWordIsPalindrome() {
    assertThat(Palindrome.createPalindrome("Anna")).isEqualTo("AnnaannA");
  }

  @Test
  void createdWordShouldStartWithGivenWord() {
    assertThat(Palindrome.createPalindrome("cat")).startsWith("cat");
  }

  @Test
  void createdWordShouldEndWithGivenWordBackwards() {
    assertThat(Palindrome.createPalindrome("cat")).endsWith("tac");
  }

  @Test
  void createPalindromeMethodWithEmptyStringShouldReturnEmptyString() {
    assertThat(Palindrome.createPalindrome("")).isEmpty();
  }
}