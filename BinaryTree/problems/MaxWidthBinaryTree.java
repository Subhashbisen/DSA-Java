// 662. Maximum Width of Binary Tree leetcode
package BinaryTree.problems;

import java.util.*;

public class MaxWidthBinaryTree {
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

    public static class pair {
        Node node;
        int index;

        pair(Node node, int index) {
            this.node = node;
            this.index = index;
        }

    }

    public static int maxWidth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            int first = q.peek().index;
            int last = first;

            for (int i = 0; i < size; i++) {
                pair curr = q.remove();

                int index = curr.index;
                last = index;

                if (curr.node.left != null) {
                    q.add(new pair(curr.node.left, 2 * index + 1));
                }
                if (curr.node.right != null) {
                    q.add(new pair(curr.node.right, 2 * index + 2));
                }

            }
            maxWidth = Math.max(maxWidth, (last - first + 1));
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(2);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.right = new Node(9);

        System.out.println(maxWidth(root));
    }
}