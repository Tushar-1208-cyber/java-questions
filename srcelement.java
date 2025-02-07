// 20) Write a java program to search for an element in an array.

import java.util.Scanner;

public class srcelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i=0 ; i<=n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}