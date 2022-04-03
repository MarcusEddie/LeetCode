package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E728 {

    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(47,85).toString());
    }
    
    private static class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> rs = new ArrayList<Integer>();
            for(int i = left; i<= right; i++) {
                if (is(i)) {
                    rs.add(i);
                }
            }
            return rs;
        }
        
        private boolean is(int n) {
            boolean rs = true;
            int tmp = n;
            while (tmp > 0) {
                int remainder = tmp % 10;
                if (remainder == 0) {
                    rs = false;
                    break;
                }
                if (n % remainder != 0) {
                    rs = false;
                    break;
                }
                tmp = tmp / 10;
            }
            return rs;
        }
    }

}
