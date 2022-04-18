package com.gfa.havadtoigabriella;

public class PrintAll {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`
    int[] numbers = {4, 5, 6, 7};
    System.out.print("The elements of the array are: ");
    for (int num : numbers) {
      System.out.print(num + ", ");
    }
  }
}
