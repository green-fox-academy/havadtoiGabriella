import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {

        // - Készíts egy függvényt ami bemeneti paraméterként egy integer array-t vár.
        // - A függvény térjen vissza egy olyan listával ahol az összes szám csak egyszer fordul elő.

        //  Példa
        System.out.println((Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}))));
        //  Eredmény kiíratva: `[1, 11, 34, 52, 61]`
    }

    public static int [] unique(int[] input) {
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (i != j && input[i] == input[j]) {
                    counter++;
                }
            }
        }

        int[] tempA = new int[counter];
        int j = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i + 1]) {
                tempA[j++] = input[i];
            }
        }
        return tempA;
    }
}