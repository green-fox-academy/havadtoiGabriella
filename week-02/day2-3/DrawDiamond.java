import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen rombuszt rajzol:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// A rombusznak annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number, how big the diamond should be!");
        int lineCount = scanner.nextInt();
        for (int i = 1; i < lineCount; i += 2){
            for (int j = 0; j < lineCount - 1 - i / 2; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = lineCount; i > 0; i -= 2){
            for (int j = 0; j < lineCount - 1 - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}