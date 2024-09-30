# Data Structures : 
It is an way to store and organize data efficiently.
<br>
Here efficiently means (minimum time and space)

# Classification of Data Structure

1.Linear Data Structure: Data structure in which data elements are arranged sequentially or linearly, where each element is attached to its previous and next adjacent elements, is called a linear data structure. 
Example: Array, Stack, Queue, Linked List, etc.
<br>
<br>
2.Static Data Structure: Static data structure has a fixed memory size. It is easier to access the elements in a static data structure. 
Example: array.
3.Dynamic Data Structure: In dynamic data structure, the size is not fixed. It can be randomly updated during the runtime which may be considered efficient concerning the memory (space) complexity of the code. 
Example: Queue, Stack, etc.
<br>
<br>
4.Non-Linear Data Structure: Data structures where data elements are not placed sequentially or linearly are called non-linear data structures. In a non-linear data structure, we can’t traverse all the elements in a single run only. 
Examples: Trees and Graphs.



# Algorithm :
It is the steps to solve a particular problem.

# Time Complexity :
It is measures of how running time of an algorithm increases with the size of input data.
<br>

Important Point :
Time Complexity of a good/best Algorithm should be in O(log n) to O(1) where O is Big O notation.
Here O(1) is a constant time complexity and its example is like  element found at 0 index .
<br>
Time Complexity always depends on the no of steps in an algorithm.

# Array:
1.fixed size.
<br>
2.stroes primitive and non primitive data type.
<br>
3.Negative indexing is not allowed.
<br>
4.array objects are stored in heap.As heap objects are not continuous so array may not be continuous .It depends on the JVM.
<br>
5. In array of objects like array containing String value , each the elements in the array is itself a object and it is saved in different locations in heap memory and these elements providing the reference to the array.
<br>
6. In multidimensional array , specify the column is not necessary but rows is mendatory.
ex: int[][] arr = new int[2][];
<br>
7.length of an array can be calculated by (arr.length).
<br>
8. Arrays are mutable . It means we can modify the element of an array using index . ex : arr[0]=34;
<br>
9. Elements of an array can be accessed using index value.
<br>
10. We can traversing an array using for loop or while loop.
<br>
11.Insertion,deletion and search an element (if index is not known) in an array is very costly(in term of time).
<br>
12. Array is not thread safe.(A thread is a lightweight process that allows for concurrent execution of code.In java Threads operates asynchronously.)

# When to use Array:
1.When we need fast access to elements using an index.
<br>
2.When the number of elements is known ahead of time and will not change.
<br>
3.When you need a simple and straightforward data structure with minimal overhead(in terms of memory and time).
<br>


# Types of array on the basis of memory allocation:
1.Static array :These are such arrays whose size is fixed but they allocates memory at run time.
for example : array.
<br>
2.Dynamic array : These are such array which allocates memory at runtime  but it automatically grows up when we try to make insertion .
for example : ArrayList .





# ArrayList :
An ArrayList in Java is a class of the java.util package and is a part of  Java Collections Framework. It provides a resizable array, which can grow and shrink in size dynamically as elements are added or removed.It stores only non primitive data type(or we can say it stores objects).

<br><br>
Internal Working :
<br>
Actually Its size is fixed internally.But when we add about 50% of data then a new arraylist will be created of length of approx. double the length of the previous array and copy the element of old one into new one.
and the previous array will be deleted.

<br><br>

Properties: 
<br>
1.ArrayList is not thread-safe.
<br>
2.Indexing order is preserved like array.
<br>
3.Duplicates are allowed like array.
<br>
4.Its elements can be accessed by index value using method.
<br>
5.The default capacity of an ArrayList is 10, but it automatically increases as more elements are added.

# Some Common methods in ArrayList :

1. add(element) : It adds a new element at the end.
<br>
2. add(index,element): It adds the element at the specified position.
<br>
3. get(int index): Returns the element at the specified position in the list.
<br>
4.set(int index, E element): Replaces the element at the specified position in the list with the specified element.
<br>
5.remove(int index): Removes the element at the specified position in the list.

6.remove(Object o): Removes the first occurrence of the specified element from the list, if it is present.
<br>
7.size(): Returns the number of elements in the list.
<br>
8.clear(): Removes all elements from the list.
<br>
9.isEmpty(): Returns true if the list contains no elements.
<br>
10.contains(Object o): Returns true if the list contains the specified element.




# 3 Steps for Recursion :
1. find the base case.
<br>
2. find the relation between problems(outer method) and subproblems(inner method which wiil be called in the the same outer merhod).
<br>
3. Generalise the relation.



# Linked List :
Linked list is  a linear collection of data elements called node where each node contains data and pointer and the linear order is given by pointer.
<br>
Note : Pointer always points to the first node of Linked List.

<br>
It is of different types :
<br>
1. Singly Linked List 
<br>
2. Doubly Linked List 
<br>
3. Circular Linked List : we can implements using Singly Linked List and doubly Linked List.
<br>

# Why Use a Linked List?
Dynamic Size: Unlike arrays, which have a fixed size, linked lists can grow or shrink dynamically as needed.
Efficient Insertions/Deletions: Inserting or deleting nodes (especially at the beginning or middle) is faster because it involves changing references rather than shifting elements like in arrays.
<br>
Non-Contiguous Memory: Linked lists do not require contiguous memory like arrays, which can be an advantage in memory management.


# When to Use a Linked List
When you need efficient insertion or deletion operations (especially at the start or middle).
<br>
When memory allocation is an issue and contiguous memory for an array is hard to allocate.
<br>
When frequent resizing is required.

<br>
However, linked lists have some downsides:
<br>
They require more memory per node because of the extra reference pointer.
<br>
They have slower access times compared to arrays because elements are not stored in contiguous memory, so you must traverse the list to find an element.

# Stack 
A Stack is a linear data structure that follows the LIFO (Last In, First Out) principle. This means that the last element added to the stack is the first one to be removed. It can be visualized as a stack of plates where the plate placed last is the first one you take out.
<br>

# Key Operations in Stack:
<br>
push(item): Adds an item to the top of the stack.
<br>
pop(): Removes and returns the item from the top of the stack.
<br>
peek(): Returns the item at the top of the stack without removing it.
<br>
isEmpty(): Checks if the stack is empty.
<br>
size(): Returns the number of elements in the stack.
<br>

# Why Use a Stack?
Reversing Data: Stacks are useful for reversing items due to their LIFO nature.
<br>
Function Call Management: The call stack in a program keeps track of function calls, pushing and popping functions as they are called and completed.
<br>
Backtracking Algorithms: Stacks are used in algorithms like Depth-First Search (DFS) for graph traversal or maze solving, as they help in backtracking.
<br>
Expression Evaluation: In compilers and interpreters, stacks are used to evaluate expressions and parse syntax.
Undo Mechanism: Many applications, such as text editors, use stacks to implement undo/redo functionality.
<br>
Undo Mechanism: Many applications, such as text editors, use stacks to implement undo/redo functionality.

# Queues :
A Queue is a linear data structure that follows the FIFO (First In, First Out) principle. This means that the first element added to the queue will be the first one to be removed, similar to a real-world queue (like waiting in line for a movie ticket).

# Key Operations in Queue:
enqueue(item): or add() : Adds an item to the rear (end) of the queue.
<br>
dequeue(): or  remove() :  Removes and returns the item from the front of the queue.
<br>
peek(): Returns the front item without removing it.
<br>
isEmpty(): Checks if the queue is empty.
<br>
size(): Returns the number of elements in the queue.

# Types of Queues:
Simple Queue: Basic FIFO structure.
<br>
Circular Queue: The last position connects back to the first position, forming a circle.
<br>
Priority Queue: Elements are dequeued based on priority, not order of arrival.
<br>
Deque (Double-ended Queue): Insertion and deletion are allowed at both ends.
<br>

# Why Use a Queue?
Task Scheduling: Queues are used in scheduling tasks or jobs where the first task must be completed before the next one (e.g., in a printer queue).
<br>
Breadth-First Search (BFS): In graph and tree traversal algorithms like BFS, queues are used to explore nodes level by level.
<br>
Buffer Management: Queues are used in buffering applications like handling requests in web servers.
<br>
Real-Time Systems: Queues help in managing tasks that must be processed in the order they arrive, such as in CPU task scheduling or network packet management.


# when we use Dequeue ?