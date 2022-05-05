package com.gfa.havadtoigabriella;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnagramTest {

  @ParameterizedTest
  @CsvSource({
      "angel, glean",
      "arc,car",
      "brag,grab",
      "bored,robed",
      "cat,act",
      "dusty,study",
      "night,thing",
      "sadder,dreads"}
  )
  void isAnagramShouldReturnTrueWhenTheGivenStringsAreAnagrams(String first, String second) {
    assertThat(Anagram.isAnagram(first, second)).isTrue();
  }

  @ParameterizedTest
  @CsvSource({
      "apple, glean",
      "robber,car",
      "args,grab",
      "give,robed",
      "arc,act",
      "studi,study",
      "shift,thing",
      "whatever,dreads"}
  )
  void isAnagramShouldReturnFalseWhenTheGivenStringsAreNotAnagrams(String first, String second) {
    assertThat(Anagram.isAnagram(first, second)).isFalse();
  }
}