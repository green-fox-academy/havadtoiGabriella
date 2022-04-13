package com.gfa.havadtoigabriella;

public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    // make the "a" variable's value bigger by 10
    a += 10;
    System.out.println(a);

    int b = 100;
    // make b smaller by 7
    b -= 7;
    System.out.println(b);

    int c = 44;
    // please double c's value
    c *= 2;
    System.out.println(c);

    int d = 125;
    // please divide by 5 d's value
    d /= 5;
    System.out.println(d);

    int e = 8;
    // please cube of e's value
    e *= e * e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    boolean isBigger = f1 > f2;
    System.out.println(isBigger);

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    boolean isBiggerThanDouble = (g2 * 2) > g1;
    System.out.println(isBiggerThanDouble);

    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)
    boolean canBeDividedBy11 = (h % 11) == 0;
    System.out.println(canBeDividedBy11);

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    boolean isHigherAndSmaller = i1 > (i2 *= i2) && i1 < (i2 * i2 * i2);
    System.out.println(isHigherAndSmaller);

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    boolean isDividable = j % 3 == 0 || j % 5 == 0;
    System.out.println(isDividable);
  }
}
