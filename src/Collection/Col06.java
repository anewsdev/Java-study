package Collection;

import java.util.HashMap;
import java.util.Map;

public class Col06 {
    public static void main(String[] args) {
        // Map : Key => value pair 중요
        // Key라는 값으로 unique하게 보장이 돼야 함!
        // Map => HashMap, TreeMap 으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        //키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);

        for(String key: intMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("-------------------------");
        for(Integer value: intMap.values()) {
            System.out.println(value);
        }

        System.out.println("-------------------------");
        System.out.println(intMap.get("삼"));



    }
}
