import java.util.Scanner;

class Sum
{
    public static void main(String[] args)
    {
        // Create Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Take second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate sum
        int sum = a + b;

        // Display result
        System.out.println("Sum = " + sum);

        // Close Scanner
        sc.close();
    }
}