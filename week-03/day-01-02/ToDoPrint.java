public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String before = "My todo:\n";
        String after = " - Download games";
        String theEnd = "\n\t - Diablo";

        StringBuilder str = new StringBuilder(todoText.toString());
        str.insert(0, before);
        str.insert(str.length(), after);
        str.insert(str.length(), theEnd);
        System.out.println(str);
    }
}
