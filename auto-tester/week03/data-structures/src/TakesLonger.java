public class TakesLonger {
  public static void main(String... args) {
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!

    //FIRST ATTEMPT
    StringBuilder str = new StringBuilder(quote);
    int index = quote.indexOf("you");
    str.insert(index, "always takes longer than ");
    System.out.println(str.toString());

    //SECOND ATTEMPT
    int indexOfFirstPartsEnd = quote.indexOf("you");
    int indexOfThirdPart = quote.indexOf("you");

    String firstPart = quote.substring(0, indexOfFirstPartsEnd);
    String secondPart = "always takes longer than ";
    String thirdPart = quote.substring(indexOfThirdPart, quote.length());

    String fullSentence = firstPart + secondPart + thirdPart;
    System.out.println(fullSentence);

    //THIRD ATTEMPT
    String toBeInsterted = "always takes longer than ";
    System.out.println(insertString(quote, toBeInsterted, index - 1));
  }

  public static String insertString(String originalString, String stringToBeInserted, int index) {
    String newString = originalString.substring(0, index + 1) + stringToBeInserted +
        originalString.substring(index + 1);
    return newString;
  }
}
