package problems.easy;

public class E2073 {

    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        System.out.println(new Solution().timeRequiredToBuy(tickets, 0));
    }
    
    private static class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int rs = 0;
            int len = tickets.length;
            int ticket = tickets[k];
            while (ticket > 0) {
                for (int i = 0; i < tickets.length; i++) {
                    if (tickets[i] != 0) {
                        tickets[i]--;
                        rs++;
                    }
                    if (tickets[i] == 0) {
                        len--;
                    }
                    if (tickets[k] == 0) {
                        break;
                    }
                }
                ticket = tickets[k];
            }
            return rs;
        }
    }

}
