package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class E2094 {

    public static void main(String[] args) {
        int[] digits = {2,2,8,8,2};
        int[] rs = new Solution().findEvenNumbers(digits);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] findEvenNumbers(int[] digits) {
            List<Integer> idxs = new ArrayList<Integer>();
            for(int i = 0; i<digits.length; i++){
                if((digits[i] & 1) == 0){
                    idxs.add(i);
                }
            }
            if(idxs.size() == 0){
                return null;
            }
            Set<Integer> rs = new HashSet<Integer>();
            for(int i = 0; i < idxs.size(); i++){
                int last = idxs.get(i);
                for(int j = 0; j < digits.length; j++){
                    if (last != j) {
                        for(int k = 0; k < digits.length; k++){
                            if(last != k  && k != j && digits[k] != 0){
                                rs.add(digits[k] * 100 + digits[j] * 10 + digits[last]);
                            }
                        }
                    }
                }
            }
            int[] arr = new int[rs.size()];
            int i = 0;
            List<Integer> rs2 = new ArrayList<Integer>();
            rs2.addAll(rs);
            Collections.sort(rs2);
            Iterator<Integer> it = rs2.iterator();
            
            while (it.hasNext()) {
                arr[i++] = it.next();
            }
            return arr;
        }
    }

}
