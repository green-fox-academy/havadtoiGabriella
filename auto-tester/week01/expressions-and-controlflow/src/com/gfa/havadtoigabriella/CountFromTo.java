package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int firstNumber = sc.nextInt();
    System.out.print("Please enter the second number: ");
    int secondNumber = sc.nextInt();
    if (firstNumber > secondNumber) {
      System.out.println("The second number should be bigger!");
    } else {
      for (int i = firstNumber; i < secondNumber; i++) {
        System.out.println(i);
      }
    }
  }
}
