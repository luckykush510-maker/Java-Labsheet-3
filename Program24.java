import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] result = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (a[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate)
                result[count++] = a[i];
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < count; i++)
            System.out.print(result[i] + " ");
    }
}
