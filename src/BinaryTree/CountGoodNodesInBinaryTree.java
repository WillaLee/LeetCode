package BinaryTree;

public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return gNodeHelp(root, root.val);
    }

    public int gNodeHelp(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int nextMax = Math.max(node.val, max);
        if (node.val < max) {
            return gNodeHelp(node.left, nextMax) + gNodeHelp(node.right,nextMax);
        } else {
            return gNodeHelp(node.left, nextMax) + gNodeHelp(node.right,nextMax) + 1;
        }
    }
}
