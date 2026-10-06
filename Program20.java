public class Program20 {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {85, 70},
            {88, 92, 76, 81}
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks:");

            for (int mark : marks[i])
                System.out.print(mark + " ");

            System.out.println();
        }
    }
}
