Stacks:
LIFO (Last In first out)

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
	
stack.search(6) returns 1 (position of element 6 is 1 in the stack (LIFO)))
  
  ******
**Important:**
  If there are no elements in the stack, stack.peek(), stack.pop() will result in an exception (java.util.EmptyStackException), 
  (therefore check stack.empty() before you call method pop or peek), however stack.search() will result in -1 if there are no elements in the stack
