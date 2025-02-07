import java.util.Scanner;

public class celtofahr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the temperature in celsius: ");
       double celsius = sc.nextDouble();

       double fahrenheit = (celsius * 9/5) + 32; 

       System.out.println("%.1f C = %.1f F%n" + celsius + fahrenheit);

       sc.close();
    }
}
