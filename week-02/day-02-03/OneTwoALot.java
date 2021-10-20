import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in any number!");
        int number = scanner.nextInt();
        if(number <= 0){
            System.out.println("Not enough!");
        }
        else if(number==1){
            System.out.println("One.");
        }
        else if(number==2){
            System.out.println("Two.");
        }
        else{
            System.out.println("Lot.");
        }
    }
}