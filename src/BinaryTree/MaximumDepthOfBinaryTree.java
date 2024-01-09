package BinaryTree;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int depth = maxDepthHelp(root);
        return depth;
    }

    public int maxDepthHelp(TreeNode node){
        if (node == null) {
            return 0;
        } else {
            return Math.max(maxDepthHelp(node.left), maxDepthHelp(node.right)) + 1;
        }
    }
}
