import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsInList {
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));
        // Nézd meg a lista tartalmazza-e a következő elemeket: 4,8,12,16
        // Készíts egy függvényt, ami bemeneti paraméterként egy listát vár.
        // Térjen vissza "true"-val ha tartalmazza mindet, és "false"-al ha nem.
    }

    public static boolean checkNums(List<Integer> numList) {
        if (numList.contains(4) && numList.contains(8) && numList.contains(12) && numList.contains(16)) {
            return true;
        }
        return false;
    }
}