package BinaryTree;

public class heightOftree {
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

    public static int height(Node root) {
        // Base Case
        if (root == null)
            return 0;

        // Left subtree height
        int leftHeight = height(root.left);

        // Right subtree height
        int rightHeight = height(root.right);

        // Return max + 1 for current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int Nodecount(Node root) {
        // Base Case
        if (root == null) {
            return 0;
        }

        // Count current node + left + right
        return 1 + Nodecount(root.left) + Nodecount(root.right);
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        // Left subtree sum
        int leftSum = sum(root.left);

        // Right subtree sum
        int rightSum = sum(root.right);

        // Total sum
        return root.data + leftSum + rightSum;
    }

    public static int maxElement(Node root) {
        if (root == null) {
            return 0;
        }

        int maxLeft = maxElement(root.left);

        int maxRight = maxElement(root.right);

        return Math.max(root.data,
                Math.max(maxLeft, maxRight));

    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // System.out.println(height(root));
        System.out.println(maxElement(root));

    }
}
