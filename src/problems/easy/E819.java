package problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class E819 {

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned =        {"a"};
        System.out.println(new Solution().mostCommonWord(paragraph, banned));
    }

    private static class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            String rs = "";
            Map<String, Integer> map = new HashMap<String, Integer>();
            Set<String> bans = new HashSet<String>();
            for (int i = 0; i < banned.length; i++) {
                bans.add(banned[i]);
            }
            paragraph = paragraph.replaceAll(",", " ");
            String[] words = paragraph.split(" ");
            int max = 0;
            for (int i = 0; i < words.length; i++) {
                if (null == words[i] || (null != words[i] && words[i].length() == 0)) {
                    continue;
                }
                String word = words[i].toLowerCase();
                if (word.charAt(word.length() - 1) == '!'
                        || word.charAt(word.length() - 1) == '?'
                        || word.charAt(word.length() - 1) == '\''
                        || word.charAt(word.length() - 1) == ','
                        || word.charAt(word.length() - 1) == '.'
                        || word.charAt(word.length() - 1) == ';') {
                    word = word.substring(0, word.length()  -1);
                }
                if (!bans.contains(word)) {
                    if (map.containsKey(word)) {
                        Integer tmp = map.get(word);
                        map.put(word, tmp + 1);
                        if (max < map.get(word)) {
                            max = map.get(word);
                        }
                    } else {
                        map.put(word, 1);
                        if (max < 1) {
                            max = 1;
                        }
                    }
                }
            }
            
            Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                        .next();
                if (entry.getValue() == max) {
                    rs = entry.getKey();
                    break;
                }
            }
            return rs;
        }
    }

}
