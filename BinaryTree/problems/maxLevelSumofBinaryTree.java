// 1161. Maximum Level Sum of a Binary Tree leetcode
package BinaryTree.problems;

import java.util.*;

public class maxLevelSumofBinaryTree {
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

    public static int maxLevelSum(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 1;
        int anslevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();

            int currSum = 0;

            for (int i = 0; i < size; i++) {
                Node curr = q.remove();

                currSum += curr.val;

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                anslevel = level;
            }

            level++;
        }

        return anslevel;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(7);
        root.right = new Node(-3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(2);
        root.right.right = new Node(-1);

        root.left.left.left = new Node(10);

        System.out.println(maxLevelSum(root));
    }
}
