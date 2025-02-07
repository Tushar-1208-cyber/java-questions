// package practice;

// import java.util.Scanner;

// public class areaofcrt {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // paramters for rectangle
//         System.out.println("Enter the length of rectangle:");
//         int length = scanner.nextInt();
//         System.out.println("Enter the width of rectangle:");
//         int width = scanner.nextInt();
//         int recarea = length*width;
//         System.out.println("AREA OF RECTANGLE :" + recarea);



//         // paramters for triangle
//         System.out.println(("Enter the base of triangle:"));
//         int base = scanner.nextInt();
//         System.out.println(("Enter the height of triangle:"));
//         int height = scanner.nextInt();

//         int triarea = (base*height)/2;
//         System.out.println("AREA OF TRIANGLE :" + triarea);




//         // paramters for circle
//         System.out.println(("Enter the radius of the circle:"));
//         int radius = scanner.nextInt();
//         double circarea = Math.PI*radius* radius;
//         System.out.println("AREA OF CIRCLE :" + circarea);

//         scanner.close();
//     }
    
// }




// Remove the package statement if you don't need it
// package practice;

import java.util.Scanner;

public class areaofcrt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parameters for rectangle
        System.out.println("Enter the length of rectangle:");
        int length = scanner.nextInt();
        System.out.println("Enter the width of rectangle:");
        int width = scanner.nextInt();
        int recarea = length * width;
        System.out.println("AREA OF RECTANGLE: " + recarea);

        // Parameters for triangle
        System.out.println("Enter the base of triangle:");
        int base = scanner.nextInt();
        System.out.println("Enter the height of triangle:");
        int height = scanner.nextInt();
        int triarea = (base * height) / 2;
        System.out.println("AREA OF TRIANGLE: " + triarea);

        // Parameters for circle
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();
        double circarea = Math.PI * radius * radius;
        System.out.println("AREA OF CIRCLE: " + circarea);

        // Close the scanner
        scanner.close();
    }
}
