public class PrintAll {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` nevű tömb összes elemét
        int[] numbers = {4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

    }
}
