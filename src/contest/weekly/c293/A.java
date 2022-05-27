package contest.weekly.c293;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

    public static void main(String[] args) {
        System.out.println((int)'a');
        Solution solution = new Solution();
        String[] nums = {"abba","babaa","bbaa","cd","cd"};
        System.out.println(solution.removeAnagrams(nums).toString());
        String[] words = {"a","b","c","d","e"};
        System.out.println(solution.removeAnagrams(words).toString());
    }

    private static class Solution {
        public List<String> removeAnagrams(String[] words) {
            List<String> ans = new ArrayList<String>();
            int idx = 1;
            for (int i = 0; i < words.length; i++) {
                ans.add(words[i]);
            }
            while (idx < ans.size()) {
                String cur = ans.get(idx);
                String prev = ans.get(idx - 1);
                if (cur.length() == prev.length()) {
                    int[] slot = new int[26];
                    for(int i = 0; i < cur.length(); i++) {
                        slot[cur.charAt(i) - 97] = slot[cur.charAt(i) - 97] + 1;
                    }
                    for(int i = 0; i < prev.length(); i++) {
                        if (slot[prev.charAt(i) - 97] != 0) {
                            slot[prev.charAt(i) - 97] = slot[prev.charAt(i) - 97] - 1;
                        }
                    }
                    int tmp = 0;
                    for (int i = 0; i < slot.length; i++) {
                        tmp += slot[i];
                    }
                    if (tmp == 0) {
                        ans.remove(idx);
                    } else {
                        idx++;
                    }
                } else {
                    idx++;
                }
            }
            return ans;
        }
    }

}
