// 113. Path Sum II leetcode
package BinaryTree.problems;

import java.util.*;

public class pathSum2 {
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

    public static void pathSum(Node root, int target, List<Integer> path, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }

        path.add(root.val);

        if (root.left == null && root.right == null) {
            if (target == root.val) {
                ans.add(new ArrayList<>(path));
            }
        }

        pathSum(root.left, target - root.val, path, ans);
        pathSum(root.right, target - root.val, path, ans);

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(11);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);

        root.right.left = new Node(13);
        root.right.right = new Node(4);

        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);

        int target = 22;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        pathSum(root, target, path, ans);

        System.out.println(ans);

    }
}
