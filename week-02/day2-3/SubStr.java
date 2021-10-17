import  java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        // Írj egy függvényt (function-t) ami 2 string paramétert vár
        // Térjen vissza (return) egy index-szel, ami megmondja,
        // hogy az első paraméterként megadott változóban
        // hanyadik karaktertől fordul elő a második paraméterként megadott string.
        // -1-gyel tér vissza (return) ha nem található meg a második paraméter
        // az első paraméterként megadott string-ben

        // Például:

        // Az eredmény: 17, mert a 'searching' a 17. indextől található meg.
        System.out.println(subStr("this is what I'm searching in", "searching"));

        // Az eredmény: -1, mert nem található meg benne
        System.out.println(subStr("where is the big white cat", "cat"));
    }

    public static int subStr(String input, String q) {
        String line = input;
        int intIndex = line.indexOf(q);
        if (intIndex != -1) {
            return intIndex;
        } else
            return -1;
        }
    }

