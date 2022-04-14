package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
    Scanner sc = new Scanner(System.in);
    int theNumber = 823;
    System.out.print("Guess a number: ");
    int guessedNumber;
    do {
      guessedNumber = sc.nextInt();
      if (guessedNumber > theNumber) {
        System.out.println("The stored number is lower. Guess again: ");
      }
      if (guessedNumber < theNumber) {
        System.out.println("The stored number is higher. Guess again: ");
      }
    }
    while (guessedNumber != theNumber);
    if (guessedNumber == theNumber) {
      System.out.println("You found the number:  " + theNumber);
    }
  }

}
