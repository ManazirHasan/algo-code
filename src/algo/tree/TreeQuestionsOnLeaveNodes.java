package algo.tree;

public class TreeQuestionsOnLeaveNodes {

    public static void main(String[] args) {
        //numberOfSizeOfTree,heightOfBT,sumTree,numberOfLevelOfGivenNode
        //minimumdistance between two tree?
        System.out.println("------------BuildTree---------------");
        TreeNode root = TreeNode.buildTree();

        int size = numberOfSizeOfTree(root);
        System.out.println(size);

        int height = 0;
        int heightOfTree = heightOfBT(root, height);//????
        System.out.println(heightOfTree);

        TreeNode treeNode = sumTree(root);
        //postOrder(treeNode);
        int nodeValue=30;
        int level = numberOfLevelOfGivenNode(root,nodeValue,0);
        System.out.println(level);
    }

    private static int heightOfBT(TreeNode root, int height) {
        if (root == null)
            return 1;
        int leftHeight = heightOfBT(root.left, height + 1);
        int rightHeight = heightOfBT(root.right, height + 1);
        if (leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }

    private static int numberOfLevelOfGivenNode(TreeNode root, int nodeValue, int level) {

        if (root == null)
            return -1;
        if (root.data == nodeValue)
            return level;
        int left = numberOfLevelOfGivenNode(root.left, nodeValue, level + 1);
        if (left != -1)
            return left;
        int right = numberOfLevelOfGivenNode(root.right, nodeValue, level + 1);
        if (right != -1)
            return right;
        return -1;

    }



    private static int numberOfSizeOfTree(TreeNode node) {
        if (node == null)
            return 0;
        int left = numberOfSizeOfTree(node.left);
        int right = numberOfSizeOfTree(node.right);
        int numberOfSize = left + right + 1;
        return numberOfSize;
    }

    static TreeNode sumTree(TreeNode node) {
        if (node == null)
            return null;
        TreeNode left = sumTree(node.left);
        TreeNode right = sumTree(node.right);
        if (left != null && right != null) {
            node.data = node.data + left.data + right.data;
        } else if (right != null && left == null) {
            node.data = node.data + right.data;
        } else if (left != null && right == null) {
            node.data = node.data + left.data;
        }
        return node;
    }

    static int sumTree2(TreeNode node) {
        if (node == null)
            return 0;
        int leftValue = sumTree2(node.left);
        int rightValue = sumTree2(node.right);
        node.data = node.data + leftValue + rightValue;
        return node.data;
    }
}

