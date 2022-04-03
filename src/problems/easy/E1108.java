package problems.easy;

public class E1108 {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(new Solution().defangIPaddr(address));
    }

    private static class Solution {
        public String defangIPaddr(String address) {
            String rs = address.replaceAll("\\.", "[.]");
            return rs;
        }
    }
}
