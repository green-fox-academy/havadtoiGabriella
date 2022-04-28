package com.gfa.havadtoigabriella;

public class Echo {
  /*
  Create a void function that receives a String as parameter
It should print the string twice to the console
If the string is a null it should throw an Excepton with the message:
the string shouldn't be null
Call the function with a String
Call the function with a null
Handle any raised Exceptions by printing their message to the console
  echo("Hello");
  echo(null);
   */
  public static void echo(String toPrint) {
    try {
      if (toPrint.equals(null)) {
        throw new NullPointerException();
      }
      System.out.println(toPrint + "\n" + toPrint);
    } catch (NullPointerException ex) {
      System.err.println("the string shouldn't be null");
    }
  }
}
