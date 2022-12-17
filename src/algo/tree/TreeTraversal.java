package algo.tree;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TreeTraversal {
    // all tree basic, level order,reverse level order (?,extra stack),vertical order //6 types
    // Diagonal Order(?),surface or Boundary traversal(?) anti clock wise , ZigZag or Spiral printing level order Traversal(?)
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        //preOrder(root);
        //System.out.println("\n");
        //inOrder(root1);
        //System.out.println("\n");
        //postOrder(root);
        //System.out.println("\n");
        int totalCountOfNodes=7; //after count
        //levelOrderTraversal(root1,totalCountOfNodes);
        System.out.println("\n");
        Map<Integer, List<Integer>> tm = new HashMap<Integer, List<Integer>>();
        List<Integer> it = new ArrayList<>();
        verticalOrderTraversal(root,0,tm);
        System.out.println("");
        System.out.println(tm);
    }

    private static void verticalOrderTraversal(TreeNode root, int base, Map<Integer, List<Integer>> tm) {
        if (root != null) {
            verticalOrderTraversal(root.left,base-1,tm);
            System.out.print(root.data+"-");
            if (tm.get(base) != null) {
                List<Integer> it = tm.get(base);
                it.add(root.data);
                tm.put(base, it);
            } else {
                List<Integer> it = new ArrayList<>();
                it.add(root.data);
                tm.put(base, it);
            }

            verticalOrderTraversal(root.right,base+1,tm);
        }
    }//{-2=[9], -1=[11], 0=[20, 15, 30], 1=[32], 2=[35]}

    static void levelOrderTraversal(TreeNode root,int totalCountOfNodes) {
        BlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(totalCountOfNodes);
        arrayBlockingQueue.add(root);//add root
        while (arrayBlockingQueue != null && !arrayBlockingQueue.isEmpty()) {
            TreeNode node = (TreeNode) arrayBlockingQueue.poll();
            if (node != null) {
                System.out.print(node.data + "-");
            }
            if (node.left != null || node.right != null) {
                if (node.left != null)
                    arrayBlockingQueue.add(node.left);
                if (node.right != null)
                    arrayBlockingQueue.add(node.right);
            }
        }
    }

    static void preOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + "-");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + "-");
        inOrder(node.right);
    }

    static void postOrder(TreeNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "-");
    }

}
