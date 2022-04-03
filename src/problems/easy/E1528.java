package problems.easy;

public class E1528 {

    public static void main(String[] args) {
        String s = "ABC"; 
        int[] indices = {0,1,2};
        System.out.println(new Solution().restoreString(s, indices));
    }
    private static class Solution {
        public String restoreString(String s, int[] indices) {
            StringBuilder rs = new StringBuilder();
            char[] tmp = new char[s.length()];
            for(int i = 0; i<s.length(); i++) {
                tmp[indices[i]] = s.charAt(i);
            }
            for (int i = 0; i < tmp.length; i++) {
                rs.append(tmp[i]);
            }
            return rs.toString();
        }
    }

}
