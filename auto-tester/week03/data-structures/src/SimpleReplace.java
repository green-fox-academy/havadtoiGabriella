public class SimpleReplace {

  public static void main(String... args) {
    String example = "In a dishwasher far, far away";
    String correctSentence = example.replace("dishwasher", "galaxy");

    // I would like to replace "dishwasher" with "galaxy" in this `example` variable
    // but there is an issue in the code above
    // Please fix it for me!

    // Expected output: In a galaxy far, far away
    System.out.println(correctSentence);
  }
}
