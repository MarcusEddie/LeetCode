package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E11 {

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(heights));
        int[] heights1 = {1,1};
        System.out.println(new Solution().maxArea(heights1));
        int[] heights2 = {2,3,10,5,7,8,9};
        System.out.println(new Solution().maxArea(heights2));
        int[] heights4 = {0,14,6,2,10,9,4,1,10,3};
        System.out.println(new Solution().maxArea(heights4));
    }
   
    private static class Solution {
        public int maxArea(int[] heights) {
            int rs = 0;
            Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < heights.length; i++) {
                if (map.containsKey(heights[i])) {
                    List<Integer> tmp = map.get(heights[i]);
                    tmp.add(i);
                    map.put(heights[i], tmp);
                } else {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(i);
                    map.put(heights[i], tmp);
                }
                
                if (!list.contains(heights[i])) {
                    list.add(heights[i]);
                }
            }
            Collections.sort(list);
//            for (int i = 0; i < heights.length; i++) {
//                System.out.print(heights[i] + " ");
//            }
//            System.out.println();
//            System.out.println(list.toString());
//            System.out.println(map.toString());
            int lo = -1;
            int hi = -1;
            for(int i = list.size() - 1; i >= 0; i--) {
                int height = list.get(i);
                List<Integer> idxs = map.get(height);
                if (idxs.size() == 1 && lo == -1 && hi == -1) {
                    lo = idxs.get(0);
                    hi = idxs.get(0);
                    continue;
                } else if (idxs.size() == 1) {
                    if (!(lo <= idxs.get(0) && idxs.get(0) <= hi)) {
                        if (idxs.get(0) < lo) {
                            int product = height * (hi- idxs.get(0));
                            if (product > rs) {
                                lo = idxs.get(0);
                                rs = product;
                            }
                        } else if (idxs.get(0) > hi) {
                            int product = height * (idxs.get(0) - lo);
                            if (product > rs) {
                                hi = idxs.get(0);
                                rs = product;
                            }
                        }
                    }
                } else if (idxs.size() > 1) {
                    int min = idxs.get(0);
                    int max = idxs.get(idxs.size() - 1);
                    if (lo == -1 && hi == -1) {
                        lo = min;
                        hi = max;
                        rs = height *(hi - lo);
                    } else {
                        if (lo <= min && min <= hi && lo <= max && max <= hi) {
                            ;
                        } else if (lo <= min && min <= hi && max > hi) {
                            int product = height * (max - lo);
                            if (product > rs) {
                                hi = max;
                                rs = product;
                            }
                        } else if (min < lo && lo <= max && max <= hi) {
                            int product = height * (hi - min);
                            if (product > rs) {
                                lo = min;
                                rs = product;
                            }
                        } else if (min < lo && max > hi) {
                            int product = height * (max - min);
                            if (product > rs) {
                                lo = min;
                                hi = max;
                                rs = product;
                            }
                        } else if (lo < min) {
                            int product = height * (max - lo);
                            if (product > rs) {
                                hi = max;
                                rs = product;
                            }
                        } else if (max < lo) {
                            int product = height * (hi - min);
                            if (product > rs) {
                                lo = min;
                                rs = product;
                            }
                        }
                    }
                }
            }
            return rs;
        }
    }
}
