import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase2 {
    /*
    A termék adatbázisunkat egy asszociatív tömbként(Map) fogjuk reprezentálni, ahol a termék nevek (kulcs) Stringek és azok árai (érték) pedig Integerek.

Készíts egy Map-et az alábbi kulcs-érték párokkal:

Termék név (kulcs)	Ár (érték)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Készíts egy alkalmazást, mely megoldja az alábbi problémákat:

Mely termékek kerülnek kevesebbe mint 201? (csak a név)
Mely termékek kerülnek többe mint 150? (név és ár)
     */
    public static void main(String[] args) {
        Map<String, Integer> productsAndPrices = new HashMap<>();
        productsAndPrices.put("Eggs", 200);
        productsAndPrices.put("Milk", 200);
        productsAndPrices.put("Fish", 400);
        productsAndPrices.put("Apples", 150);
        productsAndPrices.put("Bread", 50);
        productsAndPrices.put("Chicken", 550);
        costLessThan(productsAndPrices, 201);
        costMoreThan(productsAndPrices, 150);
    }

    public static void costLessThan(Map<String, Integer> productsAndPricesList, Integer price) {
        List<String> costLess = new ArrayList<>();
        for (Map.Entry element : productsAndPricesList.entrySet()) {
            if ((Integer) element.getValue() < price) {
                costLess.add((String) element.getKey());
            }
        }
        System.out.println("The items that costs less than " + price + " are: " + costLess);
    }

    public static void costMoreThan(Map<String, Integer> productsAndPricesList, Integer price) {
        List<String> costMore = new ArrayList<>();
        for (Map.Entry element : productsAndPricesList.entrySet()) {
            if ((Integer) element.getValue() > price) {
                costMore.add((String) element.getKey());
            }
        }
        System.out.println("The items that costs more than " + price + " are: " + costMore);
    }
}

