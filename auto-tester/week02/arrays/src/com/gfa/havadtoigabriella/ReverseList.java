package com.gfa.havadtoigabriella;

public class ReverseList {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`

    int[] numbers = {3, 4, 5, 6, 7};
    int j = numbers.length;
    int temp;
    for (int i = 0; i < j / 2; i++) {
      temp = numbers[i];
      numbers[i] = numbers[j - i - 1];
      numbers[j - i - 1] = temp;
    }
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + ", ");
    }
  }

}