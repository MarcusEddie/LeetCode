package problems.easy;

public class E744 {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        System.out.println(new Solution().nextGreatestLetter(letters, target));
    }

    private static class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int[] slot = new int[26];
            for (int i = 0; i < slot.length; i++) {
                slot[i] = -1;
            }
            for(int i =0; i<letters.length; i++){
                int code = letters[i] - 97;
                slot[code] = i;
            }
            int targetCode = target - 97 + 1;
            if(targetCode == 26){
                targetCode = 0;
            }
            int rs = slot[targetCode];
            while(rs == -1){
                if(targetCode + 1 > 25){
                    targetCode = 0;
                } else{
                    targetCode++;
                }
                rs = slot[targetCode];
            }
            
            return (char)(targetCode +97);
        }
    }
}
