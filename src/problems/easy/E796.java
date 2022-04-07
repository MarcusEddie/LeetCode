package problems.easy;

public class E796 {

    public static void main(String[] args) {
        System.out.println(new Solution().rotateString("xjab", "abcd"));
    }
    
    private static class Solution {
        public boolean rotateString(String s, String goal) {
            boolean rs = false;
            for(int i = 1; i < s.length(); i++){
                System.out.println(s.substring(0, 0 + i) + " " + s.substring(i));
                if((goal.indexOf(s.substring(0, 0 + i)) == goal.length() - i)){
                    rs = true;
                    
                    if(i + 1 < s.length()){
                        if((goal.indexOf(s.substring(i)) == 0)){
                            rs = true;
                            
                        }
                    }
                }
            }
            return rs;
        }
    }

}
