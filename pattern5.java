public class pattern5 {
        public static void main(String[] args) {
            int rows = 5;  // Number of rows for the pattern
            
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int space = 1; space <= rows - i; space++) {
                    System.out.print("  ");
                }
    
                // Print increasing numbers
                int num = i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
    
                // Print decreasing numbers
                num -= 2;
                for (int j = 1; j < i; j++) {
                    System.out.print(num + " ");
                    num--;
                }
    
                // Move to the next line after each row
                System.out.println();
            }
        }
}