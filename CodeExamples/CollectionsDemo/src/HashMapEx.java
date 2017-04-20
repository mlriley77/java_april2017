import java.util.HashMap;
import java.util.Map;

/**
 * Created by Antonella on 4/18/17.
 */
public class HashMapEx {

    public static void main(String[] args) {
        // creates a hashmap object (needs to specify the key and value pair types)
        HashMap<Integer, String> map = new HashMap<>();

        // add data to the map
        map.put(10, "Jeremy");
        map.put(25, "Marin");
        map.put(36, "Maurice");
        map.put(49, "Sarah");

        String stuName = map.get(10);

        System.out.println(stuName);

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);
        }


    }
}
