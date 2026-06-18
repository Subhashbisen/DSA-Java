// 1609. Even Odd Tree leetcode 
package BinaryTree.problems;

import java.util.*;

public class oddEven {
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

    public static boolean isEvenOdd(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int prev;

            if (level % 2 == 0) {
                prev = Integer.MIN_VALUE;

                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();

                    if (curr.val % 2 == 0) {
                        return false;
                    }

                    if (curr.val <= prev) {
                        return false;
                    }

                    prev = curr.val;

                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            } else {
                prev = Integer.MAX_VALUE;

                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();

                    if (curr.val % 2 != 0) {
                        return false;
                    }

                    if (curr.val >= prev) {
                        return false;
                    }

                    prev = curr.val;

                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }

            level++;
        }
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(10);
        root.right = new Node(4);

        root.left.left = new Node(3);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        root.left.left.left = new Node(12);
        root.left.left.right = new Node(8);

        root.right.left.left = new Node(6);

        root.right.right.right = new Node(3);

        System.out.println(isEvenOdd(root));
    }
}