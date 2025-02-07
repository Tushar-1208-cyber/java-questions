import java.util.Scanner;

public class sechour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total sec:");
        int totalsec = sc.nextInt();
        int hours = totalsec / 3600;
        int remainsec = totalsec % 3600;
        int minutes = remainsec / 60;
        int remainminutes = remainsec % 60;

        System.out.println(totalsec);
        System.out.println(hours);
        System.out.println(remainsec);
        System.out.println(minutes);
        System.out.println(remainminutes);
    }
}
