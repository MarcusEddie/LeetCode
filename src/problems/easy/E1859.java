package problems.easy;

public class E1859 {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(new Solution().sortSentence(s));
    }
    
    private static class Solution {
        public String sortSentence(String s) {
            String[] ss = s.split(" ");
            String[] rs = new String[ss.length];
            for (int i = 0; i < ss.length; i++) {
                rs[Integer.valueOf(String.valueOf(ss[i].charAt(ss[i].length() - 1))) - 1] = ss[i].substring(0, ss[i].length() - 1);
            }
            String rss = rs[0];
            for (int i = 1; i < rs.length; i++) {
                rss = rss + " " + rs[i];
            }
            return rss;
        }
    }

}
