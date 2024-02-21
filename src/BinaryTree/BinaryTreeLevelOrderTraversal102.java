package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    //DFS method
//    List<List<Integer>> result = new ArrayList<>();
//    help(root, result, 0);
//    return result;

    //BFS method
    Queue<TreeNode> nodesInDepth = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    nodesInDepth.add(root);
    while (!nodesInDepth.isEmpty()) {
      int count = nodesInDepth.size();
      List<Integer> valInDepth = new ArrayList<>();
      for (int i = 0; i < count; i++) {
        TreeNode temp = nodesInDepth.poll();
        if (temp == null) continue;
        valInDepth.add(temp.val);
        nodesInDepth.add(temp.left);
        nodesInDepth.add(temp.right);
      }
      if (!valInDepth.isEmpty()) result.add(valInDepth);
    }
    return result;
  }

  //DFS method
//  private void help(TreeNode root, List<List<Integer>> result, int depth) {
//    if (root == null) return;
//    if (depth >= result.size()) {
//      List<Integer> newDepth = new ArrayList<>();
//      newDepth.add(root.val);
//      result.add(newDepth);
//    } else {
//      result.get(depth).add(root.val);
//    }
//    help(root.left, result, depth + 1);
//    help(root.right, result, depth + 1);
//  }
}
