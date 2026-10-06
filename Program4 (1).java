import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = a[0];

        for (int x : a) {
            if (x > max)
                max = x;
        }

        System.out.println("Maximum: " + max);
    }
}
