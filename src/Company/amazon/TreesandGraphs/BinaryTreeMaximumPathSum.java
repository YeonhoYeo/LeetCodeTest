package Company.amazon.TreesandGraphs;

public class BinaryTreeMaximumPathSum {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(-1);

        System.out.println(maxPathSum(root));
    }

    static int maxVal = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        gain(root);
        return maxVal;
    }

    public static int gain(TreeNode root) {
        if (root == null) return 0;
        int leftGain = Math.max(0, gain(root.left));
        int rightGain = Math.max(0, gain(root.right));
        maxVal = Math.max(maxVal, root.val + leftGain + rightGain);
        return root.val + Math.max(leftGain, rightGain);
    }
}
