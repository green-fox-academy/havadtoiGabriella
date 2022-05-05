package com.gfa.havadtoigabriella;

public class Factorial {
  /*Create a calculate() method in you class which takes an Integer as parameter
It should return the factorial of the number in the parameter
Create a FactorialTest class in your test source
Add a new test case
Instantiate an Object from your class in the test
Use assertThat().isEqualTo() to test the result of the created factorial method
Run the test
   */
  public static int calculate(Integer number) {
    int fact = 1;
    for (int i = 1; i <= number; i++) {
      fact *= i;
    }
    return fact;
  }
}
