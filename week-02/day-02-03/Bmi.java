public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        // Számíttasd és írasd ki a testtömeg-indexet (BMI)
        // a változókat használva
        double bmi = massInKg / (heightInM * heightInM);
        System.out.printf("The BMI is : " + "%.2f", bmi);
    }
}
