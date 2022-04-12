public class SwapElements {
    public static void main(String[] args) {
        // - Készíts egy `orders` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["first", "second", "third"]`
// - Cseréld fel az első és a harmadik elemet az `orders` tömbben

        String[] orders = {"first", "second", "third"};
        String element = orders[0];
        orders[0] = orders[2];
        orders[2] = element;
        System.out.println(orders[0] + " " + orders[2]);
    }
}
