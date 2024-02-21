package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        //DFS solution
//        List<Integer> rightSide = new ArrayList<>();
//        help(root, 0, rightSide);
//        return rightSide;
        //BFS solution
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        List<Integer> result = new ArrayList<>();
        if (root != null) nodes.add(root);
        while (!nodes.isEmpty()) {
            int len = nodes.size();
            TreeNode temp = null;
            for (int i = 0; i < len; i++) {
                temp = nodes.poll();
                if (temp.left != null) nodes.add(temp.left);
                if (temp.right != null) nodes.add(temp.right);
            }
          result.add(temp.val);
        }
        return result;
    }

    //DFS solution
//    public void help(TreeNode node, int currentDepth, List<Integer> rightSide) {
//        if (node == null) { return; }
//        if (currentDepth == rightSide.size()) { rightSide.add(node.val); }
//        help(node.right, currentDepth + 1, rightSide);
//        help(node.left, currentDepth + 1, rightSide);
//    }
}
