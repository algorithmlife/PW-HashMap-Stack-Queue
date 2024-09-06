import java.util.*;

public class AsteroidCollision {

    public static void main(String[] args) {
  
        int[] asteroids1 = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids1)));  

        int[] asteroids2 = {8, -8};
        System.out.println(Arrays.toString(asteroidCollision(asteroids2))); 

        int[] asteroids3 = {10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids3)));  

        int[] asteroids4 = {-2, -1, 1, 2};
        System.out.println(Arrays.toString(asteroidCollision(asteroids4)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean isDestroyed = false;
            
          
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > stack.peek()) {

                    stack.pop();
                } else if (Math.abs(asteroid) == stack.peek()) {
          
                    stack.pop();
                    isDestroyed = true;
                    break;
                } else {
                
                    isDestroyed = true;
                    break;
                }
            }
       
            if (!isDestroyed) {
                stack.push(asteroid);
            }
        }


        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
