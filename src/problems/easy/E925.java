package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E925 {

    public static void main(String[] args) {
        String name = "saeed";
        String typed = "ssaaedd";
        System.out.println(new Solution().isLongPressedName(name, typed));
        System.out.println(new Solution().isLongPressedName("leelee", "lleeelee"));
        System.out.println(new Solution().isLongPressedName("a", "b"));
        System.out.println(new Solution().isLongPressedName("a", "aaaa"));
        System.out.println(new Solution().isLongPressedName("a", "aaaaBB"));
        System.out.println(new Solution().isLongPressedName("aaaaaaaa", "aaaa"));
    }

    private static class Solution {
        public boolean isLongPressedName(String name, String typed) {
            boolean rs = true;
            List<int[]> nameList = new ArrayList<int[]>();
            List<int[]> typedList = new ArrayList<int[]>();
            if (name.length() == 1) {
                int[] tmp = new int[2];
                tmp[0] = name.charAt(0);
                tmp[1] = 1;
                nameList.add(tmp);
            }
            if (typed.length() == 1) {
                int[] tmp = new int[2];
                tmp[0] = typed.charAt(0);
                tmp[1] = 1;
                typedList.add(tmp);
            }
            int pre = 0;
            for (int i = 1; i < name.length(); i++) {
                if (name.charAt(i) != name.charAt(i - 1)) {
                    System.out.println(name.substring(pre, i) + " " + (i - pre));
                    int[] tmp = new int[2];
                    tmp[0] = name.charAt(i - 1);
                    tmp[1] = i - pre;
                    nameList.add(tmp);
                    pre = i;
                }
                if (i == name.length() - 1) {
                    System.out.println(name.substring(pre) + " " + (i + 1 - pre));
                    int[] tmp = new int[2];
                    tmp[0] = name.charAt(i);
                    tmp[1] = i + 1 - pre;
                    nameList.add(tmp);
                }
            }
            
            pre = 0;
            for (int i = 1; i < typed.length(); i++) {
                if (typed.charAt(i) != typed.charAt(i - 1)) {
                    System.out.println(typed.substring(pre, i) + " " + (i - pre));
                    int[] tmp = new int[2];
                    tmp[0] = typed.charAt(i - 1);
                    tmp[1] = i - pre;
                    typedList.add(tmp);
                    pre = i;
                }
                if (i == typed.length() - 1) {
                    System.out.println(typed.substring(pre) + " " + (i + 1 - pre));
                    int[] tmp = new int[2];
                    tmp[0] = typed.charAt(i);
                    tmp[1] = i + 1 - pre;
                    typedList.add(tmp);
                }
            }
            if (nameList.size() != typedList.size()) {
                rs = false;
            } else {
                for (int i = 0; i < nameList.size(); i++) {
                    int[] names = nameList.get(i);
                    int[] types = typedList.get(i);
                    if (names[0] != types[0]) {
                        rs = false;
                        break;
                    }
                    if (names[1] > types[1]) {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
