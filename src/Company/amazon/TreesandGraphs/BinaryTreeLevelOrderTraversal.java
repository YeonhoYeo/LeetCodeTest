package Company.amazon.TreesandGraphs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        levelOrder(root);

        System.out.println(rtnLst);

    }

    static List<List<Integer>> rtnLst = new ArrayList<>();
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if ( root == null) return rtnLst;
        treeToList(root, 0);
        return rtnLst;
    }

    public static void treeToList(TreeNode root, int level) {
        if (rtnLst.size() == level) rtnLst.add(new ArrayList<Integer>());
        rtnLst.get(level).add(root.val);
        if (root.left != null) treeToList(root.left, level + 1);
        if (root.right != null) treeToList(root.right, level + 1);
    }
}
