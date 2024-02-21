package BinaryTree;

public class PathSum112 {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    return help(root, 0, targetSum);
  }

  private boolean help(TreeNode node, int sum, int targetSum) {
    if (node == null) return false;
    sum += node.val;
    if (node.left == null && node.right == null) return sum == targetSum;
    return help(node.left, sum, targetSum) || help(node.right, sum, targetSum);
  }
}
