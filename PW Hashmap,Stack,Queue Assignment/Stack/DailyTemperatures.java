import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures1))); 
        

        int[] temperatures2 = {30, 40, 50, 60};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures2)));  
        

        int[] temperatures3 = {30, 60, 90};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures3)));  
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();  
        
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();  
                answer[prevDay] = i - prevDay;  
            }
            stack.push(i);
        }
        
        return answer; 
    }
}
