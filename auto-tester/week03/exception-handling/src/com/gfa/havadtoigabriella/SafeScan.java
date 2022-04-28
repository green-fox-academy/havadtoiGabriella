package com.gfa.havadtoigabriella;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScan {
  /*Create a function that returns an integer
It should read the integer from the console
If the user input is not an integer (mismatch), it should return -1
Catch the specific exception here, not just Exception
   */
  public static void main(String[] args) {
    System.out.println(mismatchFinder());
  }

  public static Integer mismatchFinder() {
    Scanner sc = new Scanner(System.in);
    Integer number;
    try {
      number = sc.nextInt();
      return number;
    } catch (InputMismatchException e) {
      return -1;
    }
  }
}

