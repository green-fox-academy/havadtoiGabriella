import java.util.*;

public class StudentCounter {
    public static void main(String... args) {
        List<Map<String, Object>> listOfMaps = new ArrayList<>();

        Map<String, Object> row0 = new HashMap<>();
        row0.put("name", "Theodor");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        listOfMaps.add(row0);

        Map<String, Object> row1 = new HashMap<>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        listOfMaps.add(row1);

        Map<String, Object> row2 = new HashMap<>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        listOfMaps.add(row2);

        Map<String, Object> row3 = new HashMap<>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        listOfMaps.add(row3);

        Map<String, Object> row4 = new HashMap<>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        listOfMaps.add(row4);

        Map<String, Object> row5 = new HashMap<>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        listOfMaps.add(row5);

        System.out.println(listOfNames(listOfMaps));
        System.out.println(sumOfAge(listOfMaps));

    }

    /*
    Készíts egy függvényt aminek a neve listOfNames(), diákok listáját várja paraméterként és visszaadja a következőt:
        Azok a diákok nevét, akiknek több mint 4 édességük van

     */

    public static List listOfNames(List<Map<String, Object>> studentList) {
        List<Object> students = new ArrayList<Object>();
        int j = 0;
        for (int i = 0; i < studentList.size(); i++) {
            for (HashMap.Entry element : studentList.get(i).entrySet()) {
                if (element.getKey().equals("candies") && (int) element.getValue() > 4) {
                    students.add(j, studentList.get(i).get("name"));
                    j++;
                }
            }
        }
        return students;
    }

    /*Készíts egy függvényt aminek a neve sumOfAge(), diákok listáját várja paraméterként és visszaadja a következőt:
    Azon diákok korának az összege, akiknek kevesebb mint 5 édességük van
 */
    public static double sumOfAge(List<Map<String, Object>> studentList) {
        double sum = 0.0;
        int j = 0;
        for (int i = 0; i < studentList.size(); i++) {
            for (HashMap.Entry element : studentList.get(i).entrySet()) {
                if (element.getKey().equals("candies") && (int) (element.getValue()) < 5) {
                    double kor = Double.parseDouble(studentList.get(i).get("age") + "");
                    sum += kor;
                }
            }
        }
        return sum;
    }
}
