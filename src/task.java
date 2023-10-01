import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N should be a positive integer.");
        } else {
            int sum = calculateSum(n);
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }

    public static int calculateSum(int n) {
        int sum = 0;
        
        // Calculate the sum of the first 'n' natural numbers using a loops
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }
}
