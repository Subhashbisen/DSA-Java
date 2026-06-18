// 515. Find Largest Value in Each Tree Row leetcode
package BinaryTree.problems;

import java.util.*;

public class LargestValinEachTreeRow {
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

    public static List<Integer> largestValues(Node root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {

                Node curr = q.poll();

                max = Math.max(max, curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            ans.add(max);
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(3);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(largestValues(root));
    }
}
