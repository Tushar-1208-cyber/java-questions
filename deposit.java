
import java.util.Scanner;

public class deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of deposit:");

        double deposit = sc.nextDouble();
        System.out.println("Enter the yearly interest rate");
        double interest_Rate = sc.nextDouble()1;
        System.out.println("Enter the income tax rate");
        double Tax_Rate = sc.nextDouble();

        double gross_Interest = ((deposit*interest_Rate)/100);
        double Tax_Amount = ((gross_Interest*Tax_Rate)/100);
        double net_Interest = (gross_Interest - Tax_Amount);

        System.out.println("The amoubt of interest earned in the year: " + net_Interest);
    }
}
