
import java.util.Scanner;

public class dectobin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu for the user to choose the conversion type
        System.out.println("Choose an option:");
        System.out.println("1. Convert Decimal to Binary");
        System.out.println("2. Convert Binary to Decimal");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Decimal to Binary
                System.out.print("Enter a decimal number: ");
                int decimalNumber = scanner.nextInt();
                String binary = Integer.toBinaryString(decimalNumber);
                System.out.println("Binary representation: " + binary);
                break;

            case 2:
                // Binary to Decimal
                System.out.print("Enter a binary number: ");
                String binaryString = scanner.next();
                try {
                    int decimal = Integer.parseInt(binaryString, 2);
                    System.out.println("Decimal representation: " + decimal);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid binary number.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();


    }
}
