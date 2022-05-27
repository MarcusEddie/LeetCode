package contest.biweekly.c78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C {

    public static void main(String[] args) {
        ATM solution = new ATM();
        int[][] tiles = {{1,5},{10,11},{12,18},{20,25},{30,32}};
        System.out.println(solution.maximumWhiteTiles(tiles, 9));
        int[][] tiles1 = {{10,11},{1,1}};
        System.out.println(solution.maximumWhiteTiles(tiles1, 2));
    }

    private static class ATM {
        public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
            int rs= 0;
            List<Integer> list = new ArrayList<Integer>();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < tiles.length; i++) {
                list.add(tiles[i][0]);
                map.put(tiles[i][0], tiles[i][1]);
            }
            Collections.sort(list);
//            List<Integer> sorted = new ArrayList<Integer>();
            int prevEnd = map.get(list.get(0));
            List<int[]> sorted = new ArrayList<int[]>();
            int[] order = new int[2];
            order[0] = list.get(0);
            order[1] = prevEnd;
            sorted.add(order);
            for (int i = 1; i < list.size(); i++) {
                int start = list.get(i);
                int curEnd = map.get(start);
                if (start - 1 == prevEnd) {
                    int[] ord = new int[2];
                    int[] tmp = sorted.remove(sorted.size() - 1);
                    ord[0] = tmp[0];
                    ord[1] = curEnd;
                    sorted.add(ord);
//                    tmp = tmp + curEnd - start + 1;
//                    sorted.add(tmp);
                } else {
                    int[] ord = new int[2];
                    ord[0] = start;
                    ord[1] = curEnd;
                    sorted.add(ord);
//                    sorted.add(start - prevEnd - 1);
//                    sorted.add(curEnd - start + 1);
                }
                prevEnd = curEnd;
            }
            int len = carpetLen;
//            for(int i = 0; i < sorted.size(); i++) {
//                if ((i & 1) == 0) {
//                    if (sorted.get(i) >= carpetLen) {
//                        rs = carpetLen;
//                        break;
//                    } else {
//                        rs += sorted.get(i);
//                        len -= sorted.get(i);
//                        if (len <= 0) {
//                            break;
//                        }
//                    }
//                } else {
//                    len -= sorted.get(i);
//                    if (len <= 0) {
//                        break;
//                    }
//                }
//            }
            for (int i = 0; i < sorted.size(); i++) {
                System.out.println(Arrays.toString(sorted.get(i)));
            }
            int idx = 0;
            while (idx < sorted.size()) {
                for (int i = idx; i < sorted.size(); i++) {
                    
                }
            }
            return rs;
        }
    }

}
