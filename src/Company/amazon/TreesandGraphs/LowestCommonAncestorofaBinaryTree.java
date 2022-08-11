package Company.amazon.TreesandGraphs;

public class LowestCommonAncestorofaBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode rslt = lowestCommonAncestor(root, root.left, root.right);
        System.out.println("rslt.val = " + rslt.val);

    }

    static TreeNode treeNode = null;
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findTree(root, p, q);
        return treeNode;
    }
    public static boolean findTree(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return false;
        System.out.println("root.val = " + root.val);
        int left = findTree(root.left, p, q) ? 1 : 0;
        int right = findTree(root.right, p, q) ? 1 : 0;
        int mid = (root == p || root == q) ? 1 : 0;
        System.out.println("left = " + left + " : " + right + " : " + mid);
        if ( left + right + mid >= 2) {
            treeNode = root;
        }
        return mid + left+ right > 0;
    }
}
