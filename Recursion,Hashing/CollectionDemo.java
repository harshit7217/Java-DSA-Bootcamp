import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> studentData = new HashMap<>();
// Declaration of Hash Map
        studentData.put(1, "Nirmal");   
        studentData.put(2, "Durga"); 
        
        // Traversal of HashMap
        System.out.println(studentData.get(1));

        getCountofChars("programming");

    }

    // Input : "programming"
    // Output: p -> 1, r -> 2, o -> 1
    public static void getCountofChars(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for( char c : s.toCharArray()) {
            
            if(counts.containsKey(c)){
                counts.put(c, counts.get(c)+1);
            }else{
                counts.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : counts.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        } 
    }
}
