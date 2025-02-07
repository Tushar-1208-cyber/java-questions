import java.util.Scanner;

public class swp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Numbers before swapping" + "num1  " + num1 + "num2  " + num2);

        int temp = num1;
        num1 = num2 ;
        num2 = temp;
        
        System.out.println("After swapping:" + "num1  " + num1 + "num2  " + num2);
        sc.close();
    }
}