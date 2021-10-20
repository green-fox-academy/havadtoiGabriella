import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen négyzetet rajzol:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// A négyzetnek annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number)
                    System.out.print("%");
                else if (j == 1 || j == number)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}