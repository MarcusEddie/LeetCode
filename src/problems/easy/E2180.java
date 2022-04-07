package problems.easy;

public class E2180 {

    public static void main(String[] args) {
        System.out.println(new Solution().countEven(896));
    }
    
    private static class Solution {
        public int countEven(int num) {
            int rs = 0;
            for(int i = 2; i <= num; i++){
                int sum = 0;
                if(i < 9 && ((i & 1) == 0)){
                    rs++;
                } else if((11 <= i && i <= 99)){
                    int a = i / 10;
                    int b = i % 10;
                    if(((a & 1) == 0) && ((b & 1) == 0)){
                        rs++;
                    } else if(((a & 1) == 1) && ((b & 1) == 1)){
                        rs++;
                    }
                } else if(101 <= i && i < 999){
                    int tmp = i;
                    int a = tmp / 100;
                    tmp = tmp % 100;
                    int b = tmp / 10;
                    int c = tmp % 10;
                    if(((a+b+c)&1) == 0){
                        rs++;
                    }
                }
            }
            return rs;
        }
    }

}
