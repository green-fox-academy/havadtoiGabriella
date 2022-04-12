import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String... args) {
        List<String> animals = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Készíts egy függvényt `appendA()` névvel ami hozzáad egy `a`
        // betűt az animals lista összes eleméhez.
        // A listát a függvény paraméterként fogadja

        // A várt eredmény: "boa", "anaconda", "koala", "panda", "zebra"
        System.out.println((appendA(animals)));
    }

    public static List appendA(List<String> listToAppend) {
        List<String> plusA = new ArrayList<String>();
        String newWord;
        for (int i = 0; i < listToAppend.size(); i++) {
            newWord = listToAppend.get(i) + "a";
            plusA.add(i, newWord);
        }
        return plusA;
    }
}
