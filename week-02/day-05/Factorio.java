public class Factorio {
    public static void main(String[] args) {
        // - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.
        System.out.println(factorio(10));
    }

    public static int factorio(int number) {
        int fact = number;
        for (int i = 1; i < number; i++) {
            fact *= i;
        }
        return fact;
    }
}
