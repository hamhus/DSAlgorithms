**Queues:**

FIFO (First In First Out)

The default capacity when a queue (priority queue) is initialized is 11.

**Methods:**

add() - Insert the elements in the queue, returns true upon success and throws IllegalStateException if no space is currently available

element() - Retrieves the head of the queue

offer(Object e) - Inserts the specified element into the queue, returns true

peek() - retrieves the head of the queue (but does not remove it)

poll() - retrieves and remove the head of the queue, otherwise returns null if queue is empty

remove() - removes the head of the queue

**Syntax:**

Queue<Integer> 
