import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 10 to " + n + " are:");

        for (int i = 10; i <= n; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + "\n");
            }
        }

        sc.close();
    }
}