import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp in Celsius:");

        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Celsius: %.2f = Fahrenheit: %.2f\n", celsius, fahrenheit);
        
        sc.close();

    }
}
