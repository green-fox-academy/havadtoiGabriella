package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Type in a number, how big the diamond should be!");
    int sizeOfDiamond = scanner.nextInt();
    int lineCount;
    if (sizeOfDiamond % 2 != 0) {
      lineCount = sizeOfDiamond / 2 + 1;
    } else {
      lineCount = sizeOfDiamond / 2;
    }
    for (int i = 1; i <= lineCount; i++) {
      for (int j = 0; j < lineCount - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
    for (int i = lineCount - 1; i >= 1; i--) {
      for (int j = 0; j < lineCount - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}

