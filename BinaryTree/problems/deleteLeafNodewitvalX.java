// Delete leaf nodes with value as x gfg
package BinaryTree.problems;

import java.util.*;

public class deleteLeafNodewitvalX {
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

    public static Node deleteLeaves(Node root, int x) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        if (root.left == null && root.right == null && root.val == x) {
            return null;
        }

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
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(4);
        int x = 4;
        levelorder(root);
        System.out.println();
        deleteLeaves(root, x);
        levelorder(root);

    }
}
