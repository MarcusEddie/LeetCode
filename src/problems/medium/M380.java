package problems.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class M380 {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
    
    private static class RandomizedSet {
        private List<Integer> slot;
        public RandomizedSet() {
            slot  = new ArrayList<Integer>();
        }
        
        public boolean insert(int val) {
            Boolean rs = true;
            if (slot.contains(val)) {
                rs = false;
            } else {
                slot.add(val);
            }
            return rs;
        }
        
        public boolean remove(int val) {
            Boolean rs = true;
            if (slot.contains(val)) {
                slot.remove(Integer.valueOf(val));
            } else {
                rs = false;
            }
            return rs;
        }
        
        public int getRandom() {
            int rs = 0;
            Random random = new Random();
            int idx = random.nextInt(slot.size());
            rs = slot.get(idx);
            return rs;
        }
    }

}
