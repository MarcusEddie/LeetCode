package problems.easy;

public class E1309 {

    public static void main(String[] args) {
        System.out.println(new Solution().freqAlphabets("11326#"));
    }
    
    private static class Solution {
        public String freqAlphabets(String s) {
            String[] single = {"", "a","b","c","d","e","f","g","h","j"};
            String[] double1 = {"", "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            StringBuilder builder = new StringBuilder();
            int idx = s.length() - 1;
            while (idx >=0) {
                if (s.charAt(idx) == '#') {
                    int tmp = s.charAt(idx - 2) - 48;
                    tmp = tmp *10 + s.charAt(idx - 1) - 48;
                    builder.append(double1[tmp - 9]);
                    idx = idx - 3;
                } else {
                    builder.append(single[s.charAt(idx) - 48]);
                    idx--;
                }
            }
            return builder.reverse().toString();
        }
    }

}
