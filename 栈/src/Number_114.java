import java.util.Stack;

/**
 * @ClassName NUm
 * @Description 114. 二叉树展开为链表
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @Author fan
 * @CreateTime 2021/11/20 4:37下午
 * @Version 1.0
 */

public class Number_114 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(1);
        treeNode.right.left = new TreeNode(4);
        flatten(treeNode);
    }

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (pre != null) {
                pre.left = null;
                pre.right = cur;
            }
            TreeNode left = cur.left;
            TreeNode right = cur.right;
            if (right != null) {
                stack.push(right);
            }
            if (left != null) {
                stack.push(left);
            }
            pre = cur;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
