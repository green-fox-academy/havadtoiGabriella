package com.company;

public class Summing {
  public static void main(String[] args) {
    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
    System.out.println(returnSum(8));
  }

  public static int returnSum(int lastNum) {
    int sum = 0;
    for (int i = 0; i <= lastNum; i++) {
      sum += i;
    }
    return sum;
  }
}
