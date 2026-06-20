// 2641. Cousins in Binary Tree II
package BinaryTree.problems;

import java.util.*;

public class CousinsinBinaryTree2 {
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
        Node parent;
        int childSum;

        pair(Node parent, int childSum) {
            this.parent = parent;
            this.childSum = childSum;
        }
    }

    public static Node replaceValueInTree(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        root.val = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            int levelSum = 0;
            List<pair> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node currparent = q.remove();

                int childSum = 0;

                if (currparent.left != null) {
                    childSum += currparent.left.val;
                    levelSum += currparent.left.val;
                    q.add(currparent.left);
                }
                if (currparent.right != null) {
                    childSum += currparent.right.val;
                    levelSum += currparent.right.val;
                    q.add(currparent.right);
                }

                list.add(new pair(currparent, childSum));
            }

            for (pair p : list) {
                int newValue = levelSum - p.childSum;

                if (p.parent.left != null) {
                    p.parent.left.val = newValue;
                }

                if (p.parent.right != null) {
                    p.parent.right.val = newValue;
                }
            }

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
        Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(9);

        root.left.left = new Node(1);
        root.left.right = new Node(10);

        root.right.right = new Node(7);

        Node newRoot = replaceValueInTree(root);
        levelorder(newRoot);
    }
}