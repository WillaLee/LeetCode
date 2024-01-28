package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

public class KthSmallestElementInABST230 {
  public int kthSmallest(TreeNode root, int k) {
    //recursion
    ArrayList<Integer> inorder = new ArrayList<>();
    help(root, k, inorder);
    System.out.println(inorder);
    return inorder.get(k - 1);
  }

  //recursion
  public void help(TreeNode node, int k, ArrayList<Integer> inorder) {
    if (node == null || inorder.size() == k) return;
    help(node.left, k, inorder);
    if (inorder.size() == k) return;
    inorder.add(node.val);
    if (inorder.size() == k) return;
    help(node.right, k, inorder);
  }
}
