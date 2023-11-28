import java.util.HashMap;
import java.util.Map;

public class mapex{

    public static void main(String[] args){
    Map<String, Integer> myMap = new HashMap<>();
    // Add key-value pairs to the map
        myMap.put("tony", 10);
        myMap.put("tom", 5);
        myMap.put("rohu", 8);

    // Print map
        System.out.println( myMap);

    // size of the map
        System.out.println( myMap.size());

    // Verify if a key exists in the map
    String searchKey = "tom";
        System.out.println( myMap.containsKey(searchKey));


    // Remove a key from the map
    String removeKey = "rohu";
        myMap.remove(removeKey);
        System.out.println( myMap);
}
}
