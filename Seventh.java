
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int largest, secondlargest, smallest ;
        if (num1 >= num2 && num1 >= num3 && num1 >= num4)
        {
            largest = num1;
        }
        else if (num2 >= num1 && num2 >= num3 && num2 >= num4)
        {
            largest = num2;
        }
        else if (num3 >= num1 && num3 >= num2 && num3 >= num4)
        {
            largest = num3;
        }
        else
        {
            largest =  num4;
        }


        if((num1 >= num2 && num1 <= largest) || (num1 <= num2 && num1 >= largest))
        {
            secondlargest = num1;
        }
        else if((num2 >= num1 && num2 <= largest) || (num2 <= num1 && num2 >= largest))
        {
            secondlargest = num2;
        }
        else if((num3 >= num4 && num3 <= largest) || (num3 <= num4 && num3 >= largest))
        {
            secondlargest = num3;
        }
        else
        {
            secondlargest = num4;
        }


        if (num1 <= num2 && num1 <= num3 && num1 <= num4)
        {
            smallest = num1;
        }
        else if (num2 <= num1 && num2 <= num3 && num2 <= num4)
        {
            smallest = num2;
        }
        else if (num3 <= num1 && num3 <= num2 && num3 <= num4)
        {
            smallest = num3;
        }
        else
        {
            smallest =  num4;
        }

        System.out.println("Largest number:" + largest);
        System.out.println("Secondlargest number:" + secondlargest);
        System.out.println("Smallest number:" + smallest);
        sc.close();
    }
    
}
