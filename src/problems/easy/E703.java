package problems.easy;

import java.util.Arrays;

public class E703 {

    public static void main(String[] args) {
        int[] nums = { 5, -1 };
        int k = 3;
        KthLargest kthLargest = new KthLargest(k, nums);
        System.out.println(kthLargest.add(1));
        System.out.println(kthLargest.add(2));
    }

    private static class KthLargest {

        private int[] slot;
        private int idx = 0;
        private int min = 100001;
        private int max = -100001;
        public KthLargest(int k, int[] nums) {
            slot = new int[20001];
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i] + 10000]++;
                if (max < nums[i]) {
                    max = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            this.idx = k;
        }

        public int add(int val) {
            slot[val + 10000]++;
            if (max < val) {
                max = val;
            }
            if (min>val) {
                min = val;
            }
            int cnt = idx;
            int rs = 0;
            for (int i = max + 10000; i >=min + 10000; i--) {
                if (slot[i] > 0) {
                    cnt -= slot[i];
                    if (cnt <= 0) {
                        rs = i - 10000;
                        break;
                    }
                }
            }
            return rs;
        }

    }

//    private static class KthLargest {
//
//        private int[] heap;
//        private int idx = 0;
//        public KthLargest(int k, int[] nums) {
//            heap = new int[k];
//            if (k<= nums.length) {
//                System.arraycopy(nums, 0, heap, 0, k);
//                idx = k;
//            } else {
//                for (int i = 0; i < nums.length; i++) {
//                    heap[i] = nums[i];
//                    idx++;
//                }
//                for (int i = nums.length; i < heap.length; i++) {
//                    heap[i] = -10001;
//                }
//            }
//            for (int i = heap.length / 2; i >= 0; i--) {
//                heapify(heap, i);
//            }
//            if (k < nums.length) {
//                for (int i = k; i < nums.length; i++) {
//                    if (nums[i] > heap[0]) {
//                        heap[0] = nums[i];
//                        heapify(heap, 0);
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(heap));
//            System.out.println(idx);
//            
//        }
//        
//        public int add(int val) {
//            if (idx >= heap.length && val > heap[0]) {
//                heap[0] = val;
//                heapify(heap, 0);
//            } else if (idx < heap.length) {
//                for (int i = 0; i < heap.length; i++) {
//                    if (heap[i] == -10001) {
//                        heap[i] = val;
//                        break;
//                    }
//                }
//                Arrays.sort(heap);
//                idx++;
//                System.out.println(Arrays.toString(heap));
//                return heap[heap.length - idx];
//                
//            }
//            System.out.println(Arrays.toString(heap));
//            Arrays.sort(heap);
//            return heap[0];
//        }
//        
//        private void heapify(int[] heap, int i) {
//            int left = 2 * i + 1;
//            int right = 2 * i + 2;
//            int root = heap[i];
//            while (left < heap.length) {
//                if (right < heap.length && heap[right] < heap[left] && heap[right] < root) {
//                    heap[i] = heap[right];
//                    i = right;
//                } else if (right < heap.length && heap[left] < heap[right] && heap[left] < root) {
//                    heap[i] = heap[left];
//                    i = left;
//                } else {
//                    break;
//                }
//                heap[i] = root;
//                left = 2 * i + 1;
//                right = 2 * i + 2;
//            }
//        }
//    }

}
