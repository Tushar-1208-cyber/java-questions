import java.util.Scanner;

public class disrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        
        double revenue = unitPrice * quantity;
        double discountRate = 0.0;

        if(quantity >= 100 && quantity <=120)
        {
            discountRate = 0.10;
        }
        else if(quantity >= 120)
        {
            discountRate = 0.15;
        }

        double discountAmount = revenue * discountRate;
        double finalRevenue = revenue - discountAmount;

        System.out.println("Ther revenue from sale : " + revenue);
        System.out.println("After discount " + finalRevenue);
    }
    
}
