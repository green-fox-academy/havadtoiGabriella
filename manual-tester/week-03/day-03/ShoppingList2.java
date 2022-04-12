import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    /*Reprezentáld az alábbi termékeket és árukat:

Termék	Ár
Tej	1.07
Rizs	1.59
Tojás	3.14
Sajt	12.60
Csirke	9.40
Alma	2.31
Paradicsom	2.58
Krumpli	1.75
Hagyma	1.10

Bob bevásárló listája
Termék	Mennyiség
Tej	3
Rizs	2
Tojás	2
Sajt	1
Csirke	4
Alma	1
Paradicsom	2
Krumpli	1

Alice bevásárló listája
Termék	Mennyiség
Rizs	1
Tojás	5
Csirke	2
Alma	1
Paradicsom	10

Készíts egy alkalmazást, mely megválaszolja az alábbi kérdéseket:
Mennyit fizet Bob?
Mennyit fizet Alice?
Ki vett több rizst?
Ki vett több krumplit?
Ki vett több különböző terméket? (típusok)
Ki vett több terméket? (darab)
}
*/
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Tej", 1.07);
        products.put("Rizs", 1.59);
        products.put("Tojás", 3.14);
        products.put("Sajt", 12.60);
        products.put("Csirke", 9.40);
        products.put("Alma", 2.31);
        products.put("Paradicsom", 2.58);
        products.put("Krumpli", 1.75);
        products.put("Hagyma", 1.10);

        Map<String, Integer> bobsList = new HashMap<>();
        bobsList.put("Tej", 3);
        bobsList.put("Rizs", 2);
        bobsList.put("Tojás", 2);
        bobsList.put("Sajt", 1);
        bobsList.put("Csirke", 4);
        bobsList.put("Alma", 1);
        bobsList.put("Paradicsom", 2);
        bobsList.put("Krumpli", 1);

        Map<String, Integer> alicesList = new HashMap<>();
        alicesList.put("Rizs", 1);
        alicesList.put("Tojás", 5);
        alicesList.put("Csirke", 2);
        alicesList.put("Alma", 1);
        alicesList.put("Paradicsom", 10);

        System.out.printf("Bob's shopping list costs: " + "%.2f ", totalCost(products, bobsList));
        System.out.println();
        System.out.printf("Alice's shopping list costs: " + "%.2f ", totalCost(products, alicesList));
        System.out.println();
        whoBoughtMoreFromOneProduct("Avokádó", bobsList, alicesList);
        whoBoughtMoreTotally(bobsList, alicesList);
        whoBoughtManyDifferentItems(bobsList, alicesList);

    }

    public static Double totalCost(Map<String, Double> products, Map<String, Integer> shoppingList) {
        Double sum = 0.0;
        Double price = 0.0;
        Integer amount = 0;
        for (Map.Entry items : products.entrySet()) {
            for (Map.Entry element : shoppingList.entrySet()) {
                if (items.getKey() == element.getKey()) {
                    price = (double) items.getValue();
                    amount = (Integer) element.getValue();
                    sum += (price * amount);
                }
            }
        }
        return sum;
    }

    public static void whoBoughtMoreFromOneProduct(String what, Map<String, Integer> firstShoppingList, Map<String, Integer> secondShoppingList) {
        Integer amountA = firstShoppingList.get(what);
        Integer amountB = secondShoppingList.get(what);
        if (amountA == null && amountB == null) {
            System.out.println("No one bought " + what + "-(e)t");
        } else if (amountA == null) {
            System.out.println("The second shopping list + has more " + what);
        } else if (amountB == null) {
            System.out.println("The first shopping list has more " + what);
        } else if (amountA > amountB) {
            System.out.println("The first shopping list has more " + what);
        } else {
            System.out.println("The second shopping list + has more " + what);
        }
    }

    public static void whoBoughtManyDifferentItems(Map<String, Integer> firstShoppingList, Map<String, Integer> secondShoppingList) {
        if (firstShoppingList.keySet().size() == secondShoppingList.keySet().size()) {
            System.out.println("They bought the same amount of different items.");
        }
        if (firstShoppingList.keySet().size() > secondShoppingList.keySet().size()) {
            System.out.println("The first person bought many different items.");
        } else if (firstShoppingList.keySet().size() < secondShoppingList.keySet().size()) {
            System.out.println("The second person bought many different items.");
        }
    }

    public static void whoBoughtMoreTotally(Map<String, Integer> firstShoppingList, Map<String, Integer> secondShoppingList) {
        Integer sumForFirstList = 0;
        Integer amountForFirstList = 0;
        for (Map.Entry element : firstShoppingList.entrySet()) {
            sumForFirstList += (Integer) element.getValue();
        }
        Integer sumForSecondList = 0;
        Integer amountForSecondList = 0;
        for (Map.Entry element : secondShoppingList.entrySet()) {
            sumForSecondList += (Integer) element.getValue();
        }
        if (sumForFirstList == sumForSecondList) {
            System.out.println("They bought the same amount of items.");
        } else if (sumForFirstList > sumForSecondList) {
            System.out.println("The first person bought more items.");
        } else if (sumForFirstList < sumForSecondList) {
            System.out.println("The second person bought more items.");
        }
    }

}