package sit.int202.jcfreview;

import java.util.HashMap;
import java.util.Map;

public class ProblemTwo {
    public static void main(String[] args) {
        int result = 6;
        int[] data = {1, 2, 3, 5, 8, 7, 9, 6, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int value = data[i];
            int requiredvalue = result - value;
            if (map.get(requiredvalue) == null) {
                map.put(value, i);
            }else {
                int index = map.get(requiredvalue);
                System.out.println("("+index+ " , " + i +")");
                map.put(value,i);
            }

        }
    }
}
