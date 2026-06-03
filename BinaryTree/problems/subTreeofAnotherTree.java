package BinaryTree.problems;

public class subTreeofAnotherTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isSubtreeSame(Node root, Node subroot) {

        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        return isSubtreeSame(root.left, subroot.left) && isSubtreeSame(root.right, subroot.right);

    }

    public static boolean isMatching(Node root, Node subroot) {
        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            return isSubtreeSame(root, subroot);
        }

        return isMatching(root.left, subroot) || isMatching(root.right, subroot);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isMatching(root, subroot));

    }
}
