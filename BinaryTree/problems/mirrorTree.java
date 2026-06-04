//  Invert Binary Tree leetcode 226

package BinaryTree.problems;

import java.util.*;

public class mirrorTree {
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

    public static Node mirrorTree(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.val + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(6);
        root.right.right = new Node(9);
        levelorder(root);
        System.out.println();
        mirrorTree(root);
        levelorder(root);
    }
}
