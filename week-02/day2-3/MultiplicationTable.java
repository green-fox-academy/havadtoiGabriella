import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Hozz létre egy egész szám típusú, number elnevezésű változót
// Írj egy programot, ami a standard input-ból kér egy számot és
// elmenti azt a number változóban, majd
// kiírja a number változóban megadott számhoz a szorzótáblát
//
// Például ha a number értéke 15, akkor ezt írná ki:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in any numer!");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }
}
