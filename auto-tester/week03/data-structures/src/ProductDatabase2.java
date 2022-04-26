import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase2 {
  /*Create a map with the following key-value pairs:

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which prints out the answers to the following questions:

Which products cost less than 201? (just the name)
Which products cost more than 150? (name + price)
The full output of your main method should be the following:

Apples
Eggs
Milk
Bread
Fish 400
Chicken 550
Eggs 200
Milk 200
   */

  public static void main(String[] args) {
    Map<String, Integer> products = Map.of("Eggs", 200,
        "Milk", 200,
        "Fish", 400,
        "Apples", 150,
        "Bread", 50,
        "Chicken", 550);
    costLessThan(201, products);
    costMoreThan(150, products);

  }

  public static void costLessThan(int price, Map<String, Integer> products) {
    List<String> costLessList = new ArrayList<>();
    for (Map.Entry items : products.entrySet()) {
      if ((int) items.getValue() < price) {
        costLessList.add((String) items.getKey());
      }
    }
    for (String costlessItem : costLessList) {
      System.out.println(costlessItem);
    }
  }


  public static void costMoreThan(int price, Map<String, Integer> products) {
    Map<String, Integer> costMoreList = new HashMap<>();
    for (Map.Entry items : products.entrySet()) {
      if ((int) items.getValue() > price) {
        costMoreList.put((String) items.getKey(), (int) items.getValue());
      }
    }
    for (Map.Entry itemsThatCostMore : costMoreList.entrySet()) {
      System.out.println(itemsThatCostMore.getKey() + " " + itemsThatCostMore.getValue());
    }
  }
}
