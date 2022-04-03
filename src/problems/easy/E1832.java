package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E1832 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean checkIfPangram(String sentence) {
            boolean rs = false;
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i< sentence.length(); i++) {
                set.add((int) sentence.charAt(i));
                if (set.size() == 26) {
                    rs = true;
                    break;
                }
            }
            if (set.size() == 26) {
                rs = true;
            }
            return rs;
        }
    }

}
