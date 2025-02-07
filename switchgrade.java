import java.util.Scanner;

public class switchgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's grade: ");
        int grade = scanner.nextInt();
        int gradeCategory = grade / 10;

        switch (gradeCategory) {
            case 10:
                if (grade == 100) {
                    System.out.println("Perfect Score");
                } else {
                    System.out.println("Excellent");
                }
                break;
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Good");
                break;
            case 7:
                System.out.println("Above Average");
                break;
            case 6:
                System.out.println("Average");
                break;
            case 5:
                System.out.println("Below Average");
                break;
            default:
                if (grade >= 0 && grade < 50) {
                    System.out.println("Not Passing");
                } else {
                    System.out.println("Invalid grade input");
                }
                break;
        }
        
        scanner.close();
    }
}
