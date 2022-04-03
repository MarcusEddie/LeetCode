package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E929 {

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com","test.email.leet+alex@code.com" };
        System.out.println(new Solution().numUniqueEmails(emails));
    }

    private static class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < emails.length; i++) {
                String[] input = emails[i].split("@");
                String local = input[0];
                if (local.indexOf("+") >= 0) {
                    local = local.substring(0, local.indexOf("+"));
                }
                while (local.indexOf(".") >= 0) {
                    local = local.substring(0, local.indexOf("."))
                            + local.substring(local.indexOf(".") + 1);
                }
                set.add(local + "@"+ input[1]);
            }
            return set.size();
        }
    }

}
