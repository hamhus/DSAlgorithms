package linkedlist;

import java.util.HashMap;

public class DoublyLLConstruction {

    static class Node
    {
        int value;
        Node next;
        Node prev;

        Node(int val)
        {
            this.value = val;
        }

        private static void setHead(Node node, Node head)
        {
            //If you don't want to change the head
//            Node current = head;
//            node.next = current;
//            current.prev = node;
//            current = node;
//            head = current;
            //OR -> if you change the head
//            head.prev = node;
//            node.next = head;
//            head = node;
            //OR
            node.next = head;
            head.prev = node;
            head = node;
        }
        public static void main(String[] args)
        {
            Node node1 = new Node(2);
            Node node2 = new Node(3);
            Node node3 = new Node(5);
            node1.next = node2;
            node2.prev = node1;
            node2.next = node3;
            node3.prev = node2;

            setHead(new Node(4), node1);

            HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
            hmap.put('A', hmap.get('A')+1);

        }
    }


}
