public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows to print
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print the current row number repeated four times
            for (int j = 1; j <= 4; j++) {
                System.out.print(i);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
OUTPUT:
1111
2222
3333
4444
