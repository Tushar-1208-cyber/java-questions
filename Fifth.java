import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total seconds:");

        int totalsec = sc.nextInt();
        int hours = totalsec / 3600;
        int remainsec = totalsec % 3600;
        int minutes = remainsec % 60;
        int seconds = remainsec % 60;

        System.out.println(totalsec + "seconds=" + hours + "hours," + minutes + "minutes, and " + seconds + "seconds");
        sc.close();
    }
    
}
