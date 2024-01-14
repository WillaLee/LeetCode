package BinaryTree;

import java.util.LinkedList;
import java.util.Stack;

public class LowestCommonAncestorOfABinaryTree {
    Stack<TreeNode> pAncestors = new Stack<>();
    Stack<TreeNode> qAncestors = new Stack<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ancestorDeque(p, root, pAncestors);
        ancestorDeque(q, root, qAncestors);
        TreeNode commonAncestor = pAncestors.peek();
        while (pAncestors.size() != 0 && qAncestors.size() != 0) {
            TreeNode pAncestor = pAncestors.pop();
            TreeNode qAncestor = qAncestors.pop();
            if (pAncestor != qAncestor) {
                return commonAncestor;
            }
            commonAncestor = pAncestor;
        }
        return commonAncestor;
    }

    public boolean ancestorDeque(TreeNode child, TreeNode node, Stack<TreeNode> ancestor) {
        if (node == null) {
            return false;
        }
        if (node == child || ancestorDeque(child, node.right, ancestor) || ancestorDeque(child, node.left, ancestor)) {
            ancestor.push(node);
            return true;
        }
        return false;
    }
}
