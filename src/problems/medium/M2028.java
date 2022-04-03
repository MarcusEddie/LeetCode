package problems.medium;

public class M2028 {

    public static void main(String[] args) {
//        int[] rolls = {3,2,4,3};
//        int mean = 4;
//        int n = 2;

//        int[] rolls = {1,5,6};
//        int mean = 3;
//        int n = 4;

//        int[] rolls = {1,2,3,4};
//        int mean = 6;
//        int n = 4;
//        
//        int[] rolls = {1};
//        int mean = 3;
//        int n = 1;
        int[] rolls = { 6, 3, 4, 3, 5, 3 };
        int mean = 1;
        int n = 6;

        int[] rs = new Solution().missingRolls(rolls, mean, n);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] rs = new int[n];
        int sum = (rolls.length + n) * mean;
        for (int i = 0; i < rolls.length; i++) {
            sum = sum - rolls[i];
        }
        if (sum > n * 6 || sum < 0) {
            return new int[0];
        }
        int quotient = sum / n;
        int remainder = sum % n;
        for (int i = 0; i < rs.length; i++) {
            if (remainder > 0) {
                rs[i] = quotient + 1;
                remainder--;
            } else {
                rs[i] = quotient;
            }
        }
        return rs;
    }
}
