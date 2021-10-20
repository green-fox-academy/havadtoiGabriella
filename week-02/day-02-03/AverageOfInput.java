import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
        int amount = 0;
        System.out.println("Enter five whole number!");
        for (int i = 0; i < 5; i++) {
            int numbers = scanner.nextInt();
            amount += numbers;
        }
        double average = (double)amount/5;
        System.out.println("The total amount of your numbers is: " + amount);
        System.out.println("The total amount of your numbers is: " +  average);
    }
}