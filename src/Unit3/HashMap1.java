package Unit3;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("First",1);
        hm.put("Second",2);
        hm.put("Third",3);
        System.out.println(hm.get("First"));
        System.out.println(hm.containsKey("Second"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.containsValue(2));
    }
}
