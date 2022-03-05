package trees;

import com.sun.source.tree.Tree;
import searching.BinarySearch;

public class BinarySearchTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value)
        {
            this.val = value;
        }
        TreeNode(int value, TreeNode left, TreeNode right)
        {
            this.val = value;
            this.left = left;
            this.right = right;
        }
    }
    private static boolean BinarySearch(TreeNode node, int value)
    {
        if(node == null) return false;
        if(node != null && value == node.val)
            return true;

        //if(node != null)
        if(value < node.val)
            return BinarySearch(node.left, value);
        //if(node != null)
        else
            return BinarySearch(node.right, value);
        //return false;
        //Time Complexity - O(log n)
        //Space complexity - O(log n)
    }
    public static void main(String[] args)
    {
        TreeNode node1 = new TreeNode(5, new TreeNode(3),new TreeNode(7));
        TreeNode node2 = new TreeNode(3, new TreeNode(1),new TreeNode(4));
        TreeNode node3 = new TreeNode(7, new TreeNode(6),new TreeNode(8));
        node1.left = node2;
        node1.right = node3;

        System.out.println(BinarySearch(node1,5 ));
    }
}
