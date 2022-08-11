package Company.amazon.TreesandGraphs;

public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));

//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
    }

    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public static boolean check(TreeNode t1, TreeNode t2){
        if ( t1 == null && t2 == null) return true;
        if ( t1 == null || t2 == null) return false;
        return t1.val == t2.val && check(t1.left, t2.right) && check(t1.right, t2.left);
    }
}
