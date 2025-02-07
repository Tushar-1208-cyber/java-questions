import java.util.Scanner;

public class lsls{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FOUR NUMBERS:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int largest;
        int secondLargest;
        int smallest;

        {
        // FOR LARGEST NUMBER
        if(num1 >= num2 && num1 >= num3 && num1 >= num4)
        {
            largest = num1;
        }
        else if(num2 >= num1 && num2 >= num3 && num2 >= num4)
        {
            largest = num2;
        }
        else if(num3 >= num1 && num3 >= num2 && num3 >= num4)
        {
            largest = num3;
        }
        else
        {
            largest = num4;
        }
        }

        {
        // FOR SECOND LARGEST NUMBER
        if((num1 >= num2 && num1 <= largest) || (num1 <= num2 && num1 >= largest))
        {
            secondLargest = num1;
        }
        else if((num2 >= num1 && num2 <= largest) || (num2 <= num1 && num2 >= largest))
        {
            secondLargest = num2;
        }
        else if((num3 >= num4 && num3 <= largest) || (num3 <= num4 && num3 >= largest))
        {
            secondLargest = num3;
        }
        else
        {
            secondLargest = num4;
        }
        }

        {
        // FOR SMALLEST NUMBER
        if(num1 <= num2 && num1 <= num3 && num1 <= num4)
        {
            smallest = num1;
        }       
        else if(num2 <= num1 && num2 <= num3 && num2 <= num4)
        {
            smallest = num2;
        }
        else if(num3 <= num1 && num3 <= num2 && num3 <= num4)
        {
            smallest = num3;
        }
        else
        {
            smallest = num4;
        }
        }

        System.out.println("Largest number is : " + largest);
        System.out.println("Second Largest number is : " + secondLargest);
        System.out.println("Smallest number is : " + smallest);
    }
}