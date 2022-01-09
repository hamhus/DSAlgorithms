package stacks;

import java.util.Stack;

public class StackImplementation {

    public static void stack_pop(Stack<Integer> stack)
    {
        if(!stack.empty())
            System.out.println("Pop : "+stack.pop());
        else
            System.out.println("Stack is empty");
    }
    public static void stack_push(Stack<Integer> stack, int element)
    {
        System.out.println(stack.push(element));
    }
    public static void stack_peek(Stack<Integer> stack)
    {
        if(!stack.empty()) {
            int ele = stack.peek();
            System.out.println("Peek : " + ele);
        }
        else
            System.out.println("Stack is empty");
    }
    public static void stack_search(Stack<Integer> stack, int element)
    {
        Integer ele = (Integer) stack.search(element);
        System.out.println("Search : "+ele);
    }
    public static int getMax(Stack<Integer> stack) {
        // Write your code here.
        int max = Integer.MIN_VALUE;

        if(stack != null)
        {
//            for(int i=0;i<stack.size();i++)
//            {
//                int top = stack.pop();
//                max = Math.max(max, top);
//            }
            for(Integer val:stack)
            {
                max = Math.max(max, val);
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack, 2);
        stack_push(stack, 1);
        stack_push(stack, 7);
        stack_push(stack, 5);
        stack_push(stack, 6);
        stack_peek(stack);
        getMax(stack);
        //stack_pop(stack);
        //stack_search(stack, 2);

    }
}
