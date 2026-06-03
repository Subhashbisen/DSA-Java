package BinaryTree.problems;

import java.util.*;

public class lowerCommonAncestor {
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

    public static boolean path(Node root, int q, ArrayList<Integer> list) {

        if (root == null) {
            return false;
        }

        list.add(root.val);

        if (root.val == q) {
            return true;
        }

        if (path(root.left, q, list) || path(root.right, q, list)) {
            return true;
        }

        list.remove(list.size() - 1);
        return false;
    }

    public static int findLCA(ArrayList<Integer> listp, ArrayList<Integer> listq) {
        int i = 0;

        while (i < listp.size()
                && i < listq.size()
                && listp.get(i).equals(listq.get(i))) {
            i++;
        }

        return listp.get(i - 1);
    }

    public static Node findLca2(Node root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }

        Node leftlca = findLca2(root.left, p, q);
        Node rightlca = findLca2(root.right, p, q);

        if (leftlca == null) {
            return rightlca;
        }

        if (rightlca == null) {
            return leftlca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> listp = new ArrayList<>();
        ArrayList<Integer> listq = new ArrayList<>();
        int p = 4;
        int q = 5;
        path(root, p, listp);
        path(root, q, listq);

        Node lca = findLca2(root, p, q);
        System.out.println(lca.val);
        // System.out.println(findLCA(listp, listq));
    }
}
