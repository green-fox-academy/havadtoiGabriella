import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in two numbers!");
        System.out.print("First the number of girls: ");
        int girls = scanner.nextInt();
        System.out.print("Second the number of boys: ");
        int boys = scanner.nextInt();
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party
        if (girls == 0) {
            System.out.println("This party is boring...");
        } else if (girls + boys > 20 && girls == boys) {
            System.out.println("This party is awesome!");
        }
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        else if (girls + boys > 20 && girls != boys) {
            System.out.println("This party is nice!");
        }
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        else if (girls + boys < 20) {
            System.out.println("This party is average...");
        }

    }
}