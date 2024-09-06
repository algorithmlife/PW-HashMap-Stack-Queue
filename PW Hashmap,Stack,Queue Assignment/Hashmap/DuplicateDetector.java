import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateDetector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();


        int[] array = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        if (containsDuplicate(array)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }


    public static boolean containsDuplicate(int[] array) {

        Set<Integer> set = new HashSet<>();


        for (int num : array) {
            
            if (!set.add(num)) {
                return true; 
            }
        }

   
        return false;
    }
}
