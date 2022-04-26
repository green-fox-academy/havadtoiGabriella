import java.util.Map;

public class ShoppingList2 {
  /*Represent the following products with their prices:

Product	Price
Milk	1.07
Rice	1.59
Eggs	3.14
Cheese	12.60
Chicken Breasts	9.40
Apples	2.31
Tomato	2.58
Potato	1.75
Onion	1.10

Represent Bob's shopping list:
Product	Amount
Milk	3
Rice	2
Eggs	2
Cheese	1
Chicken Breasts	4
Apples	1
Tomato	2
Potato	1

Represent Alice's shopping list:
Product	Amount
Rice	1
Eggs	5
Chicken Breasts	2
Apples	1
Tomato	10
Create an application which prints out the answers to the following questions:

How much does Bob pay?
How much does Alice pay?
Who buys more Rice?
Who buys more Potato?
Who buys more Ham?
Who buys more Apples?
Who buys more of different products?
Who buys more items? (more pieces)
The full output of your main method should be the following:

72.09
64.2
Bob
Bob
no one
no one
Bob
Alice
   */
  public static void main(String[] args) {
    Map<String, Double> priceList = Map.of(
        "Milk", 1.07,
        "Rice", 1.59,
        "Eggs", 3.14,
        "Cheese", 12.60,
        "Chicken Breasts", 9.40,
        "Apples", 2.31,
        "Tomato", 2.58,
        "Potato", 1.75,
        "Onion", 1.10);

    Map<String, Integer> bobsList = Map.of(
        "Milk", 3,
        "Rice", 2,
        "Eggs", 2,
        "Cheese", 1,
        "Chicken Breasts", 4,
        "Apples", 1,
        "Tomato", 2,
        "Potato", 1);

    Map<String, Integer> alicesList = Map.of(
        "Rice", 1,
        "Eggs", 5,
        "Chicken Breasts", 2,
        "Apples", 1,
        "Tomato", 10);

    System.out.println(howMuchDoesItCost(bobsList, priceList));
    System.out.println(howMuchDoesItCost(alicesList, priceList));
    System.out.println(whoBuysMoreFromWhat("Rice", bobsList, alicesList));
    System.out.println(whoBuysMoreFromWhat("Potato", bobsList, alicesList));
    System.out.println(whoBuysMoreFromWhat("Ham", bobsList, alicesList));
    System.out.println(whoBuysMoreFromWhat("Apple", bobsList, alicesList));
    System.out.println(whoBuysMoreDifferentProduct(bobsList, alicesList));
    System.out.println(whoBuysMoreItems(bobsList, alicesList));
  }

  public static Double howMuchDoesItCost(Map<String, Integer> shoppingList,
                                         Map<String, Double> priceList) {
    double sum = 0.0;
    double price;
    int amount;
    for (Map.Entry items : priceList.entrySet()) {
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

  public static String whoBuysMoreFromWhat(String item, Map<String, Integer> bobsList,
                                           Map<String, Integer> alicesList) {
    if (!bobsList.containsKey(item) && !alicesList.containsKey(item)) {
      return "no one";
    } else if (!bobsList.containsKey(item)) {
      return "Alice";
    } else if (!alicesList.containsKey(item)) {
      return "Bob";
    } else {
      int amountFromFirstList = bobsList.get(item);
      int amountFromSecondList = alicesList.get(item);
      return amountFromFirstList > amountFromSecondList ? "Bob" : "Alice";
    }
  }

  public static String whoBuysMoreDifferentProduct(Map<String, Integer> bobsList,
                                                   Map<String, Integer> alicesList) {
    int bobsListSize = bobsList.size();
    int alicesListSize = alicesList.size();
    return bobsListSize > alicesListSize ? "Bob" : "Alice";
  }

  public static String whoBuysMoreItems(Map<String, Integer> bobsList,
                                        Map<String, Integer> alicesList) {
    int amountBob = 0;
    int amountAlice = 0;
    for (Map.Entry items : bobsList.entrySet()) {
      amountBob += (int) items.getValue();
    }
    for (Map.Entry element : alicesList.entrySet()) {
      amountAlice += (int) element.getValue();
    }
    return amountBob > amountAlice ? "Bob" : "Alice";
  }
}