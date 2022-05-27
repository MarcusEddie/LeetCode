package contest.weekly.c294;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.percentageLetter("foobar", 'o'));
        System.out.println(solution.percentageLetter("jjjjj", 'o'));       
    }

    private static class Solution {
        public int percentageLetter(String s, char letter) {
            int ans = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == letter) {
                    ans++;
                }
            }
            
            return (ans * 100) / s.length();
        }
    }

}
