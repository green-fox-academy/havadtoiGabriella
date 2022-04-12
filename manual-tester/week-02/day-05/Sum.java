public class Sum {
    // - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

    // - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.
    public static void main(String[] args) {
        System.out.println(sum(40));
    }

    public static int sum (int sumUntilThisNumber){
        int a = 0;
        for (int i = 0; i < sumUntilThisNumber; i++) {
            a+=i;
        }
        return a;
    }
}
