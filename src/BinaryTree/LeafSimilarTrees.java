package BinaryTree;

import java.util.HashSet;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        int leafValSeq1 = leafValSeq(root1, 401);
        int leafValSeq2 = leafValSeq(root2, 402);
        return leafValSeq1 == leafValSeq2;
    }

    public int leafValSeq(TreeNode node, int ratio) {
        if (node.left == null && node.right == null) {
            return node.val * ratio;
        }
        int left = 0, right = 0;
        if (node.left != null) {
            left = leafValSeq(node.left, ratio * 401);
        }
        if (node.right != null) {
            right = leafValSeq(node.right, ratio * 409);
        }
        return left + right;
    }
}
