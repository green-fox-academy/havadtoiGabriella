import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntroduction {

    /*Készíts egy üres asszociatív tömböt (Map) ahol a kulcsok(keys) integerek és az értékek(values) karakterek.

            Írasd ki hogy a map üres e vagy sem.

    Add hozzá az alábbi kulcs(key) érték(value) párokat a map-hez.

            Kulcs (Key)	Érték (Value)
    97	a
    98	b
    99	c
    65	A
    66	B
    67	C
    Írasd ki az összes kulcsot.

            Írasd ki az összes értéket.

    Add hozzá a D értéket az 68-as kulccsal.

            Írasd ki hány kulcs érték pár van a map-ben.

            Írasd ki a 99-es kulcshoz tartozó értéket.

            Töröld ki azt a kulcs-érték párt, ahol a kulcs 97.

    Írasd ki van-e társítva érték a 100-as kulcshoz vagy sem.

            Távolítsd el az összes kulcs érték párt.

     */
    public static void main(String[] args) {
        Map<Integer, Character> numVal = new HashMap<>();
        System.out.println(numVal.isEmpty());
        numVal.put(97, 'a');
        numVal.put(98, 'b');
        numVal.put(99, 'c');
        numVal.put(65, 'A');
        numVal.put(66, 'B');
        numVal.put(67, 'C');
        System.out.println(numVal.values());
        numVal.put(6, 'D');
        System.out.println(numVal.size());
        System.out.println(numVal.get(99));
        numVal.remove(97);
        System.out.println(numVal.containsKey(100));
        numVal.clear();

    }
}
