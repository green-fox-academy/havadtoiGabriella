import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in two numbers!");
        System.out.print("First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Second number: ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        }
        else{
            System.out.println("The bigger number is :" +number2);
        }
    }
}