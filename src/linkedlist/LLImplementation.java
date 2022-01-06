package linkedlist;

import java.lang.constant.Constable;

public class LLImplementation {
    static class LinkedList
    {
        int value;
        LinkedList next;

        LinkedList(int val)
        {
            this.value = val;
            this.next = null;
        }
    }

    static void InsertInMiddle(LinkedList head, int addAfter, LinkedList addNode)
    {
        LinkedList current = head;
        while(current != null)
        {
            if(current.value == addAfter)
            {
                addNode.next = current.next;
                current.next = addNode;
                //nodeAfterInsert =
            }
            current = current.next;
        }
    }
    static void RemoveNode(LinkedList list)
    {

    }
    static void PrintNodes(LinkedList list)
    {
        while(list != null)
        {
            System.out.println(list.value);
            list = list.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList ll1 = new LinkedList(5);
        LinkedList ll2 = new LinkedList(6);
        LinkedList ll3 = new LinkedList(7);
        LinkedList ll4 = new LinkedList(8);
        LinkedList ll5 = new LinkedList(9);

        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;

    }
}

