import java.util.Scanner;
import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxArea = 0;
        int[] dp = new int[matrix[0].length];

        for (char[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                dp[j] = row[j] == '1' ? dp[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(dp));
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
        }

        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        char[][] matrix = new char[rows][cols];
        System.out.println("Enter the matrix row by row (only '0' and '1'):");
        for (int i = 0; i < rows; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = row.charAt(j);
            }
        }

        MaximalRectangle solution = new MaximalRectangle();
        System.out.println("Maximal Rectangle Area: " + solution.maximalRectangle(matrix));
    }
}
