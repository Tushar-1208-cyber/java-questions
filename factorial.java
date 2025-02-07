public class factorial {
    public static void main(String[] args) {
        // int number = 1;
        // while(number <= 10)
        // {
        //     int factorial = 1;
        //     int i = 1;
        //     while(i <= number)
        //     {
        //         factorial = factorial*i;
        //         i++;
        //     }
        //     System.out.println("Factorial of " + number + "  is : " + factorial);
        //     number++;
        // }

        for(int number = 1 ; number <= 10 ; number++)
        {
            int factorial = 1;
            for(int i=1 ; i <= number ; i++)
            {
                factorial = factorial*i;
            }
            System.out.println("Factorial of " + number + "              is : " + factorial);
        }
    }
}
