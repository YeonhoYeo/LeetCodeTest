package Company.amazon.TreesandGraphs;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(4);
        root3.right = new TreeNode(6);
        root3.right.left = new TreeNode(3);
        root3.right.right = new TreeNode(7);

        System.out.println(isValidBST(root3));
    }

    public static boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }

    public static boolean check(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        return check(root.left, low, root.val) && check(root.right, root.val, high);
    }

}
