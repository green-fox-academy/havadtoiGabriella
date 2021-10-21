public class Reverse {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Készíts egy függvényt ami megfordít egy Stringet, amit
        // bemeneti paraméterként kap.
        // Használd a függvényt a "toBeReversed" változón ellenőrzésként.
        // Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
        // opcionálisan akárhogy.

        System.out.println(reverse(toBeReversed));
    }

    public static String reverse(String line) {
        StringBuilder newLine = new StringBuilder(line);
        int j = line.length();
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(j - 1);
            newLine.setCharAt(i, letter);
            j--;
        }
        return newLine.toString();
    }
}
