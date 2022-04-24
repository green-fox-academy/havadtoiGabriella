public class TodoPrint {
  public static void main(String... args) {
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the `todoText`
    // Add " - Download games" to the end of the `todoText`
    // Add " - Diablo" to the end of the `todoText` applying indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //  - Diablo

    //FIRST ATTEMPT
    String first = "My todo:\n";
    String second = " - Download games\n";
    String third = " - Diablo\n";

    todoText = "My todo:\n" + todoText;
    todoText = todoText.concat(second);
    todoText = todoText.concat(third);
    System.out.println(todoText);

    //SECOND ATTEMPT
//    String before = "My todo:\n";
//    String after = " - Download games\n";
//    String theEnd = " - Diablo";
//
//    StringBuilder str = new StringBuilder(todoText.toString());
//    str.insert(0, before);
//    str.insert(str.length(), after);
//    str.insert(str.length(), theEnd);
//    System.out.println(str);
  }
}

