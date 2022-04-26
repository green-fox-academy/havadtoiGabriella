import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  /*We are going to represent a shopping list by a list containing strings.

Create a list with the following items:
eggs, milk, fish, apples, bread and chicken
Create an application which prints out the answers to the following questions:
Do we have milk in the shopping list? (yes/no)
Do we have bananas in the shopping list? (yes/no)
The full output of your main method should be the following:

yes
no
   */
  public static void main(String[] args) {
    List<String> shoppingList = Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken");
    isThisOnTheList("milk", shoppingList);
    isThisOnTheList("bananas", shoppingList);
  }

  private static void isThisOnTheList(String item, List<String> shoppingList) {
    System.out.println(shoppingList.contains(item) ? "yes" : "no");
  }
}
