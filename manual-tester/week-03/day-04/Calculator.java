import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Készíts egy egyszerű számológépet ami beolvassa a paramétereket a parancssorból és kiírja azokat.
        // A függvény neve legyen "calculate()" és támogassa a következő műveleteket:
        // +, -, *, /, %
        // két számmal.
        // A formátum legyen a következő: {művelet} {szám1} {szám2}.
        // Példák: "+ 3 3" (eredmény 6) vagy "* 4 4" (eredmény 16)

        // Használd a Scanner osztályt
        // Folyamat:

        // A program elindul
        // A program kiírja: "Please type in the expression:"
        // Várakozás a felhasználói input-ra
        // A program kiírja az eredményt
        // Kilépés
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression:");
        String expression = scanner.nextLine();
        String[] array = expression.split(" ");
        String operator = array[0];
        int firstNumber = Integer.parseInt(array[1]);
        int secondNumber = Integer.parseInt(array[2]);
        if (operator.equals("+")) {
            System.out.println("The result is: " + (firstNumber + secondNumber));
        } else if (operator.equals("*")) {
            System.out.println("The result is: " + (firstNumber * secondNumber));
        } else if (operator.equals("/")) {
            System.out.println("The result is: " + (firstNumber / secondNumber));
        } else if (operator.equals("%")) {
            System.out.println("The result is: " + (firstNumber % secondNumber));
        }
    }
}