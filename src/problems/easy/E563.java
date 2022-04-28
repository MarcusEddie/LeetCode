package problems.easy;

public class E563 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)), new TreeNode(9, null, new TreeNode(7)));
        System.out.println(new Solution().findTilt(root));
    }

    private static class Solution {
        public int findTilt(TreeNode root) {
            if (null == root) {
                return 0;
            }
            Triple triple = pre(root);
            System.out.println(triple.left + " "+triple.right + " " + triple.sum);
            return triple.diffSum;
        }
        
        private Triple pre(TreeNode root) {
            if (null == root.left && null == root.right) {
                return new Triple(0, 0, 0);
            }
            Triple triple = new Triple(0, 0, 0);
            int sum = 0;
            int left = 0;
            if (null != root.left) {
                left += root.left.val;
                Triple tmp = pre(root.left);
                left += tmp.sum;
                sum += tmp.diffSum;
            }
            int right = 0;
            if (null != root.right) {
                right += root.right.val;
                Triple tmp = pre(root.right);
                right += tmp.sum;
                sum += tmp.diffSum;
            }
            triple.left = left;
            triple.right = right;
            triple.sum = left + right;
            triple.diffSum = Math.abs(left - right) + sum;
            return triple;
        }

        private class Triple {
            public int left;
            public int right;
            public int sum;
            public int diffSum;
            public Triple(int left, int right, int sum) {
                this.left = left;
                this.right = right;
                this.sum = sum;
            }

            @Override
            public String toString() {
                return "Triple [left=" + left + ", right=" + right + ", sum=" + sum + "]";
            }
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
        }
    }
}
