package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E804 {

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(new Solution().uniqueMorseRepresentations(words));
    }

    private static class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] slot = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < words.length; i++) {
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < words[i].length(); j++) {
                    builder.append(slot[words[i].charAt(j) - 97]);
                }
                set.add(builder.toString());
            }
            return set.size();
        }
    }

}
