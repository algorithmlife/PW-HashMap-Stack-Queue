import java.util.*;

public class SortedMapByValue {

    public static void main(String[] args) {
  
        Map<Integer, String> map = new HashMap<>();
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

        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

   
        System.out.println("Sorted Map (based on values): ");
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println(entry.getValue() + "=" + entry.getKey());
        }


        sc.close();
    }
}
