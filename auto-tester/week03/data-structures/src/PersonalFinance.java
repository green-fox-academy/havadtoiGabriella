import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
  /*We are going to represent our expenses in a list containing integers.

Create a list with the following items:
500, 1000, 1250, 175, 800 and 120
Create an application which prints out the answers to the following questions:
How much did we spend?
Which was our greatest expense?
Which was our cheapest spending?
What was the average amount of our spendings? (print this as a float value)
The full output of your main method should be the following:

3845
1250
120
640.8333
   */
  public static void main(String[] args) {
    List<Integer> myExpanses = Arrays.asList(500, 1000, 1250, 175, 800, 120);
    int sumOfExpanses = 0;
    for (int i = 0; i < myExpanses.size(); i++) {
      sumOfExpanses += myExpanses.get(i);
    }
    System.out.println(sumOfExpanses);

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < myExpanses.size(); i++) {
      if (myExpanses.get(i) > max) {
        max = myExpanses.get(i);
      }
    }
    System.out.println(max);

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < myExpanses.size(); i++) {
      if (myExpanses.get(i) < min) {
        min = myExpanses.get(i);
      }
    }
    System.out.println(min);

    System.out.println((float) sumOfExpanses / myExpanses.size());
  }
}
