package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSide = new ArrayList<>();
        help(root, 0, rightSide);
        return rightSide;
    }

    public void help(TreeNode node, int currentDepth, List<Integer> rightSide) {
        if (node == null) { return; }
        if (currentDepth == rightSide.size()) { rightSide.add(node.val); }
        help(node.right, currentDepth + 1, rightSide);
        help(node.left, currentDepth + 1, rightSide);
    }
}
