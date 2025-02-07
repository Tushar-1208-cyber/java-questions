
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();

        System.out.println("Enter width of rectangle:");
        int width = sc.nextInt();

        int recarea = length * width ;
        System.out.println("Area of rectangle:" + recarea);

        System.out.println("Enter base of rectangle:");
        int base = sc.nextInt();

        System.out.println("Enter height of rectangle:");
        int height = sc.nextInt();

        int triarea = (base * height) / 2 ;
        System.out.println("Area of triangle:" + triarea);

        System.out.println("Enter radius of circle:");
        int rad = sc.nextInt();

        double cirarea = Math.PI * rad * rad ;
        System.out.println("Area of circle: + %2f" + cirarea);

        sc.close();
    }   
}
