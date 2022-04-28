package com.gfa.havadtoigabriella;

public class DoubleIndex {
  /*Create a function that takes an int[] array and an int as parameters
It should multiply the value at the index provided in the second parameter by two
And return the multiplied value
If the index doesn't exist it should return -1
And not throw an exception
   */
  public static void main(String[] args) {
    int[] myArray = {1, 2, 4, 6, 12};
    System.out.println(doubleIndex(myArray, 12));
  }

  public static int doubleIndex(int[] numArray, int index) {
    try {
      int value = numArray[index] * 2;
      return value;
    } catch (IndexOutOfBoundsException ex) {
      return -1;
    }
  }
}
