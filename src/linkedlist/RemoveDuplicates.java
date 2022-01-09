package linkedlist;
import java.util.*;
public class RemoveDuplicates {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        /*Logic:
        In the problem, it is given that the linked list is sorted,
        because the list is sorted, all the duplicates are next to
        each other.
        Compare the next value and see if it's a duplicate.
        If it's a duplicate, look for other duplicate in the sequence,
        and point the current to the next distinct node.
         */

        //Instance of the head object
        LinkedList current = linkedList;
        if(linkedList == null) return null;
        else if(linkedList.next == null) return linkedList;
        //LinkedList prev = linkedList;
        //LinkedList curr = linkedList;
        while(current != null)
        {
            LinkedList nextCurrentNode = current.next;
            while(nextCurrentNode != null && current.value==nextCurrentNode.value)
            {
                nextCurrentNode = nextCurrentNode.next;
            }
            current.next = nextCurrentNode;
            current = current.next;
        }
        //printLLNodes(linkedList);
        return linkedList;
    }
    private static void printLLNodes(LinkedList head) {
        while(head != null)
        {
            System.out.println(head.value);
            head = head.next;
        }
    }
    public static void main(String[] args)
    {
       LinkedList ll1 = new LinkedList(1);
        LinkedList ll2 = new LinkedList(1);
        LinkedList ll3 = new LinkedList(2);
        LinkedList ll4 = new LinkedList(3);
        LinkedList ll5 = new LinkedList(3);
        LinkedList ll6 = new LinkedList(3);
        LinkedList ll7 = new LinkedList(4);
        LinkedList ll8 = new LinkedList(5);
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;
        ll5.next = ll6;
        ll6.next = ll7;
        ll7.next = ll8;

        removeDuplicatesFromLinkedList(ll1);



    }

}
