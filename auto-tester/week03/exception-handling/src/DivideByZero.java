public class DivideByZero {
  /*Create a function that divides number 10 by a number that's passed as a paramater and prints the result.
  It should throw an exception with the message "fail" if the division causes an ArithmeticException
   */
  public static void divideTenBy(int number) {
    try {
      double result = 10 / number;
      System.out.println(result);
    } catch (ArithmeticException ex) {
      System.err.println("fail");
    }
  }
}

