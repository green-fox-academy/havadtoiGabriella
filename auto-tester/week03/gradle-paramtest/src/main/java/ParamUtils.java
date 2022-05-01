public class ParamUtils {

  public static boolean firstAndLast(String input) {
    return input.charAt(0) == (input.charAt(input.length() - 1));
  }

  public static int squared(int number) {
    return number *= number;
  }

  public static boolean isPrime(int number) {
    boolean isPrime = (number >= 2) && ((number <= 2) || (number % 2 != 0));
    for (int i = 3; i * i <= number; i += 2) {
      if (number % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
}

