import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args) {
    
        Map<Integer, String> map = new TreeMap<>();
        

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of entries: ");
        int n = sc.nextInt();
        

        sc.nextLine();
        

        for (int i = 0; i < n; i++) {
            System.out.println("Enter key (integer): ");
            int key = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter value (String): ");
            String value = sc.nextLine();
            

            map.put(key, value);
        }


        System.out.println(map);
        
        sc.close();
    }
}
