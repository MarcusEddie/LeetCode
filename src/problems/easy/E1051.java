package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.SliderUI;
import javax.swing.table.TableModel;

public class E1051 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int heightChecker(int[] heights) {
            int rs = 0;
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < heights.length; i++) {
                tmp.add(heights[i]);
            }
            Collections.sort(tmp);
            for (int i = 0; i < heights.length; i++) {
                if (!tmp.get(i).equals(heights[i])) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
