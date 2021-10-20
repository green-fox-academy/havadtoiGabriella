public class Anagram {
    private static int CHARACTER_RANGE = 256;

    public static void main(String[] args) {
        System.out.println(isAanagram("god", "dog"));
    }

    public static boolean isAanagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}