package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class E1337 {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] mat = {{1,1,0,0,0},
//                       {1,1,1,1,0},
//                       {1,0,0,0,0},
//                       {1,1,0,0,0},
//                       {1,1,1,1,1}};
//        int k = 3;
//        int[][] mat = {{1,0,0,0},
//         {1,1,1,1},
//         {1,0,0,0},
//         {1,0,0,0}};
//         int k = 2;
        
        int[][] mat = {{1,0},
                {1,0},
                {1,0},
                {1,1}};
        int k = 4;
 
        int[] rs = solution.kWeakestRows(mat, k);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }

}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> rs = new ArrayList<Integer>();
        int[] tmp = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    cnt++;
                }
            }
            tmp[i] = cnt;
            rs.add(cnt);
        }
        Collections.sort(rs);
        List<Integer> rs2 = new ArrayList<Integer>();
        for (Integer integer : rs) {
            Boolean flag = true;
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] >= 0 && integer.equals(tmp[i])) {
                    rs2.add(i);
                    tmp[i] = -1;
                }
                if (rs2.size() >= k) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        tmp = new int[k];
        int i = 0;
        for (Integer integer : rs2) {
            tmp[i++] = integer;
        }
        return tmp;
    }
}