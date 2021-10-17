public class PrintEven {
    // Írj egy programot, ami kiírja az összes páros számot 0 és 500 között
    public static void main(String[] args) {
        for (int i = 0; i <= 500; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
