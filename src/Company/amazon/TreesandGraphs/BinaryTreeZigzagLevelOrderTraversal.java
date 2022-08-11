package Company.amazon.TreesandGraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        zigzagLevelOrder(root);

//        Arrays.deepToString();

        System.out.println(rtnList);

    }

    static List<List<Integer>> rtnList = new ArrayList<>();

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        NodeToList(root, 0);
        return rtnList;
    }

    public static void NodeToList(TreeNode root, int level) {
        if (root == null) return;
        if (rtnList.size() == level) rtnList.add(new ArrayList<>());
        if (level % 2 ==0) {
            rtnList.get(level).add(root.val);
        } else {
            rtnList.get(level).add(0, root.val);
        }
        if (root.left != null) NodeToList(root.left, level + 1);
        if (root.right != null) NodeToList(root.right, level + 1);
    }

}
