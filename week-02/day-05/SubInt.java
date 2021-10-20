import java.util.Arrays;

public class SubInt {
    // - Készíts egy függvényt ami bemeneti paraméterként egy számot és egy integer array-t vár.

    // - Visszaadja a bemeneti tömb azon indexeit, ahol a tömb értékei tartalmazzák az első bemeneti értéket.
    // - Vagy egy üres array-t ad vissza, amennyiben az első bemeneti értéket a lista sehol sem tartalmazza.

    /*  Példa:
    System.out.println(Arrays.toString(

    subInt(1,new int[] {
        1, 11, 34, 52, 61
    })));
    //  Eredmény kiíratva: `[0, 1, 4]`
    System.out.println(Arrays.toString(

    subInt(9,new int[] {
        1, 11, 34, 52, 61
    })));
    //  Eredmény kiíratva: '[]'

    // Megjegyzés: Az array kiirattatására használhatjuk az Arrays.toString() függvényt.
    // Vagy használhatjuk a végigiterálást is.
      */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
    }

    public static int[] subInt(int number, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] + "").indexOf(number + "") > -1) {
                count++;
            }
        }

        int j = 0;
        int[] indexes = new int[count];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] + "").indexOf(number + "") > -1) {
                indexes[j] = i;
                j++;
            }
        }
        return indexes;
    }
}