public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        int averageCodingHours = 6;
        int semesterTimeInWeeks = 17;
        int semesterTimeInDays = 17 * 7;
        int weekDaysInASemester = semesterTimeInWeeks * 5;
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        int studyHoursInASemester = weekDaysInASemester * averageCodingHours;
        System.out.println("Number of hours, spent with studying in a semester: " + studyHoursInASemester);
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        int totalWorkingHours = 17 * 52;
        double percentOfSemesterSpentWithCoding = ((double) studyHoursInASemester / (double) totalWorkingHours) * 100;
        System.out.printf("Percentage of time spent with coding in a semester: " + ("%.2f"), percentOfSemesterSpentWithCoding);
        System.out.print("%");
    }
}
