import java.util.Scanner;

public class ArmstrongNumber {
    //Írj egy egyszerű programot, mely egy számot kér, és megmondja a számról, hogy Armstrong szám-e vagy nem.
    // Például ha beírjuk a 371-es számot akkor a programnak a következő formátumban kellene válaszolnia: A 371 egy Armstrong szám.
    //Demonstráljuk egy négy számjegyű számon: 1634 egy 4 jegyű szám,
    // emeljük mind a 4 számjegyet a 4. hatványra és adjuk őket össze: 1^4 + 6^4 + 3^4 + 4^4 = 1634, tehát ez egy Armstrong szám.
    //      Egy 3 számjegyű számnál: 153 egy 3 jegyű szám, emeljük mindegyik számjegyet a 3. hatványra
    //      és adjuk őket össze: 1^3 + 5^3 + 3^3 = 153, szóval ez is egy Armstrong szám.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number and I'll tell you if it's an Armstrong number or not!");
        int number = scanner.nextInt();
        int temporarlyNumber;
        int digitsOfTheNumber = 0;
        int lastDigit = 0;
        int sum = 0;
        temporarlyNumber = number;
        while (temporarlyNumber > 0) {
            temporarlyNumber = temporarlyNumber / 10;
            digitsOfTheNumber++;
        }
        temporarlyNumber = number;
        while (temporarlyNumber > 0) {
            lastDigit = temporarlyNumber % 10;
            sum += (Math.pow(lastDigit, digitsOfTheNumber));
            temporarlyNumber = temporarlyNumber / 10;
        }
        if (number == sum) {
            System.out.println("Armstrong number");
        } else
            System.out.println("Not an Armstrong number");
    }
}