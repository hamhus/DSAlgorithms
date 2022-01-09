package linkedlist;

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
    private static void PrintNodes(LinkedList list)
    {
        while(list != null)
        {
            System.out.println(list.value);
            list = list.next;
        }
    }
    public static void InsertAtEnd(LinkedList head, LinkedList addNode)
    {
        LinkedList current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = addNode;
        System.out.println("Added at the end");
        printLLNodes(head);
    }

    private static void printLLNodes(LinkedList head) {
        while(head != null)
        {
            System.out.println(head.value);
            head = head.next;
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
        printLLNodes(head);
    }
    static void RemoveNode(LinkedList list)
    {

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

        //PrintLLNodes(ll1);
        InsertInMiddle(ll1, 7, new LinkedList(4));
        //InsertAtEnd(ll1, new LinkedList(4));

    }
}

