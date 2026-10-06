import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        int max = a[0][0][0];

        for (int[][] layer : a)
            for (int[] row : layer)
                for (int x : row)
                    if (x > max)
                        max = x;

        System.out.println("Maximum: " + max);
    }
}
