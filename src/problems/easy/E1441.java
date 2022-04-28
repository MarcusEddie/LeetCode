package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1441 {

    public static void main(String[] args) {
        int[] target = {1,2,3};
        System.out.println(new Solution().buildArray(target, 4).toString());
    }
    
    private static class Solution {
        public List<String> buildArray(int[] target, int n) {
            List<String> rs = new ArrayList<String>();
            int pre = 0;
            for (int i = 0; i < target.length; i++) {
                if (target[i] - pre == 1) {
                    rs.add("Push");
                    
                } else {
                    for (int j = pre; j < target[i] - 1; j++) {
                        rs.add("Push");
                    }
                    for (int j = pre; j < target[i] - 1; j++) {
                        rs.add("Pop");
                    }
                    rs.add("Push");
                }
                pre = target[i];
            }
            return rs;
        }
    }

}
