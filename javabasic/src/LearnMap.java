import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        // A map is a collection type store many pair, contain {key=value}.
        Map<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Python");
        hash_map.put(2, "Java");
        hash_map.put(3, "C++");
        System.out.println(hash_map.keySet());
        for (Integer num : hash_map.keySet()) {
            System.out.println(num + " : " + hash_map.get(num));
        }

    }
}
