// 199. Binary Tree Right Side View leetcode
package BinaryTree.problems;

import java.util.*;

public class RightSideView {
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

    public static List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 1; i <= size; i++) {
                Node curr = q.remove();
                if (i == size) {
                    list.add(curr.val);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);

        root.right.left = new Node(50);
        root.right.right = new Node(60);

        root.right.left.right = new Node(70);

        // ArrayList<Integer> list = new ArrayList<>();

        System.out.println(rightSideView(root));
    }
}
