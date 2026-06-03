// Min distance between two nodes of a Binary Tree gfg

package BinaryTree.problems;

public class minDistancebtwntwonodes {

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

    public static Node findLca(Node root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }

        Node leftlca = findLca(root.left, p, q);
        Node rightlca = findLca(root.right, p, q);

        if (leftlca == null) {
            return rightlca;
        }

        if (rightlca == null) {
            return leftlca;
        }

        return root;
    }

    public static int lcaDist(Node root, int val) {

        if (root == null) {
            return -1;
        }

        if (root.val == val) {
            return 0;
        }

        int leftVal = lcaDist(root.left, val);
        int rightVal = lcaDist(root.right, val);

        if (leftVal == -1 && rightVal == -1) {
            return -1;
        } else if (leftVal == -1) {
            return rightVal + 1;
        } else {
            return leftVal + 1;
        }
    }

    public static int minDist(Node root, int p, int q) {
        Node lca = findLca(root, p, q);

        int dist1 = lcaDist(lca, p);
        int dist2 = lcaDist(lca, q);

        return dist1 + dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int p = 4, q = 5;

        System.out.println(minDist(root, p, q));
    }
}
