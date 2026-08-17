import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers from 0 to " + n + " are:");

        for (int i = 0; i <= n; i++) {
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}