import java.util.Arrays;

public class Reverse {
  public static void main(String... args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a string which is passed as parameter
    // Pass the `toBeReversed` variable to this method to check if it works well
    // At first, solve this task using the `charAt()` function
    // Try other solutions when you are done

    System.out.println(reverse(toBeReversed));
  }

  // With charAt
  public static String reverse(String toBeReversed) {
    StringBuilder reversedLine = new StringBuilder();

    for (int i = 0; i < toBeReversed.length(); i++) {
      reversedLine.append(toBeReversed.charAt(toBeReversed.length() - 1 - i));
    }
    return reversedLine.toString();
  }

  //With char array
  private static String reverse2(String toBeReversed) {
    char[] charSentence = toBeReversed.toCharArray();
    char[] newCharSentence = new char[charSentence.length];

    int j = charSentence.length;
    for (int i = 0; i < charSentence.length; i++) {
      newCharSentence[i] = charSentence[j - 1];
      j--;
    }
    String reversedSentence = new String(newCharSentence);
    return reversedSentence;
  }

  // With Stringbuilder
//  public static String reverse3(String line) {
//    StringBuilder newLine = new StringBuilder(line);
//    newLine.reverse();
//    return newLine.toString();
}


