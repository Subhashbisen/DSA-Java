// 993. Cousins in Binary Tree leetcode
package BinaryTree.problems;

import java.util.*;

import Stack.stackusingLinkedList.stack;

public class CousinsinBinaryTree {
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
        int depth;
        Node parent;

        pair(int depth, Node parent) {
            this.depth = depth;
            this.parent = parent;
        }
    }

    public static pair depthParent(Node root, Node parent, int x, int depth) {
        if (root == null) {
            return null;
        }

        if (root.val == x) {
            return new pair(depth, parent);
        }

        pair left = depthParent(root.left, root, x, depth + 1);

        if (left != null) {
            return left;
        }

        return depthParent(root.right, root, x, depth + 1);
    }

    public static boolean isCousins(Node root, int x, int y) {

        pair a = depthParent(root, root, x, 0);
        pair b = depthParent(root, root, y, 0);

        if (a == null || b == null) {
            return false;
        }

        if (a.depth != b.depth) {
            return false;
        }

        if (a.parent.val == b.parent.val) {
            return false;
        }

        return true;
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

        root.right.right.right = new Node(9);

        int x = 4;
        int y = 5;

        System.out.println(isCousins(root, x, y));
    }
}
