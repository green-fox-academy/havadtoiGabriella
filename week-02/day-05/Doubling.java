public class Doubling {
    public static void main(String[] args) {
// - Hozz létre egy `baseNum` nevű integer változót, aminek az értéke legyen `123`.

// - Készíts egy függvényt `doubling` névvel, mely megduplázza a függvény
//   bemeneti paraméterét és integer-ként adja vissza(return).

// - Írasd ki a visszatérési értékét a `doubling(baseNum)` függvénynek.
        int baseNum = 123;
        System.out.println(doubling(baseNum));
    }

    public static Integer doubling(Integer number) {
        return number *= 2;
    }

}


