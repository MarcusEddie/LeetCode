package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E989 {

    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 806;
        System.out.println(new Solution().addToArrayForm(num, k).toString());
    }
    
    private static class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> rs = new ArrayList<Integer>();
            int idx = num.length - 1;
            int left = 0;
            int sum = 0;
            while (true) {
                int remainder = k % 10;
                if (idx >=0 && k > 0) {
                    sum = remainder + num[idx--] + left;
                } else if (idx < 0 && k == 0) {
                    break;
                } else if (idx < 0 && k > 0) {
                    sum = remainder + left;
                } else {
                    sum = num[idx--] + left;
                }
                if (sum > 9) {
                    left = 1;
                    sum = sum - 10;
                } else {
                    left = 0;
                }
                rs.add(0, sum);
                k = k / 10;
            }
            if (left > 0) {
                rs.add(0, left);
            }
            return rs;
        }
        
        public  List<Integer> addToArrayForm2(int[] num, int k) {
            List<Integer> rs = new ArrayList<Integer>();
            
            return rs;
        }
    }

}
