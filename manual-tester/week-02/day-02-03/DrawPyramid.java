package com.gfa.havadtoigabriella;

public class DrawPyramid {
  public static void main(String[] args) {
    int lineCount = 4;
    drawPyramid(lineCount);
  }


// Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

  public static void drawPyramid(int lineCount) {
    for (int i = 1; i <= lineCount; i++) {
      for (int j = 0; j < lineCount - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 -1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}