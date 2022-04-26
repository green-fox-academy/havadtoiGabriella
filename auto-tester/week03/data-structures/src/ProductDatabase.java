import java.util.Map;

public class ProductDatabase {
  /*Create a map with the following key-value pairs:

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which prints out the answers to the following questions:

How much is the fish?
What is the most expensive product?
What is the average price?
How many products' price is below 300?
Is there anything we can buy for exactly 125?
What is the cheapest product?
The full output of your main method should be the following:

400
Chicken
258.33334
4
no
Bread
   */
  public static void main(String[] args) {
    Map<String, Integer> products = Map.of(
        "Eggs", 200,
        "Milk", 200,
        "Fish", 400,
        "Apples", 150,
        "Bread", 50,
        "Chicken", 550);
    System.out.println(howMuchDoesItCost("Fish", products));
    System.out.println(mostExpensive(products));
    System.out.println(avgPrice(products));
    System.out.println(howManyUnder300(products));
    System.out.println(isThereAnythingForThisExactPrice(125, products));
    System.out.println(cheapestProduct(products));
  }

  public static int howMuchDoesItCost(String product, Map<String, Integer> productsList) {
    int price = productsList.get(product);
    return price;
  }

  public static String mostExpensive(Map<String, Integer> productsList) {
    int max = Integer.MIN_VALUE;
    String theMostExpensive = "";
    for (Map.Entry items : productsList.entrySet()) {
      if ((int) items.getValue() > max) {
        max = (int) items.getValue();
        theMostExpensive = (String) items.getKey();
      }
    }
    return theMostExpensive;
  }

  public static double avgPrice(Map<String, Integer> productsList) {
    int sum = 0;
    for (Map.Entry items : productsList.entrySet()) {
      sum += (int) items.getValue();
    }
    double avg = (double) sum / productsList.size();
    return avg;
  }

  public static int howManyUnder300(Map<String, Integer> productsList) {
    int count = 0;
    for (Map.Entry items : productsList.entrySet()) {
      if ((int) items.getValue() < 300) {
        count++;
      }
    }
    return count;
  }

  public static String isThereAnythingForThisExactPrice(int price, Map<String, Integer> productsList) {
    boolean isThereAProduct = false;
    for (Map.Entry items : productsList.entrySet()) {
      if ((int) items.getValue() == price) {
        isThereAProduct = true;
      }
    }
    return isThereAProduct ? "yes" : "no";
  }

  public static String cheapestProduct(Map<String, Integer> productsList) {
    int min = Integer.MAX_VALUE;
    String theCheapest = "";
    for (Map.Entry items : productsList.entrySet()) {
      if ((int) items.getValue() < min) {
        min = (int) items.getValue();
        theCheapest = (String) items.getKey();
      }
    }
    return theCheapest;
  }

}
