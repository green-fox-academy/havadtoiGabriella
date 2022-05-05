package com.gfa.havadtoigabriella;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {

  @ParameterizedTest
  @CsvSource({
      "5,120",
      "6,720",
      "7,5040",
      "8,	40320",
      "9,	362880",
      "10,	3628800",
      "11,	39916800"})
  void calculateShouldReturnCorrectFactorial(int number, int expected) {
    assertThat(Factorial.calculate(number)).isEqualTo(expected);
  }
}