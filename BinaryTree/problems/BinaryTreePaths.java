// 257. Binary Tree Paths leetcode
package BinaryTree.problems;

import java.util.*;

public class BinaryTreePaths {
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

    public static void getAllpath(Node root, List<Integer> path,
            List<List<Integer>> ans) {
        if (root == null) {
            return;
        }

        path.add(root.val);

        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        }

        getAllpath(root.left, path, ans);
        getAllpath(root.right, path, ans);

        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        getAllpath(root, path, ans);

        System.out.println(ans);

    }
}