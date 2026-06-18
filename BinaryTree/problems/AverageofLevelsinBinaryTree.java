// Average of Levels in Binary Tree leetcode
package BinaryTree.problems;

import java.util.*;

public class AverageofLevelsinBinaryTree {
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

    public static ArrayList<Double> averageOfLevels(Node root) {
        ArrayList<Double> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                Node curr = q.remove();
                sum += curr.val;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            list.add((double) sum / size);
        }

        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(3);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(averageOfLevels(root));
    }
}
