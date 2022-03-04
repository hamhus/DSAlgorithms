package trees;

public class InOrderTraversal {
    static class Node
    {
        int value;
        Node left;
        Node right;
        public Node(int val)
        {
            this.value = val;
        }
    }
    public static void InOrderTraversal(Node node)
    {
        //LCR
        if(node == null)
            return;
        InOrderTraversal(node.left);
        //System.out.println(node.value);

        System.out.println(node.value);

        InOrderTraversal(node.right);
        //System.out.println(node.value);
    }
    public static void PreOrderTraversal(Node node)
    {
        //CLR
        if(node == null)
            return;
        System.out.println(node.value);
        PreOrderTraversal(node.left);

        PreOrderTraversal(node.right);
        //System.out.println(node.value);
    }
    public static void PostOrderTraversal(Node node)
    {
        //LRC
        if(node == null)
            return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.println(node.value);
    }
    public static void main(String[] args)
    {
        Node node = new Node(2);
        Node node1 = new Node(4);
        Node node2 = new Node(8);
        Node node3 = new Node(3);
        Node node4 = new Node(1);
        Node node5 = new Node(6);
        Node node6= new Node(9);
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println("In-Order Traversal");
        InOrderTraversal(node);
        System.out.println("Pre-Order Traversal");
        PreOrderTraversal(node);
        System.out.println("Post-Order Traversal");
        PostOrderTraversal(node);
    }
}
