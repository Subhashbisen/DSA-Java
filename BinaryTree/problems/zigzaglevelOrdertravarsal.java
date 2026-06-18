// 103. Binary Tree Zigzag Level Order Traversal leetcode
package BinaryTree.problems;

import java.util.*;

import javax.swing.tree.TreeNode;

public class zigzaglevelOrdertravarsal {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.remove();
                currLevel.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (level % 2 != 0) {
                Collections.reverse(currLevel);
            }

            ans.add(currLevel);

            level++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        root.left.right.left = new Node(10);

        root.right.right.left = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println(zigzagLevelOrder(root));
    }
}