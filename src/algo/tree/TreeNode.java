package algo.tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    private TreeNode(){


    }
    public static TreeNode buildTree() {
        TreeNode root = new TreeNode();
        root.data = 20;

        TreeNode rootLeft = new TreeNode();
        rootLeft.data = 11;
        TreeNode rootRight = new TreeNode();
        rootRight.data = 32;
        root.left = rootLeft;
        root.right = rootRight;

        TreeNode rootLeftLeft = new TreeNode();
        rootLeftLeft.data = 9;
        rootLeftLeft.left = null;
        rootLeftLeft.right = null;
        TreeNode rootLeftRight = new TreeNode();
        rootLeftRight.data = 15;
        rootLeftRight.left = null;
        rootLeftRight.right = null;
        rootLeft.left = rootLeftLeft;
        rootLeft.right = rootLeftRight;


        TreeNode rootRightLeft = new TreeNode();
        rootRightLeft.data = 30;
        rootRightLeft.left = null;
        rootRightLeft.right = null;

        TreeNode rootRightRight = new TreeNode();
        rootRightRight.data = 35;
        rootRightRight.left = null;
        rootRightRight.right = null;
        rootRight.left = rootRightLeft;
        rootRight.right = rootRightRight;

        TreeNode rootRightLeftRight = new TreeNode();
        rootRightLeftRight.data = 100;
        rootRightLeftRight.left = null;
        rootRightLeft.left = rootRightLeftRight;

        return root;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
/*
*                                           20
*
*                                 11                       32
*
*                       9                  15   30                35
*
*									100
*
* * inorder    9,11,15,20,30,32,35
 * preorder   20,11,9,15,32,30,35  //top down data flow
 * postorder  9,15,11,30,35,32,20   //bottom up data flow
 * */
