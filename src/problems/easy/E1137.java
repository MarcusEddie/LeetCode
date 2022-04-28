package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class E1137 {

    public static void main(String[] args) {
        System.out.println(new Solution().tribonacci(0));
        System.out.println(new Solution().tribonacci(1));
        System.out.println(new Solution().tribonacci(2));
        System.out.println(new Solution().tribonacci(3));
        System.out.println(new Solution().tribonacci(4));
        System.out.println(new Solution().tribonacci(25));
    }
    
    private static class Solution {
        public int tribonacci(int n) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            return tribonacci(n, map);
        }
        
        private  int tribonacci(int n, Map<Integer, Integer> map) {
            int rs = 0;
            if (n == 0 ) {
                map.put(0, 0);
                return 0;
            } else if (n == 1 || n == 2) {
                map.put(1, 1);
                map.put(2, 1);
                return 1;
            }
            int a = map.containsKey(n - 1) ? map.get(n - 1) : tribonacci(n - 1, map);
            int b = map.containsKey(n - 2) ? map.get(n - 2) : tribonacci(n - 2, map);
            int c = map.containsKey(n - 3) ? map.get(n - 3) : tribonacci(n - 3, map);
            map.put(n, a + b+c);
            return a + b+ c;
        }
        
        
    }

}
