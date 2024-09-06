import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();


        int[] array = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        int largest = findLargestElement(array);
        System.out.println("Largest Element: " + largest);

        sc.close();
    }

    public static int findLargestElement(int[] nums) {
        int max = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; 
            }
        }

        return max;
    }
}
