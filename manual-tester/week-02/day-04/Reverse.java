public class Reverse {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
// - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit
        int[] numbers = {4, 5, 6, 7};
        int j = numbers.length;
        int a, b;
        for (int i = 0; i < j / 2; i++) {
            b = numbers[i];
            numbers[i] = numbers[j - i - 1];
            numbers[j - i - 1] = b;
        }
        System.out.print("Reversed array is: ");
        for (a = 0; a < j; a++) {
            System.out.print(numbers[a] + ", ");
        }
    }
}

