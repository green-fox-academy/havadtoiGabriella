package com.gfa.havadtoigabriella;

public class MultiplicationTable {
  public static void main(String[] args) {
    int number = 15;
    multiplicationTable(15);
  }

// Create a program
// that prints the multiplication table with number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150

  public static void multiplicationTable(int number) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + number + " = " + i * number);
    }
  }
}
