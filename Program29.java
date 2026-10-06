import java.util.Arrays;

public class Program29 {
    public static void main(String[] args) {
        int[][] a = {
            {5, 2, 8},
            {9, 1},
            {7, 4, 6, 3}
        };

        for (int[] row : a)
            Arrays.sort(row);

        System.out.println("Sorted jagged array:");

        for (int[] row : a) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
