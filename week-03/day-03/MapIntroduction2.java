import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    /*Készíts egy asszociatív tömböt (Map) ahol a kulcsok (keys) és az értékek (values) Stringek a következő kulcs-érték párokkal:

    Kulcs (Key)	Érték (Value)
    978-1-60309-452-8	A Letter to Jo
    978-1-60309-459-7	Lupus
    978-1-60309-444-3	Red Panda and Moon Bear
    978-1-60309-461-0	The Lab
    Írasd ki az összes kulcs-érték párt a következő formátumba:

    A Letter to Jo (ISBN: 978-1-60309-452-8)
    Lupus (ISBN: 978-1-60309-459-7)
    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    The Lab (ISBN: 978-1-60309-461-0)
    Távolítsd el azt a kulcs-érték párt melynek a kulcsa 978-1-60309-444-3.

    Távolítsd el azt a kulcs-érték párt melynek az értéke The Lab.

    Add hozzá az alábbi kulcs-érték párokat a Map-hez:

    Kulcs (Key)	Érték (Value)
    978-1-60309-450-4	They Called Us Enemy
    978-1-60309-453-5	Why Did We Trust Him?
    Írasd ki van-e érték társítva a 478-0-61159-424-8-as kulcshoz vagy sem.

    Írasd ki a 978-1-60309-453-5- as kulcshoz tartozó értéket.
    }
    */
    public static void main(String[] args) {
        Map<String, String> numberName = new HashMap<>();
        numberName.put("978-1-60309-452-8", "A Letter to Jo");
        numberName.put("978-1-60309-459-7", "Lupus");
        numberName.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        numberName.put("978-1-60309-461-0", "The Lab");
        for (Map.Entry element : numberName.entrySet()) {
            System.out.println(element.getValue() + " " + element.getKey());
        }
        numberName.remove("978-1-60309-444-3");
        numberName.values().remove("The Lab");
        numberName.put("978-1-60309-450-4", "They Called Us Enemy");
        numberName.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(numberName.containsKey("478-0-61159-424-8"));
        System.out.println(numberName.get("978-1-60309-453-5"));

    }
}