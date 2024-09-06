import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNoteChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the ransomNote: ");
        String ransomNote = sc.nextLine();
        
        System.out.println("Enter the magazine: ");
        String magazine = sc.nextLine();


        boolean result = canConstruct(ransomNote, magazine);


        System.out.println(result);

        sc.close();
    }

  
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
       
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }

            charCountMap.put(c, charCountMap.get(c) - 1);
        }


        return true;
    }
}
