import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    /*A névjegyzékünket egy asszociatív tömbként(Map) fogjuk reprezentálni ahol a nevek és a telefonszámok Stringek.

Készíts egy Map-et az alábbi kulcs-érték párokkal:

Név (kulcs)	Telefonszám (érték)
William A. Lathan	405-709-1865
John K. Miller	402-247-8568
Hortensia E. Foster	606-481-6467
Amanda D. Newland	319-243-5613
Brooke P. Askew	307-687-2982
Készíts egy alkalmazást, mely megoldja az alábbi problémákat:

Mi John K. Miller telefonszáma?
Kinek a száma a 307-687-2982?
Tudjuk-e Chris E. Myer telefonszámát?
}
     */
    public static void main(String[] args) {
        Map<String, String> nameTel = new HashMap<>();
        nameTel.put("William A. Lathan", "405-709-1865");
        nameTel.put("John K. Miller", "402-247-8568");
        nameTel.put("Hortensia E. Foster", "606-481-6467");
        nameTel.put("Amanda D. Newland", "319-243-5613");
        nameTel.put("Brooke P. Askew", "307-687-2982");
        System.out.println(getTelephoneNumber("John K. Miller", nameTel));
        System.out.println(getNameFromNumber("307-687-2982", nameTel));
        System.out.println(getTelephoneNumber("Chris E. Myer", nameTel));

    }


    public static String getTelephoneNumber(String name, Map<String, String> telBook) {
        if (telBook.get(name) != null) {
            return telBook.get(name);
        }
        return "This name is not found in the book";
    }

    public static String getNameFromNumber(String number, Map<String, String> telBook) {
        for (String key : telBook.keySet()) {
            if (number.equals(telBook.get(key))) {
                return key;
            }
        }
        return "This number is not found in the book";
    }

}