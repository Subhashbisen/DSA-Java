// 100. Same Tree leetcode
package BinaryTree.problems;

public class SameTree {
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

    public static boolean isSame(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;

        }

        if (p.val != q.val) {
            return false;
        }

        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    public static void main(String[] args) {
        Node p = new Node(10);

        p.left = new Node(5);
        p.right = new Node(15);

        p.left.left = new Node(3);
        p.left.right = new Node(7);

        p.right.left = new Node(12);
        p.right.right = new Node(20);

        p.left.left.left = new Node(1);

        p.right.left.right = new Node(13);

        Node q = new Node(10);

        q.left = new Node(5);
        q.right = new Node(15);

        q.left.left = new Node(3);
        q.left.right = new Node(7);

        q.right.left = new Node(12);
        q.right.right = new Node(20);

        q.left.left.left = new Node(1);

        q.right.left.right = new Node(13);

        System.out.println(isSame(p, q));
    }
}
