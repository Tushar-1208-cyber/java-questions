// Given a number n (any value greater than 100), write a java program to print the sums
// of all multiples of three and five up to n.

import java.util.Scanner;

public class sumofmultiofthreeandfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n that should be greater than 100 : ");
        int n = sc.nextInt();
        
        if(n<100)
        {
            System.out.println("INVALID INPUT");
        }

        int sum = 0;
        for(int i = 1; i <= n ; i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("The sum is : " + sum);
    }
}
