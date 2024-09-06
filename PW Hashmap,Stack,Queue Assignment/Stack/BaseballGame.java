import java.util.*;

public class BaseballGame {

    public static void main(String[] args) {
       
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println("Total Score: " + calPoints(ops1)); 
        
        
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println("Total Score: " + calPoints(ops2)); 
        
 
        String[] ops3 = {"1", "C"};
        System.out.println("Total Score: " + calPoints(ops3)); 
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> record = new Stack<>();
        
     
        for (String op : ops) {
            if (op.equals("+")) {
             
                int last = record.pop();
                int secondLast = record.peek();
                record.push(last);
                record.push(last + secondLast);
            } else if (op.equals("D")) {
       
                record.push(2 * record.peek());
            } else if (op.equals("C")) {
            
                record.pop();
            } else {
           
                record.push(Integer.parseInt(op));
            }
        }

      
        int totalSum = 0;
        for (int score : record) {
            totalSum += score;
        }

        return totalSum;
    }
}
