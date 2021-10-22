import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    /*Készíts egy listát ('listA') mely tartalmazza a következő értékeket:

    Apple, Avocado, Blueberries, Durian, Lychee
    Készíts egy új listát listB névvel amely a listA értékeit tartalmazza.

    Írattasd ki hogy a listA tartalmazza-e a Durian-t vagy sem.

    Távolítsd el a Durian-t a listB-ből.

    Add hozzá a Kivifruit-ot a listA 4. eleme utánn.

    Hasonlítsd össze listA és listB méretét.

    Keresd meg az Avocado indexét a listA-ban.

    Keresd meg az Durian indexét a listB-ban.

    Add hozzá a listB-hez a Passion Fruit-ot és a Pomelo-t egyszerre.

    Írasd ki a listA 3. elemét.

     */
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        List<String> listB = new ArrayList<>(listA);
        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kivifruit");
        if (listA.size() > listB.size()) {
            System.out.println("ListA is bigger.");
        } else {
            System.out.println("ListB is bigger.");
        }
        ;
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        List<String> moreFruits = Arrays.asList("Passion fruit", "Pomelo");
        listA.addAll(moreFruits);
        System.out.println(listA.get(2));
    }
}
