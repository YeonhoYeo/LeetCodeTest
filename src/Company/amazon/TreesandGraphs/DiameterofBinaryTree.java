package Company.amazon.TreesandGraphs;

public class DiameterofBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root));
    }

    static int lengthVal = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        search(root);
        return lengthVal;
    }

    public static int search(TreeNode root) {

        if (root == null) return 0;
        int left = search(root.left);
        int right = search(root.right);
        lengthVal = Math.max(lengthVal, left + right);
        return Math.max(left, right) + 1;

    }
}
