import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
  /*Create an empty map where the keys are integers and the values are characters
Print out whether the map is empty or not
Add the following key-value pairs to the map
Key	Value
97	a
98	b
99	c
65	A
66	B
67	C
Print all the keys
Print all the values
Add value D with the key 68
Print how many key-value pairs are in the map
Print the value that is associated with key 99
Remove the key-value pair with key 97 and print the associated value
Print whether there is an associated value with key 100 or not
Remove all the key-value pairs
Print how many key-value pairs are in the map
The full output of your main method should be the following:

true
[97, 65, 98, 66, 99, 67]
[a, A, b, B, c, C]
7
c
a
false
0
   */
  public static void main(String[] args) {
    Map<Integer, Character> numsWithLetters = new HashMap<>();
    System.out.println(numsWithLetters.isEmpty());
    numsWithLetters.put(97, 'a');
    numsWithLetters.put(98, 'b');
    numsWithLetters.put(99, 'c');
    numsWithLetters.put(65, 'A');
    numsWithLetters.put(66, 'B');
    numsWithLetters.put(67, 'C');
    System.out.println(numsWithLetters.keySet());
    System.out.println(numsWithLetters.values());
    numsWithLetters.put(68, 'D');
    System.out.println(numsWithLetters.size());
    System.out.println(numsWithLetters.get(99));
    System.out.println(numsWithLetters.get(97));
    numsWithLetters.remove(97);
    System.out.println(numsWithLetters.containsKey(100));
    numsWithLetters.clear();
    System.out.println(numsWithLetters.size());
  }
}

