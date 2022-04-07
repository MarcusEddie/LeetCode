package problems.easy;

public class E1694 {

    public static void main(String[] args) {
        System.out.println(new Solution().reformatNumber("1-2 3-4 5 67"));
    }
    
    private static class Solution {
        public String reformatNumber(String number) {
            StringBuilder builder = new StringBuilder();
            number = number.replaceAll(" ", "").replaceAll("-", "");
            for(int i = 0; i < number.length(); i++) {
                if (i % 3 == 2) {
                    builder.append(String.valueOf(number.charAt(i))).append("-");
                } else {
                    builder.append(String.valueOf(number.charAt(i)));
                }
            }
            if (builder.lastIndexOf("-") == builder.length() - 1) {
                builder = new StringBuilder().append(builder.substring(0, builder.length() - 1));
            }
            int idx = builder.lastIndexOf("-");
            if (idx == builder.length() - 2) {
                String tmp = builder.substring(idx + 1);
                builder = new StringBuilder().append(builder.substring(0, idx)).append(tmp);
                builder.insert(idx - 1, "-");
            }
            
            return builder.toString();
        }
    }

}
