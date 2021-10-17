import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon
        System.out.println("How many chicken do you have on the farm?");
        int numbersOfHens = scanner.nextInt();
        System.out.println("How many pigs do you have on the farm?");
        int numbersOfPigs = scanner.nextInt();
        System.out.println("The total number of your animals leg on the farm is : " + ((numbersOfHens * 2) + (numbersOfPigs * 4)));

    }
}