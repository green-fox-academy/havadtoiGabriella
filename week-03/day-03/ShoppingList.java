import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    /*Bevásárló lista
Bevásárló listánkat egy listaként (vagy tömbként) fogjuk reprezentálni, mely stringeket (szöveg) tartalmaz.

Készíts egy tömböt az alábbi tételekkel:
tojás, tej, hal, alma, kenyér és csirke
Készíts egy alkalmazást, mely megválaszolja az alábbi kérdéseket:
Van tej a listán?
Van banán a listán?
     */

    public static void main(String[] args) {
        String[] shoppingList = {"tojás", "tej", "hal", "alma", "kenyér", "csirke"};
        isItOnTheList(shoppingList, "tej");
        isItOnTheList(shoppingList, "banán");
    }

    public static void isItOnTheList(String[] list, String product) {
        if (Arrays.asList(list).contains(product)) {
            System.out.println("This product is on the list!");
        } else {
            System.out.println("This product is not yet on the list!");
        }
    }
}
