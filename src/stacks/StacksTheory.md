Stacks:
LIFO (Last In first out)

Dynamic array under the hood

Default capacity of a Stack is 10

**Operations:**

Push() 

Pop()

Peek()

Search()

**Syntax:**

Stack<Integer> stack = new Stack<Integer>()
	
stack.push(6)
	
stack.push(5)
	
int element = stack.pop();
	
int element = stack.peek();
	
stack.search(6) -- returns 1 (position of element 6 is 1 in the stack (LIFO)))

**Loop through the stack :**

	for(Integer val:stack)
            {
                //max = Math.max(max, val);
		//min = Math.min(min, val);
            }
  
**Time complexity:**

Insert, Delete - O(1) constant time - because push and pop inserts/removes element to/from the top of the stack	

**Important:**
  If there are no elements in the stack, stack.peek(), stack.pop() will result in an exception (java.util.EmptyStackException), 
  (therefore check stack.empty() before you call method pop or peek), however stack.search() will result in -1 if there are no elements in the stack
