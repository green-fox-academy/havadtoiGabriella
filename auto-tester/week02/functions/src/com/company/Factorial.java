package com.company;

public class Factorial {
  public static void main(String[] args) {
    // - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
    System.out.println(calculateFactorial(11));
  }

  public static int calculateFactorial(int number) {
    int fact = 1;
    for (int i = 1; i <= number; i++) {
      fact *= i;
    }
    return fact;
  }
}
