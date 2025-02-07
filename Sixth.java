import java.util.Scanner;

public class Sixth {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of deposit");
        double deposit = sc.nextDouble();

        System.out.println("Enter the yearly Interest rate:");
        double Interest_Rate = sc.nextDouble();

        System.out.println("Enter the yearly Tax rate:");
        double Tax_Rate = sc.nextDouble();

        double gross_Interest = ((deposit * Interest_Rate) / 100);
        double Tax_Amount = ((gross_Interest * Tax_Rate) / 100);
        double net_Interest = gross_Interest - Tax_Amount;

        System.out.println("The amount of interest earned in the year:" + net_Interest);   
        sc.close();
    }
}
