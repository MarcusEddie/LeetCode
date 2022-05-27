package contest.weekly.c294;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D {

    public static void main(String[] args) {
        CountIntervals solution = new CountIntervals();
        int[] strength = {1,3,1,2};
        System.out.println(solution.totalStrength(strength));
        int[] strength1 = {5,4,6};
        System.out.println(solution.totalStrength(strength1));
        int[] strength2 = {747,812,112,1230,1426,1477,1388,976,849,1431,1885,1845,1070,1980,280,1075,232,1330,1868,1696,1361,1822,524,1899,1904,538,731,985,279,1608,1558,930,1232,1497,875,1850,1173,805,1720,33,233,330,1429,1688,281,362,1963,927,1688,256,1594,1823,743,553,1633,1898,1101,1278,717,522,1926,1451,119,1283,1016,194,780,1436,1233,710,1608,523,874,1779,1822,134,1984};
        System.out.println(solution.totalStrength(strength2));
    }

    private static class CountIntervals {
        public int totalStrength(int[] strength) {
            int threshold = 1000000000 + 7;
            if (strength.length == 1) {
                return (strength[0] * strength[0]) % threshold;
            }
            int rs = 0;
            Long[] slot = new Long[strength.length + 1];
            slot[0] = 0l;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < strength.length; i++) {
                slot[i + 1] = strength[i] + slot[i];
                int tmp = strength[i];
                tmp = (strength[i] * strength[i]) % threshold;
                rs += tmp;
                if (min > strength[i]) {
                    min = strength[i];
                }
            }
            if (rs >= threshold) {
                rs = rs % threshold;
            }
            rs += (int) ((min * slot[slot.length - 1]) % threshold);
            if (rs >= threshold) {
                rs = rs % threshold;
            }
            for (int i = 2; i < strength.length; i++) {
                int jIdx = strength.length - i;
                min = Integer.MAX_VALUE;
                for (int j = 0; j <= jIdx; j++) {
                    
                    for (int k = j; k < j + i; k++) {
                        if (min > strength[k]) {
                            min = strength[k];
                        }
                    }
                    long tmp = min * (slot[j + i] - slot[j]);
                    rs += (tmp % threshold);
                    if (rs >= threshold) {
                        rs = rs % threshold;
                    }
                }
            }
            
            return rs;
        }
    }

}
