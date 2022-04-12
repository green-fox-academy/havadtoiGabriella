public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // Az idézet mentésekor lemezhiba történt. Kérlek, javítsd ki.
        // Add hozzá az "always takes longer than"-t a StringBuilder (quote) -hoz
        // az "It" és a "you" szó közzé.
        // Használd a quote változó darabjait(a String újra definiálása helyett).
        String shorter = quote.replace(" Hofstadter's Law", "");
        int index = quote.indexOf("you");
        String toBeInsterted = "always takes longer than ";
        System.out.println(insertString(shorter, toBeInsterted, index - 1));
    }

    public static String insertString(String originalString, String stringToBeInserted, int index) {
        String newString = originalString.substring(0, index + 1) + stringToBeInserted + originalString.substring(index + 1);
        return newString;
    }

}

