package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1374 {

    public static void main(String[] args) {
        System.out.println(4 << 1);
        System.out.println(new Solution().generateTheString(1));
        System.out.println(new Solution().generateTheString(2));
        System.out.println(new Solution().generateTheString(3));
        System.out.println(new Solution().generateTheString(4));
        System.out.println(new Solution().generateTheString(5));
        System.out.println(new Solution().generateTheString(6));
        System.out.println(new Solution().generateTheString(7));
        
        System.out.println(new Solution().generateTheString(8));
        System.out.println(new Solution().generateTheString(9));
        System.out.println(new Solution().generateTheString(10));
        System.out.println(new Solution().generateTheString(11));
        System.out.println(new Solution().generateTheString(12));
    }
    
    static class Solution {
        public String generateTheString(int n) {
            StringBuilder rs = new StringBuilder();
            List<Integer> nums = gen(n);
            int code = 97;
            for (int i = 0; i < nums.size(); i++) {
                for (int j = 0; j < nums.get(i); j++) {
                    rs.append((char)code);
                }
                code++;
            }
            return rs.toString();
        }
        
        private List<Integer> gen(int n){
            List<Integer> rs = new ArrayList<Integer>();
            
            if (n == 1 || (n & 1) == 1) {
                rs.add(n);
                return rs; 
            }
            if (n == 2) {
                rs.add(1);
                rs.add(1);
                return rs;
            }
            if ((n & 1) == 0) {
                int half = n >> 1;
                if ((half & 1) == 1) {
                    rs.add(half);
                    rs.add(half);
                } else {
                    rs.addAll(gen(half - 1));
                    rs.addAll(gen(half + 1));
                }
            } else {
                int half = n >> 1;
                rs.addAll(gen(half));
                rs.addAll(gen(n - half));
            }
            return rs;
        }
    }

}
