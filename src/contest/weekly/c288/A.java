package contest.weekly.c288;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

    public static void main(String[] args) {
        System.err.println(new Solution().largestInteger(2));
    }
    
    private static class Solution {
        public int largestInteger(int num) {
            int rs = 0;
            String n = String.valueOf(num);
            int[] oddIdx = new int[n.length()];
            List<Integer> odd = new ArrayList<Integer>();
            int idxO = 0;
            int[] evenIdx = new int[n.length()];
            List<Integer> even = new ArrayList<Integer>();
            int idxE = 0;
            for (int i = 0; i < n.length(); i++) {
                int code = n.charAt(i) - 48;
                if ((code & 1) == 0) {
                    even.add(code);
                    evenIdx[i] = 1;
                } else {
                    odd.add(code);
                    oddIdx[i] = 1;
                }
            }
            Collections.sort(odd);
            Collections.sort(even);
            if (!odd.isEmpty()) {
                for (int i1 = odd.size() - 1; i1 >= 0; i1--) {
                    Integer integer = odd.get(i1);
                    for (int i = idxO; i < oddIdx.length; i++) {
                        if (oddIdx[i] == 1) {
                            rs += integer * Math.pow(10, oddIdx.length - i - 1);
//                            System.out.println(rs);
                            idxO = i + 1;
                            break;
                            
                        }
                    }
                }
            }
            
            if (!even.isEmpty()) {
                for (int i1 = even.size() - 1; i1 >= 0; i1--) {
                    Integer integer = even.get(i1);
                    for (int i = idxE; i < evenIdx.length; i++) {
                        if (evenIdx[i] == 1) {
                            rs += integer * Math.pow(10, evenIdx.length - i - 1);
//                            System.out.println(rs);
                            idxE = i + 1;
                            break;
                        }
                    }
                }
            }
            return rs;
        }
    }

}
