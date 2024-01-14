package BinaryTree;

public class PathSumIII {
    int count;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        pathSumHelp(root, 0, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    public void pathSumHelp(TreeNode node, long sum, int targetSum) {
        if (node == null) {
            return;
        }
        if (sum + node.val == targetSum) {
            count += 1;
        }
        pathSumHelp(node.left, sum + node.val, targetSum);
        pathSumHelp(node.right, sum + node.val, targetSum);
    }
}
