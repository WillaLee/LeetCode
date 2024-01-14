package BinaryTree;

public class LongestZigZagPathInABinaryTree {
    int pathLength = 0;

    public int longestZigZag(TreeNode root) {
        help(root.right, 0, 'l');
        help(root.left, 0, 'r');
        return pathLength;
    }

    public void help(TreeNode node, int currentLength, char direction) {
        if (node == null) {
            pathLength = Math.max(pathLength, currentLength);
            return;
        }
        currentLength++;
        if (direction == 'l') {
            help(node.left, currentLength, 'r');
            help(node.right, 0, 'l');
        } else {
            help(node.right, currentLength, 'l');
            help(node.left, 0, 'r');
        }
    }
}
