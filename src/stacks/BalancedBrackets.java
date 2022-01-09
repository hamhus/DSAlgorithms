package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        // Not an optimized code, trial and error
        //I arrived at this code in 2 HOURS, by looking at the hints.
        //Assumed, that the brackets given are (,[,{, hence the hard-code of the brackets, see line 15
        //This is not optimized, because of the many if conditions for corner cases from line 25-33
        //I will see the solution implemented and code the proper solution in Solution-2
        char[] charArray = str.toCharArray();
        //Declare a stack
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<charArray.length; i++)
        {
            if(stack.empty() && (charArray[i] == ')' ||	charArray[i] == ']' || charArray[i] == '}'))
                stack.push(charArray[i]);
            else if(charArray[i] == '(' ||	charArray[i] == '[' || charArray[i] == '{')
            {
                //Push to the stack
                stack.push(charArray[i]);
            }
            else if(charArray[i] == ')' ||	charArray[i] == ']' || charArray[i] == '}')
            {
                //Pop from the stack
                if(!stack.empty())
                {
                    if(stack.peek() == '(' && charArray[i] == ']' ||
                            stack.peek() == '[' && charArray[i] == ')' ||
                            stack.peek() == '{' && charArray[i] == ')' ||
                            stack.peek() == '(' && charArray[i] == '}' ||
                            stack.peek() == '[' && charArray[i] == '}' ||
                            stack.peek() == '{' && charArray[i] == ']'	||
                            stack.peek() == ')' && charArray[i] == '}' ||
                            stack.peek() == ']' && charArray[i] == '}' ||
                            stack.peek() == '}' && charArray[i] == ')'
                    )
                        return false;

                    else stack.pop();
                }
            }
        }
        if(stack.empty()) return true;

        return false;
    }
    public static boolean balancedBracketsOptimized(String str) {
        /* Logic:
        1. Add the opening brackets to the stack,
        2. Match the closing brackets with the opening brackets.
        3. If there's a match, pop from the stack

        Edge cases:
        ()} - Incorrect
        (({])) - Incorrect (because of {])
        }(([])) - Incorrect (starts with a closing bracket
         */
        //Matching and closing brackets declaration:
        String matchingBrackets = "([{";
        String closingBrackets = ")]}";
        //Match closing brackets with opening brackets - Take map/hashmap
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');

        //char[] charArray = str.toCharArray();
        //Declare a stack to store and pop values
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            //Opening brackets
            //Verify if the character is a one from the matching brackets string
            if(matchingBrackets.indexOf(ch) != -1)
            {
                stack.add(ch);
            }
            else if(closingBrackets.indexOf(ch) != -1)
            {
                /*Check if the stack is empty.
                If it's empty, it's an additional character that does not have an opening bracket
                example: ()}
                */
                if(stack.empty()) return false;
                //Check if the closing bracket (from hash map) is matching the opening bracket (from the top of stack)
                if(hashMap.get(ch) == stack.peek())
                {
                    stack.pop();
                }
                else
                    return false;
            }
        }
        if(stack.empty()) return true;
        return false;
    }

    public static void main(String[] args)
    {
        String str = "(([]{]))";
        //balancedBrackets(str);
        System.out.println(balancedBracketsOptimized(str));
        //stack_pop(stack);
        //stack_search(stack, 2);

    }
}
