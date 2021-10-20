import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból.
// Amennyi az első szám értéke volt, annyiszor kell új számot kérnie.
// Ha megkapta az összes számot, printelje ki az összegét és
// az átlagát ezeknek a számoknak a következő formátumban:
//
// Összeg: 22, Átlag: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int firstNumber = scanner.nextInt();
        System.out.println("You need to enter " + firstNumber + " more number!");
        int amount = 0;
        for (int i = 0; i < firstNumber; i++) {
            int secondNumber = scanner.nextInt();
            amount += secondNumber;
        }
        double average = (double)amount / (double)firstNumber;
        System.out.println("Amount: " + amount + ", Average: " + average);
    }
}
