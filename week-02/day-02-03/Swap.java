public class Swap {
    public static void main(String[] args) {
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.
        int a = 123;
        int b = 526;

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }
}
