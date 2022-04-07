package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E1502 {

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(new Solution().canMakeArithmeticProgression(arr));
    }
    
    private static class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0; i < arr.length; i++){
                tmp.add(arr[i]);
            }
            Collections.sort(tmp);
            boolean rs = true;
            int diff = tmp.get(1) - tmp.get(0);
            for(int i = 2; i < tmp.size(); i++){
                if(diff != tmp.get(i) - tmp.get(i - 1)){
                    rs = false;
                    break;
                }
            }
            return rs;
        }
    }

}
