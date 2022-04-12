public class ChangeElements {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[1, 2, 3, 8, 5, 6]`
// - Változtasd meg a 8-ast 4-esre
// - Írasd ki a konzolra a `numbers` nevű tömb negyedik elemét
        int[] numbers = {1, 2, 3, 8, 5, 6};
        numbers[3] = 4;
        System.out.println(numbers[3]);
    }
}
