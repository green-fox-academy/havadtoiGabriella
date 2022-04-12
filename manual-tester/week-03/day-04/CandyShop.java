import java.util.ArrayList;
import java.util.List;

public class CandyShop {
    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Véletlenül hozzáadtunk a listához egy "2"-t és egy "false"-ot.
        // Kérlek javítsd a hibákat, és változtasd a "2"-t "Croissant"-ra a "false"-ot pedig "Ice cream"-re.
        // Ne csak töröld az elemeket.
        // Készíts egy függvényt "sweets()" névvel ami bemeneti paraméterként egy listát vár,
        // és elvégzi a fenti műveleteket!

        System.out.println(sweets(arrayList));
        // Várt eredmény: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    public static List sweets(List<Object> candyList) {
        int indexOf2 = candyList.indexOf(2);
        int indexOfFalse = candyList.indexOf(false);
        candyList.remove(indexOf2);
        candyList.remove(false);
        candyList.add(indexOf2, "Croissant");
        candyList.add(indexOfFalse, "Ice cream");
        return candyList;
    }
}

