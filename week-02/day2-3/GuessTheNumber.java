import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot
        Scanner scanner = new Scanner(System.in);
        int number = 140;
        System.out.println("Type in any number!");
        int userNumber;
        do {
            userNumber = scanner.nextInt();
            if (userNumber < number) {
                System.out.println("The stored number is bigger, guess again!");
            } else if (userNumber > number) {
                System.out.println("The stored number is smaller, guess again!");
            }
        }
        while (userNumber != number);
        if (userNumber == number) {
            System.out.println("You guessed the number!");
        }
    }
}

