package problems.easy;

public class E2164 {

    public static void main(String[] args) {
        int[] nums = {5,39,33,5,12,27,20,45,14,25,32,33,30,30,9,14,44,15,21};
        int[] rs = new Soluction().sortEvenOdd(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Soluction{
        public int[] sortEvenOdd(int[] nums) {
            int[] odd = new int[101];
            int[] even = new int[101];
            for(int i = 0; i < nums.length; i++){
                if((i & 1) == 0){
                    even[nums[i]]++;
                } else{
                    odd[nums[i]]++;
                }
            }
            int[] rs = new int[nums.length];
            int idx = 0;
            for(int i = 0; i < even.length; i++){
                int times = even[i];
                while(times != 0){
                    rs[idx] = i;
                    idx = idx + 2;
                    times--;
                }
            }
            idx = 1;
            for(int i = odd.length - 1; i >=0; i--){
                int times = odd[i];
                while(times != 0){
                    rs[idx] = i;
                    idx = idx + 2;
                    times--;
                }
            }
            return rs;
        }
    }

}
