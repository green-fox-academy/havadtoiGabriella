import java.util.Arrays;

public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println((createPalindrome("alpinista")));
    }

    public static String createPalindrome(String a) {

        char[] arrA = a.toCharArray();
        char[] arrB = new char[a.length()];
        int j = a.length() - 1;
        for (int i = 0; i < a.length() ; i++) {
            char letter = arrA[i];
            arrB[j] = arrA[i];
            j--;
        }
        String str = new String(arrB);
        String finalWord = a + str;

        return finalWord;
    }
}

