public class IneuronPattern {
    public static void main(String[] args) {
        String word = "INEURON";
        int length = word.length();
        
        // Loop through each character in the word
        for (int i = 0; i < length; i++) {
            // Print spaces before each character
            for (int j = length; j > i + 1; j--) {
                System.out.print(" ");
            }
            
            // Print the characters from the word
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
OUTPUT:
      I 
     I N 
    I N E 
   I N E U 
  I N E U R 
 I N E U R O 
I N E U R O N 
  
