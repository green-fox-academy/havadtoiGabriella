import java.util.Map;

public class TelephoneBook {
  /*We are going to represent our contacts in a map where both the keys and values are strings.

Create a map with the following key-value pairs:

Name (key)	Phone number (value)
William A. Lathan	405-709-1865
John K. Miller	402-247-8568
Hortensia E. Foster	606-481-6467
Amanda D. Newland	319-243-5613
Brooke P. Askew	307-687-2982
Create an application which prints out the answers to the following questions:

What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number? (yes/no)
The full output of your main method should be the following:

402-247-8568
Brooke P. Askew
no
   */

  public static void main(String[] args) {
    Map<String, String> telephoneBook =
        Map.of("William A. Lathan", "405-709-1865",
            "John K. Miller", "402-247-8568",
            "Hortensia E. Foster", "606-481-6467",
            "Amanda D. Newland", "319-243-5613",
            "Brooke P. Askew", "307-687-2982");
    System.out.println(getTelephoneNumber("John K. Miller", telephoneBook));
    System.out.println(getNameFromNumber("307-687-2982", telephoneBook));
    System.out.println(getTelephoneNumber("Chris E. Myers", telephoneBook));

  }

  public static String getTelephoneNumber(String name, Map<String, String> telBook) {
    if (telBook.get(name) != null) {
      return telBook.get(name);
    }
    return "no";
  }

  public static String getNameFromNumber(String number, Map<String, String> telBook) {
    for (String key : telBook.keySet()) {
      if (number.equals(telBook.get(key))) {
        return key;
      }
    }
    return "no";
  }

}
