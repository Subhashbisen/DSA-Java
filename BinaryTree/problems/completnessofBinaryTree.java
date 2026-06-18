// 958. Check Completeness of a Binary Tree leetcode
package BinaryTree.problems;

import java.util.*;

import javax.swing.tree.TreeNode;

public class completnessofBinaryTree {
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

    public static boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        boolean seenNull = false;

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                seenNull = true;
            } else {
                if (seenNull) {
                    return false;
                }

                q.add(curr.left);
                q.add(curr.right);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(3);

        root.left = new Node(9);

        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(isCompleteTree(root));

    }
}
