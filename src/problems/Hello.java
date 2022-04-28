package problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hello {

    public static void main(String[] args) {
        int[] a = {4,2,2,5,4,5,4,5,3,3,6,1,2,4,2,1,6,5,4,2,3,4,2,3,3,5,4,1,4,4,5,3,6,1,5,2,3,3,6,1,6,4,1,3};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        System.out.println(a.length + 53);
        System.out.println((a.length + 53) * 2);
        System.out.println((a.length + 53) * 2 - sum);
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                    .next();
            
        }
    }

}
