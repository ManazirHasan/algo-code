package algo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeView {
    //bottom view,topview,leftview and rightview
    static int markedOrMemorizedUpToLevelHasBeenTravelled=-1;
    public static void main(String[] args) {
        System.out.println("--------------");
        TreeNode root = TreeNode.buildTree();
        System.out.println("\n");
        Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        //bottomView(root,0,hMap);
        //System.out.println(hMap);
        //topView(root,0,hMap);
        //System.out.println("");
        //System.out.println(hMap);
        //leftView(root,0);
        //System.out.println("");
        rightView(root,0);
        System.out.println("");

    }

    private static void topView(TreeNode root, int base, Map<Integer, Integer> tm) {
        if (root != null) {
            System.out.print(root+"-");
            if(tm.get(base)==null) {
                tm.put(base, root.data);
            }
            topView(root.left,base-1,tm);
            topView(root.right,base+1,tm);
        }
    }//{-1=100, 0=30, -2=9, 1=32, 2=35}

    private static void bottomView(TreeNode root, int base, Map<Integer, Integer> tm) {
        if (root != null) {
            bottomView(root.left,base-1,tm);
            System.out.print(root.data+"-");
            tm.put(base, root.data);
            bottomView(root.right,base+1,tm);
        }
    }//{-1=100, 0=30, -2=9, 1=32, 2=35}

    //preorder traversal
    private static void leftView(TreeNode root, int currentLevel) {
        if (root != null) {
            if(!(currentLevel<=markedOrMemorizedUpToLevelHasBeenTravelled)) {
                System.out.print(root.data + "-");
                markedOrMemorizedUpToLevelHasBeenTravelled=currentLevel;
            }
            leftView(root.left,currentLevel+1);
            //tm.put(base, root.data);
            leftView(root.right,currentLevel+1);
        }
    }

    private static void rightView(TreeNode root, int currentLevel) {
        if (root != null) {
            if(!(currentLevel<=markedOrMemorizedUpToLevelHasBeenTravelled)) {
                System.out.print(root.data + "-");
                markedOrMemorizedUpToLevelHasBeenTravelled=currentLevel;
            }
            rightView(root.right,currentLevel+1);
            rightView(root.left,currentLevel+1);
            //tm.put(base, root.data);
        }
    }
}
