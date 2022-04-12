public class Colors {
    public static void main(String[] args) {
        // - Készíts egy kétdimenziós tömböt
//   ami megadott színek különböző árnyalatait tartalmazza
// - A `colors[0]` a zöld árnyalatait tárolja:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - A `colors[1]` a piros árnyalatait:
//   `"orange red", "red", "tomato"`
// - A `colors[2]` pedig a pink árnyalatait:
//   `"orchid", "violet", "pink", "hot pink"`

        String colors = {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};
       /* String[][] colors = new String[3][5];
        colors[0][0] = "lime, ";
        colors[0][1] = "forest green, ";
        colors[0][2] = "olive, ";
        colors[0][3] = "pale green, ";
        colors[0][4] = "spring green, ";

        colors[1][0] = "orange red, ";
        colors[1][1] = "red, ";
        colors[1][2] = "tomato, ";
        colors[1][3] = " ";
        colors[1][4] = " ";

        colors[2][0] = "orchid, ";
        colors[2][1] = "violet, ";
        colors[2][2] = "pink, ";
        colors[2][3] = "hot pink, ";
        colors[2][4] = " ";
*/
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + " ");
            }
            System.out.println();
        }
    }
}
