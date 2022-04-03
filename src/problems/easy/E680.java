package problems.easy;

import java.util.ArrayList;
import java.util.List;


public class E680 {

    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(s.length());
        System.out.println(new Solution().validPalindrome(s));
    }

    private static class Solution {
        public boolean validPalindrome(String s) {
            boolean rs = true;
            int low = 0;
            int high = s.length() - 1;
            List<String> tmpList = new ArrayList<String>();
            while (low < high) {
                if (s.charAt(low) != s.charAt(high)) {
                    tmpList.add(s.substring(0, low) + s.substring(low + 1));
                    tmpList.add(s.substring(0, high) + s.substring(high + 1));
                    break;
                } else {
                    low++;
                    high--;
                }
            }
            int cnt = 0;
            if (tmpList.size() != 0) {
                
                for (String string : tmpList) {
                     low = 0;
                     high = string.length() - 1;
                     System.out.println(string);
                    while (low < high) {
                        if (s.charAt(low) != s.charAt(high)) {
                            cnt++;
                            break;
                        } else {
                            low++;
                            high--;
                        }
                    }
                }
            }
            return cnt > 1 ? false : true;
        }
    }

}
