import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
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

How much is the fish?
Melyik a legdrágább termék?
Mi a termékek átlag ára?
Hány termék ára van 300 alatt?
Van-e olyan termék melyet pontosan 125Ft-ért tudunk megvenni?
Melyik a legolcsóbb termék?
     */

    public static void main(String[] args) {
        Map<String, Integer> productAndPrice = new HashMap<>();
        productAndPrice.put("Eggs", 200);
        productAndPrice.put("Milk", 200);
        productAndPrice.put("Fish", 400);
        productAndPrice.put("Apples", 150);
        productAndPrice.put("Bread", 50);
        productAndPrice.put("Chicken", 550);
        howMuchDoesItCost(productAndPrice, "Fish");
        mostExpensiveProduct(productAndPrice);
        averagePrice(productAndPrice);
        underCertainPrice(productAndPrice, 300);
        isThereAnyItemFor(productAndPrice, 125);
        leastExpensiveProduct(productAndPrice);

    }

    public static void howMuchDoesItCost(Map<String, Integer> itemsAndPriceList, String what) {
        Integer price = 0;
        boolean onTheList = false;
        for (Map.Entry element : itemsAndPriceList.entrySet()) {
            if (element.getKey() == what) {
                onTheList = true;
                price = (Integer) element.getValue();
            }
        }
        if (onTheList) {
            System.out.println("The price for " + what + " is: " + price);
        } else {
            System.out.println(what + " is not on the pricelist.");
        }
    }

    public static void mostExpensiveProduct(Map<String, Integer> itemsAndPriceList) {
        Integer price = 0;
        for (Map.Entry element : itemsAndPriceList.entrySet()) {
            if ((Integer) element.getValue() > price) {
                price = (Integer) element.getValue();
            }
        }
        for (String key : itemsAndPriceList.keySet()) {
            if (price.equals(itemsAndPriceList.get(key))) {
                System.out.println("The most expensive item is : " + key);
            }
        }
    }

    public static void averagePrice(Map<String, Integer> itemsAndPriceList) {
        Integer sum = 0;
        for (Map.Entry element : itemsAndPriceList.entrySet()) {
            sum += (Integer) element.getValue();
        }
        System.out.println("The average price of the list items is: " + (sum / itemsAndPriceList.size()));
    }

    public static void underCertainPrice(Map<String, Integer> itemsAndPriceList, int price) {
        int count = 0;
        for (Map.Entry element : itemsAndPriceList.entrySet()) {
            if ((Integer) element.getValue() < price) {
                count++;
            }
        }
        System.out.println("The number of items under " + price + " is " + count);
    }

    public static void isThereAnyItemFor(Map<String, Integer> itemsAndPriceList, int price) {
        boolean isThereAny = false;
        String item = "";
        for (Map.Entry element : itemsAndPriceList.entrySet()) {
            if ((Integer) element.getValue() == price) {
                isThereAny = true;
                item = (String) element.getKey();
            }
        }
        if (isThereAny) {
            System.out.println("There is an item exactly for " + price + ", which is " + item);
        }
        else{
            System.out.println("There is no item exactly for " + price);
        }
    }

    public static void leastExpensiveProduct(Map<String, Integer> itemsAndPriceList) {
        Integer price = Integer.MAX_VALUE;
        for (Map.Entry element : itemsAndPriceList.entrySet()) {
            if ((Integer) element.getValue() < price) {
                price = (Integer) element.getValue();
            }
        }
        for (String key : itemsAndPriceList.keySet()) {
            if (price.equals(itemsAndPriceList.get(key))) {
                System.out.println("The least expensive item is : " + key);
            }
        }
    }
}
