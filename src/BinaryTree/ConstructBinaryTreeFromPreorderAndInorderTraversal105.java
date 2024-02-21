package BinaryTree;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    //basic solution
    switch (preorder.length) {
      case 0 : return null;
      case 1 : return new TreeNode(preorder[0]);
    }
    TreeNode root = new TreeNode(preorder[0]);
    int findRootIndex = 0;
    for (int i = 0; i < inorder.length; i++){
      if (inorder[i] == preorder[0]) {
        findRootIndex = i;
        break;
      }
    }
    int[] inorderLeft = new int[findRootIndex];
    int[] preorderLeft = new int[findRootIndex];
    for (int i = 0; i < findRootIndex; i++) {
      inorderLeft[i] = inorder[i];
      preorderLeft[i] = preorder[1 + i];
    }
    root.left = buildTree(preorderLeft, inorderLeft);
    int[] inorderRight = new int[preorder.length - findRootIndex - 1];
    int[] preorderRight = new int[preorder.length - findRootIndex - 1];
    for (int i = 0; i < preorder.length - findRootIndex - 1; i++) {
      inorderRight[i] = inorder[i + findRootIndex + 1];
      preorderRight[i] = preorder[i + findRootIndex + 1];
    }
    root.right = buildTree(preorderRight, inorderRight);
    return root;
  }
}
