import java.util.Scanner;

public class primeno1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        // Loop through all numbers from 2 to N and check if they are prime
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If divisible, it's not a prime number
            }
        }

        return true; 
    }
}
