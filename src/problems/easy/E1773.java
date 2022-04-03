package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1773 {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        String ruleKey = ""; 
        String ruleValue = "";
        System.out.println(new Solution().countMatches(items, ruleKey, ruleValue));
    }
    
    private static class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int rs = 0;
            int type = 0;
            if (ruleKey.equals("color")) {
                type = 1;
            } else if (ruleKey.equals("name")) {
                type = 2;
            }
            for (List<String> list : items) {
                if(list.get(type).equals(ruleValue)) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
