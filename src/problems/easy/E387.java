package problems.easy;

public class E387 {

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
    }
    
    private static class Solution {
        public int firstUniqChar(String s) {
            int[][] slot = new int[26][2];
            for(int i = 0; i < s.length(); i++){
                int code = s.charAt(i) - 97;
                slot[code][0] = i;
                slot[code][1] = slot[code][1]+1;
            }
            int min = 1000000;
            int rs = -1;
            for(int i = 0; i < slot.length; i++){
                if(slot[i][1] == 1){
                    if(min > slot[i][0]){
                        min = slot[i][0];
                    }
                }
            }
            rs = min;
            return rs;
        }
    }

}
