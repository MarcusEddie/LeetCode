package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E937 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public String[] reorderLogFiles(String[] logs) {
            String[] rs = new String[logs.length];
            int idx = rs.length - 1;
            List<String> list = new ArrayList<String>();
            Map<String, String> map = new HashMap<String, String>();
            for (int i = 0; i < logs.length; i++) {
                int start = logs[i].indexOf(" ");
                String content = logs[i].substring(start + 1);
                if (content.contains("0") || content.contains("1") || content.contains("2")
                        || content.contains("3") || content.contains("5") || content.contains("6")
                        || content.contains("7") || content.contains("8") || content.contains("4")
                        || content.contains("9")) {
                    rs[idx--] = logs[i];
                } else {
                    content = content + logs[i].substring(0, start);
                    list.add(content);
                    map.put(content, logs[i]);
                }
            }
            idx = 0;
            Collections.sort(list, new E937Comparator());
            for (String string : list) {
                rs[idx++] = map.get(string);
            }
            return rs;
        }
        
        private class E937Comparator implements Comparator<String>{
            @Override
            public int compare(String o1, String o2) {
                int start1 = o1.indexOf(" ");
                String content1 = o1.substring(start1 + 1);
                String ider = o1.substring(0, start1);
                int start2 = o2.indexOf(" ");
                String content2 = o2.substring(start2 + 1);
                String ider2 = o2.substring(0, start2);
                int compare = content1.compareTo(content2);
                if (compare != 0) {
                    return compare;
                } else {
                    compare = ider.compareTo(ider2);
                }
                return compare;
            }
        }
    }
    
    

}
