import java.util.Scanner;
import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  
        System.out.println("Enter the encoded string: ");
        String s = sc.nextLine();
        

        String decodedString = decodeString(s);
        
 
        System.out.println("Decoded String: " + decodedString);
        
        sc.close();
    }


    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

   
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
     
                k = k * 10 + (c - '0');
            } else if (c == '[') {
           
                countStack.push(k);
                resultStack.push(currentString.toString());
        
                currentString = new StringBuilder();
                k = 0;
            } else if (c == ']') {
        
                int repeatTimes = countStack.pop();
                StringBuilder decodedString = new StringBuilder(resultStack.pop());
               
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
           
                currentString = decodedString;
            } else {
         
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}
