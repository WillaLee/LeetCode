package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        List<Integer> sums = new ArrayList<>();
        sumDepth(root, sums, 0);
        int max = sums.get(0);
        int maxDepth = 1;
        for (int i = 0; i < sums.size(); i++) {
            if (max < sums.get(i)) {
                max = sums.get(i);
                maxDepth = i + 1;
            }
        }
        return maxDepth;
    }

    public void sumDepth(TreeNode node, List<Integer> sums, int currentDepth) {
        if (node == null) {
            return;
        }
        if (sums.size() > currentDepth) {
            sums.set(currentDepth, sums.get(currentDepth) + node.val);
        } else {
            sums.add(currentDepth, node.val);
        }
        sumDepth(node.left, sums, currentDepth + 1);
        sumDepth(node.right, sums, currentDepth + 1);
    }
}
