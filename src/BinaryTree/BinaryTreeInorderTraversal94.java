package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    help(root, result);
    return result;
  }

  private void help(TreeNode node, List<Integer> result) {
    if (node == null) {
      return;
    }
    help(node.left, result);
    result.add(node.val);
    help(node.right, result);
  }
}
