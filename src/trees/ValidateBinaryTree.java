package trees;

public class ValidateBinaryTree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int value)
        {
            this.val = value;
        }
        Node(int value, Node left, Node right)
        {
            this.val = value;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isValidBST(Node root, int value) {
        if(root == null) return false;
        if(root.left != null && (root.left.val > value || root.right.val > value)) return false;
        if(root.right != null && (root.left.val < value || root.right.val < value)) return false;

        if(root.left != null && value < root.left.val) {
            return isValidBST(root.left, value);
        }
        else if(root.right != null && value > root.right.val)
            return isValidBST(root.right, value);
        return true;
    }
    public static void main(String[] args)
    {
        Node node1 = new Node(5, new Node(3),new Node(7));
        Node node2 = new Node(3, new Node(1),new Node(4));
        Node node3 = new Node(7, new Node(6),new Node(8));
        node1.left = node2;
        node1.right = node3;

        System.out.println(isValidBST(node1, node1.val));
    }
}
