import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Készíts (dinamikusan*) egy kétdimenziós tömböt
//   a következő mátrix-szal**. Ciklust (loop-ot) használj!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Írasd ki a konzolra ezt a kétdimenziós tömböt
// * A tömb hossza egy változótól kell függjön
// ** Nyugalom, egy mátrix pont olyan, mint egy tömb
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, how big the matrix should be.");
        int length = scanner.nextInt();
        int[][] numbers = new int[length][length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = 0;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = 1;

        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}