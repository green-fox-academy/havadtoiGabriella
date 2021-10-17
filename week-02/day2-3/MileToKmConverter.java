import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben
        Scanner scanner = new Scanner(System.in);
        double oneMileInKm = 1.609344;
        System.out.println("Type the distance in mile!");
        double mile = scanner.nextDouble();
        System.out.println("The distance in kilometer: "+ mile * oneMileInKm + " km");

    }
}