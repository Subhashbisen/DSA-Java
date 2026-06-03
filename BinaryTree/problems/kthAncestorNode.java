// Kth Ancestor in a Tree gfg

package BinaryTree.problems;

public class kthAncestorNode {
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

    public static int ans = -1;

    public static int kthAncestor(Node root, int k, int node) {
        if (root == null) {
            return -1;
        }

        if (root.val == node) {
            return 0;
        }

        int leftdist = kthAncestor(root.left, k, node);
        int rightdist = kthAncestor(root.right, k, node);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }

        int dist = Math.max(leftdist, rightdist) + 1;

        if (dist == k) {
            ans = root.val;
        }

        return dist;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int k = 2, node = 4;

        kthAncestor(root, k, node);
        System.out.println(ans);
    }
}
