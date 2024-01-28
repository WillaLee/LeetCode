package BinaryTree;

public class DeleteNodeInABST450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                root.val = temp.val;
                root.right = deleteNode(root.right, root.val);
                return root;
            }
        }
        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);
        return root;
    }

}
