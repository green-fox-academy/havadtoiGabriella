public class Cuboid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000
        double a = 12.5;
        double b = 4.9;
        double c = 8.3;

        double surface = 2 * (a * b) + (a * c) + (b * c);
        double volume = a * b * c;

        System.out.printf("Surface: "+ "%.0f\n", surface);
        System.out.printf("Volume: " + "%.0f", volume);

    }
}
