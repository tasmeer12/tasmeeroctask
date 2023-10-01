import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        // Check if the entered number is less than or equal to 0
        if (n <= 0) {
            System.out.println("N should be a positive integer.");
        } else {
            // Calculate the sum of the first 'n' natural numbers using a loop
            int sum = calculateSum(n);
            
            // Display the result
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // A method to calculate the sum of the first 'n' natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        
        // Use a loop to add numbers from 1 to 'n' to the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }
}
