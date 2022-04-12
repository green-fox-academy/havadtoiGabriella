public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        // Ha a páros, növeld az out változó értékét 1-gyel
        if (a % 2 == 0) {
            out++;
        }
        System.out.println(out);


        int b = 13;
        String out2 = "";
        // Ha b 10 és 20 között van, akkor az out2 legyen "Édes!"
        // Ha b kevesebb, mint 10, out2 legyen "Kevés!"
        // Ha b több, mint 20, out2 legyen "Sok!"
        if (b < 20 && b > 10) {
            out2 = "Sweet!";
        } else if (b < 10) {
            out2 = "Not enough!";
        } else if (b > 20) {
            out2 = "Too much!";
        }
        System.out.println(out2);


        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // Ha credits legalább 50,
        // és isBonus hamis, c legyen csökkentve 2-vel
        // Ha credits kisebb, mint 50,
        // és isBonus hamis, c legyen csökkentve 1-gyel
        // Ha isBonus igaz, c ne változzon
        if (credits >= 50 && isBonus == true) {
            c = -2;
        } else if (credits < 50 && isBonus == false) {
            c--;
        } else if (isBonus == true) {
            System.out.println(c);
        }

        System.out.println(c);


        int d = 8;
        int time = 120;
        String out3 = "";
        // Ha d osztható 4-gyel
        // és a time nem több, mint 200
        // out3 legyen "check"
        // Ha time nagyobb, mint 200
        // out3 legyen "Az idő lejárt!"
        // különben out3 legyen "Fuss, Forest, Fuss!"
        if (d % 4 == 0 && time <= 200) {
            out3 = "Check!";
        } else if (time > 200) {
            out3 = "Time's up!";
        } else {
            out3 = "Run, Forest, Run!";
        }

        System.out.println(out3);
    }
}