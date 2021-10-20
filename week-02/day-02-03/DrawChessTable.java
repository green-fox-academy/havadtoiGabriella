import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i % 2 != 0)
                    System.out.print("% ");
                else if (i % 2 == 0)
                    System.out.print(" %");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
