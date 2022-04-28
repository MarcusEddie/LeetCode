package problems.easy;


public class E2027 {

    public static void main(String[] args) {
        System.out.println(new Solution().minimumMoves("OXOX"));
        System.out.println(new Solution().minimumMoves("OOOOXXXOXO"));
    }
    
    private static class Solution {
        public int minimumMoves(String s) {
            int rs = 0;
            int idx = 0;
            while (idx < s.length()) {
                if(s.charAt(idx) == 'O'){
                    idx++;
                    continue;
                }
                if (idx + 3 < s.length()) {
                    if(s.substring(idx, idx + 3).contains("X")){
                        rs++;
                    }
                } else {
                    if(s.substring(idx).contains("X")){
                        rs++;
                    }
                }
                idx += 3;
                if (0 <= s.length() - idx && s.length() - idx < 3) {
                    if(s.substring(idx).contains("X")){
                        rs++;
                        
                    }
                    break;
                }
            }
            return rs;
        }
    }

}
