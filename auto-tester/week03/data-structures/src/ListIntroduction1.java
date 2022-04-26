import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
  public static void main(String[] args) {
    /*Create an empty list which will contain names (strings)
Print out the number of elements in the list
Add "William" to the list
Print out whether the list is empty or not
Add "John" to the list
Add "Amanda" to the list
Print out the number of elements in the list
Print out the 3rd element
Iterate through the list and print out each name
Iterate through the list and print with indexes
Remove the 2nd element
Iterate through the list in a reversed order and print out each name
Remove all elements
Print out the number of elements in the list

     */
    List<String> names = new ArrayList<>();
    System.out.println(names.size());
    names.add("William");
    System.out.println(names.isEmpty());
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));
    for (String name : names) {
      System.out.println(name);
    }
    for (int i = 0; i < names.size(); i++) {
      System.out.println(i + 1 + "." + names.get(i));
    }
    names.remove(1);
    for (int i = names.size() - 1; i >= 0; i--) {
      System.out.println(names.get(i));
    }
    names.clear();
    System.out.println(names.size());
  }
}
