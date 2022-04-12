import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    /*A kiadásainkat egy Integereket tartalmazó listával fogjuk reprezentálni.

    Készíts egy listát az alábbi elemekkel:

            500, 1000, 1250, 175, 800 és 120
    Készíts egy alkalmazást, mely megoldja az alábbi problémákat:

    Mennyit költöttünk?
    Melyik volt a legnagyobb kiadásunk?
    Melyik volt a legkisseb kiadásunk?
    Mennyi volt az átlag kiadásunk?

     */
    public static void main(String[] args) {

        int allCosts = 0;
        List<Integer> costs = Arrays.asList(500, 1000, 1250, 175, 800, 120);
        for (int i = 0; i < costs.size(); i++) {
            allCosts += costs.get(i);
        }
        System.out.println("All costs: " + allCosts);

        int maxCost = 0;
        for (int i = 0; i < costs.size(); i++) {
            if (costs.get(i) > maxCost) {
                maxCost = costs.get(i);
            }
        }
        System.out.println("Maximum cost: " + maxCost);

        int minCost = maxCost;
        for (int i = 0; i < costs.size(); i++) {
            if (costs.get(i) < minCost) {
                minCost = costs.get(i);
            }
        }
        System.out.println("Minimum cost: " + minCost);

        int costsSize = costs.size();
        int averageCost = allCosts / costsSize;
        System.out.println("Average cost: " + averageCost);

    }
}