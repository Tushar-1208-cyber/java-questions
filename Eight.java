
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit price:");
        double UnitPrice = sc.nextDouble();

        System.out.println("Enter quantity:");
        double Quantity = sc.nextDouble();

        double revenue = UnitPrice * Quantity;
        double discountRate = 0.0;

        if (Quantity >= 100 && Quantity <= 120)
        {
            discountRate = 0.10 ;
        }
        else if (Quantity > 120)
        {
            discountRate = 0.15 ;
        }
        double discount = revenue * discountRate;
        double finalRevenue = revenue - discount;
        System.out.println("The revenue from sale:" + revenue);
        System.out.println("After discoubt:" + finalRevenue);
        sc.close();
    }
}
