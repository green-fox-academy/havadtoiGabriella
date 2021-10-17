import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in two numbers!");
        System.out.print("First: ");
        int firstNumber=scanner.nextInt();
        System.out.print("Second: ");
        int secondNumber=scanner.nextInt();
        if(secondNumber<firstNumber){
            System.out.println("The second number must be bigger than the first one!");
        }
        else{
            for (int i = firstNumber; i < secondNumber; i++) {
                System.out.println(i);
            }
        }
    }
}
    // Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5

