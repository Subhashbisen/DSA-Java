package BinaryTree.problems;

public class diameterOfTree {
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

    public static int diameter = 0;

    public static int diameterOfTree(Node root) {
        height(root);
        return diameter;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        // Left subtree height
        int leftHeight = height(root.left);

        // Right subtree height
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(9);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        System.out.println(diameterOfTree(root));
    }
}
