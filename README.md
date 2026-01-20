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
4.Non-Linear Data Structure: Data structures where data elements are not placed sequentially or linearly are called non-linear data structures. In a non-linear data structure, we can't traverse all the elements in a single run only. 
Examples: Trees and Graphs.



# Algorithm :
It is the steps to solve a particular problem.

# Time Complexity :
It is measures of how running time of an algorithm increases with the size of input data.

<br>
It is a mathematical function that gives the relationship about how running time of an algorithm increases with the size of input data.

<br>
Important Point :
Time Complexity of a good/best Algorithm should be in between O(log n) to O(1) where O is Big O notation.
Here O(1) is a constant time complexity and its example is like element found at 0 index in linear search algorithm.
<br>
Time Complexity always depends on the no of steps in an algorithm.
<br>
While designing an algorithm always look at the worst case of Time Complexity.
<br>
While designing an algorithm always look at the Complexity for large data.
<br>
In Time Complexity constants are always ignore.
ex=> O(2n + 5) then here we ignore 2 and 5.
<br>
In Time Complexity less dominating terms are always ignore.
ex=> O(N^3 + N^2 + N) then we ignore N^2 and N.
<br>


# Big O 
It is the Upper bound of time complexity means that time complexity of an algorithm will never exceeds the value present inside
Big O(). 
<br>

# Big Omega 
It is the lower bound of time complexity means that time complexity of an algorithm will have atleast the value present inside Omega().


# Theta notation
It is average bound or we can say combination of both upper and lower bound of time complexity.

# Little O notation :
It is loose upper bound . 

# Little Omega notation :
It is loose lower bound . 

# Space/Auxiliary Complexity :
Auxiliary Space is the extra space or temporary space used by an algorithm.

<br>
Space Complexity of an algorithm is total space taken by the algorithm with respect to the input size. Space Complexity includes both Auxiliary space and space used by input. 

<br> 
While designig an algorithm, we always looks at the extra space (Auxiliary Space) 
in Space Complexity.

# Divide and Conquer :
Break the problems into sub-problems and find the solution for each subproblems and then combine these solution to obtain a final solution. 
<br>
Imp Point : 
<br>
In Divide and conquer rule, the subproblems are of same type . like if we have a problem of sorting an large array then after dividing the problem into subproblems then every subproblems must perform the sorting function.
<br>
So, this how it is recursive in nature. 
<br>
And another important point is that we should have method of combining the solutions of subproblems into final solution. 
<br> 


# Recursion :
Method calling itself until a base condintion is reached, is called Recursion.
<br>
Imp Point : Until the function is not fininshed its execution it will remains in stack.
<br>
when a function finishes executing it is removed from stack and the flow of program is restored to where the function was called.
<br>
Every function call will take some memory in the stack whether it is same or different.
<br>


# Steps for Solving a problem using Recursion :

1. Break the problems into sub-problems and find the relation between problems(outer method) and subproblems(inner method which will be called in the the same outer method).
<br>
2. Generalise the relation or we can say find the recursive case/recursion relation.
<br>
3. find the base case.
<br>
4. Draw the recursion tree.
<br>
5. About the tree: 
<br>
(I) See the flow of function, how they are getting into stack.
<br>
(II) Identify and focus on left tree calls and right tree calls.
<br>
Remember : Always left function will called first.
<br>
6. See how values and what type of values are returned at each steps. See where the function call will come out. In the end we will come out of main function.




# Working with variables in Recursion :
There are three types of variables in Recursion program.
<br>
1. Arguments : 
Make sure that those variable which will be used in the next/future function call, they wiil be passed as arguments.

2. Return type :
Make sure that all the subfunctions that calling the same function must return and of the same type of data as defined in the functions.

3. In the body of function  :
Those variables which will not be used in the next/future function call and specific to a function call then they will be used in the body of the function and will not passed as arguments.


# Space and Time complexity of Recursive Algorithm :
Important Point : 
<br>
Only the function calls that are interlinked will be in the stack at the same time.
<br>
Space Complexity of recursive Algorithm wil be equal to the height of the tree or we can say the longest chain of the recursion tree.
<br> 
for ex : Space Complexity of an fibonacci no is O(n).


# Limitaiton of Recursion :
Recursion, while powerful, has several limitations that can make it less suitable for certain problems. Here are the key limitations of recursion:
<br>
1. Risk of Stack Overflow
Each recursive function call uses a stack frame for storage of variables, return address, etc.
Deep recursion can lead to stack overflow errors, especially if the recursion depth exceeds the call stack size.
2. High Memory Usage
Recursive functions can consume more memory than iterative solutions because of the overhead associated with maintaining multiple stack frames.
3. Slower Execution
Recursion often involves repeated function calls, which can be slower than equivalent iterative solutions due to the overhead of function invocation.
4. Harder to Debug
Debugging recursive functions can be challenging because of multiple function calls, which makes it difficult to trace the flow and state of variables at different levels of recursion.
5. Risk of Infinite Recursion
If the base case is not correctly defined or never reached, recursion can lead to infinite function calls, causing the program to crash.

# Array:
1.fixed size.
<br>
2.stroes primitive and non primitive data type.
<br>
3.Negative indexing is not allowed.
<br>
4.array objects are stored in heap. As heap objects are not continuous so array may not be continuous. It depends on the JVM.
<br>
5. In array of objects like array containing String value, each elements in the array is itself a object and it is saved in different locations in heap memory and these elements providing the reference to the array.
<br>
6. In multidimensional array , specify the column is not necessary but rows is mendatory.
ex: int[][] arr = new int[2][];
<br>
7.length of an array can be calculated by (arr.length).
<br>
8. Arrays are mutable. It means we can modify the element of an array using index. ex : arr[0]=34;
<br>
9. Elements of an array can be accessed using index value.
<br>
10. We can traversing an array using for loop or while loop.
<br>
11.Insertion,deletion and search an element (if index is not known) in an array is very costly(in term of time).
<br>
12. Array is not thread safe.(A thread is a lightweight process that allows for concurrent execution of code.In java Threads operates asynchronously.)
<br>
Inside global scope, the maximum size of array is 10^7. 
and inside local scope, the maximum size is 10^6. 


# When to use Array:
1.When we need fast access to elements using an index.
<br>
2.When the number of elements is known ahead of time and will not change.
<br>
3.When you need a simple and straightforward data structure with minimal overhead(in terms of memory and time).
<br>

# Stable and Unstable Sorting Algorithm :
Stable Sorting Algorithm : These are the algorithm in which original order is preserved for the values that are equal . 
<br>
Unstable Sorting Algorithm : These are the algorithm in which original order is not  preserved for the values that are equal . 
<br>
Inplace Algorithm : In these algorithms original array is changed instead of creating new array. 

# Hybrid Sorting Algorithm :
Tim Sort : It is a combination of MergeSort and Insertion Sort which is used in python sort inbuilt method. 
<br>
Insertion Sort is used because it works well with partially sorted data. 

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
<br>
6.remove(Object o): Removes the first occurrence of the specified element from the list, if it is present.
<br>
7.size(): Returns the number of elements in the list.
<br>
8.clear(): Removes all elements from the list.
<br>
9.isEmpty(): Returns true if the list contains no elements.
<br>
10.contains(Object o): Returns true if the list contains the specified element.

# List : 
List<Integer> list = new ArrayList<>();

// methods are same in ArrayList.


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

# Inbuilt LinkedList : 
```bash 

import java.util.LinkedList;


// Create a LinkedList:

LinkedList<String> list = new LinkedList<>();

📚 Commonly Used Methods in LinkedList:

🔹 Adding Elements

list.add("A");               // Add to end
list.addFirst("Start");      // Add at beginning
list.addLast("End");         // Add at end
list.add(1, "Middle");       // Add at specific index

🔹 Removing Elements

list.remove();               // Removes first element
list.remove("A");            // Removes specific element
list.removeFirst();          // Removes first
list.removeLast();           // Removes last
list.clear();                // Removes all elements
🔹 Accessing Elements

String first = list.getFirst();    // First element
String last = list.getLast();      // Last element
String atIndex = list.get(1);      // Element at index 1
🔹 Checking Contents

list.contains("A");          // true if "A" is in the list
list.isEmpty();              // true if list is empty
list.size();                 // number of elements
🔹 Iterating

for (String item : list) {
    System.out.println(item);
}


```
# Stack 
A Stack is a linear data structure that follows the LIFO (Last In, First Out) principle. This means that the last element added to the stack is the first one to be removed. It can be visualized as a stack of plates where the plate placed last is the first one you take out.
<br>
In java Stack is an inbuilt class.
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
<br>
Undo Mechanism: Many applications, such as text editors, use stacks to implement undo/redo functionality. 

<br>
We can implements it into two ways :
1. Using Linked List
2. Using array

# Inbuilt Stack : 
```bash 
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);     // [A, B, C]
        System.out.println("Top: " + stack.peek()); // C

        stack.pop(); // removes C
        System.out.println("After pop: " + stack); // [A, B]

        System.out.println("Is empty? " + stack.isEmpty()); // false
        System.out.println("Size: " + stack.size());        // 2
        System.out.println("Search A: " + stack.search("A")); // 2
    }
}

```

# Disadvantages of Stack :
1. Limited Access
Only the top element is accessible at any given time, making it unsuitable for problems that require random or indexed access to elements.
2. Stack Overflow
In static or limited-size stacks (e.g., using arrays), exceeding the stack's predefined size results in a stack overflow error.
This can also occur in programming when deep recursion consumes too much stack memory.
3. Underflow
Attempting to pop an element from an empty stack results in a stack underflow error, making it critical to handle edge cases explicitly.
4. Inefficient for Large Data
Stacks are not optimized for managing large data sets. Deep recursion or excessive stack usage can cause significant memory usage, leading to inefficiency or program crashes.
5. No Random Access
Unlike arrays or other data structures like lists, stacks do not allow access to elements in the middle or bottom without popping all preceding elements.
6. Restricted Operations
The stack's LIFO nature imposes strict limitations on operations, making it unsuitable for tasks requiring flexibility, such as insertion or deletion in arbitrary positions.


# Queues :
A Queue is a linear data structure that follows the FIFO (First In, First Out) principle. This means that the first element added to the queue will be the first one to be removed, similar to a real-world queue (like waiting in line for a movie ticket).
<br>
In java Queue is an inbuilt interface.
<br>
We can implements it into two ways :
1. Using Linked List(prefer)
2. Using array

# Key Operations in Queue using LinkedList:
enqueue(in case of array) or add(item) (in linked list) : Adds an item to the rear (end) of the queue.
<br>
dequeue(in case of array) or remove() (in linked list):  Removes and returns the item from the front of the queue.
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

# Inbuilt Queues :
```bash 
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);      // [A, B, C]
        System.out.println("Head: " + queue.peek()); // A

        queue.poll(); // Removes "A"
        System.out.println("After poll: " + queue); // [B, C]

        System.out.println(queue.size());  

        System.out.println(queue.isEmpty());
    }
}

```

# When we use stack and Queues ?
1. when we want to store the answer so far.
2. when we have a group of elements inside a particular data structure for a period of time.
3. Used In Trees.
4. Used in BFS.
5. When we convert recursion program to iteration then we also use stack and queues.


# Deque :
A Deque (short for Double-Ended Queue) is a linear data structure that allows the addition and removal of elements from both ends (front and rear). It can function as both a queue (FIFO) and a stack (LIFO), depending on how you use it.
<br>
In java Deque is an inbuilt interface.  

# Key Operations in Deque:
addFirst(item): Adds an item to the front of the deque.
addLast(item): Adds an item to the rear of the deque.
removeFirst(): Removes and returns the item from the front of the deque.
removeLast(): Removes and returns the item from the rear of the deque.
peekFirst(): Returns the front item without removing it.
peekLast(): Returns the rear item without removing it.
isEmpty(): Checks if the deque is empty.
size(): Returns the number of elements in the deque.


# Why Use a Deque?
Flexibility: A deque provides more flexible data management than a simple queue or stack since you can add or remove elements from both ends.
Optimal for Both Queue and Stack Operations: It can serve as both a queue (FIFO) and a stack (LIFO), allowing operations from both ends.
Sliding Window Algorithms: Deques are used in sliding window algorithms where elements at both ends need to be added or removed, such as finding the maximum or minimum element within a sliding window.
Palindrome Checking: Deques are useful when checking if a word is a palindrome because you can compare characters from both ends.

<br>
It is also used in tree.

# Inbuilt Deque
```bash
import java.util.Deque;
import java.util.ArrayDeque;

Deque<String> deque= new ArrayDeque<>();

deque.addFirst(e)	// Add to the front (throws exception if full)
deque.addLast(e)	// Add to the back (same as add(e))
deque.offerFirst(e)	// Add to front (returns false if full)
deque.offerLast(e)	// Add to back (returns false if full)


removeFirst()	Remove from front (throws exception if empty)
removeLast()	Remove from back
pollFirst()	Remove from front (returns null if empty)
pollLast()	Remove from back



getFirst()	Get front element (throws exception if empty)
getLast()	Get last element
peekFirst()	Get front element (null if empty)
peekLast()	Get last element (null if empty)


deque.size();      // Number of elements
deque.isEmpty();   // Check if it's empty
deque.clear();     // Removes all elements
deque.contains("X"); // Checks if "X" is in deque

```

# Disadvantages of Queues :
1. Limited Access
Queues follow the FIFO (First In, First Out) principle, so only the front and rear elements are accessible at any time. Random access to other elements is not possible.
2. Inefficient in Static Implementations
In a static array-based queue, when elements are dequeued, the unused space at the front cannot be reused unless specifically managed (e.g., via circular queues).
This can lead to memory wastage or require manual shifting of elements, which is inefficient.
3. Potential Overflow and Underflow
Overflow occurs if the queue exceeds its predefined capacity in static implementations.
Underflow occurs when dequeueing from an empty queue. These conditions require additional handling in algorithms.
4. Inefficiency in Searching
Searching for an element in a queue requires traversing it from front to rear, which is time-consuming compared to data structures like arrays or hash tables.
5. Memory Overhead in Linked Implementations
In a linked list-based queue, additional memory is required to store pointers, increasing overhead compared to array-based queues.


# String :
Various String methods : 
<br>
```bash
//Compares two strings for equality.

s.equals("hello");           // true

s.equalsIgnoreCase("HELLO"); // true



// Lexicographically compares two strings.
"a".compareTo("b");  // -1
"c".compareTo("b");  // 1
"b".compareTo("b");  // 0


//Converts a string to a character array
char[] chars = s.toCharArray();


Splits a string into an array based on a regex (e.g., by spaces or commas).
String[] words = s.split(" ");



//Replaces characters or substrings.
s.replace('l', 'x');           // "hexxo"
s.replaceAll("l", "yy");       // "heyyyyo"



//Checks if a string is empty or contains only whitespace.
"".isEmpty();       // true
"  ".isBlank();     // true



//Checks if a string contains a specific sequence.
s.contains("ell");  // true




// Regex methods in string 
String email = "test@example.com";
System.out.println(email.matches(".*@.*\\.com")); // true

.* → zero or more characters

\\. → escape sequence characters to represent dot


.	Any character
\\s	Whitespace
\\S	Non-whitespace
\\d	Digit
\\D	Non-digit
\\w	Word character (a-z, A-Z, 0-9, _)
\\W	Non-word character
^	Start of string
$	End of string


```
# Various StringBuilder methods

```bash 
 Method                                     Description                                         
 `append(String s)`                         Adds text to the end                                 `sb.append("abc");`         


 `insert(int offset, String s)`             Inserts text at specified index                      `sb.insert(1, "xy");`       


 `delete(int start, int end)`               Deletes characters from `start` to `end - 1`         `sb.delete(1, 3);`          


 `deleteCharAt(int index)`                  Deletes the char at specified index                  `sb.deleteCharAt(2);`       


 `reverse()`                                Reverses the string in-place                         `sb.reverse();`             


 `replace(int start, int end, String str)`  Replaces chars from `start` to `end - 1` with `str`  `sb.replace(1, 3, "zz");`   


 `charAt(int index)`                        Returns the char at index                            `sb.charAt(0);`             


 `setCharAt(int index, char ch)`            Modifies the char at index                           `sb.setCharAt(0, 'X');`     


 `toString()`                               Converts `StringBuilder` to `String`                 `String s = sb.toString();` 


 `length()`                                 Returns current length                               `sb.length();`              


 `capacity()`                               Returns current buffer capacity                      `sb.capacity();`            


 `ensureCapacity(int minCapacity)`          Ensures a minimum capacity                           `sb.ensureCapacity(100);`   


 `substring(int start, int end)`            Similar to `String.substring()`                      `sb.substring(0, 3);`       


                    
```

# Character : 
Various Charactor Wrapper class methods in java. 
<br>
```bash 

| Method                      | Description                 |
| --------------------------- | --------------------------- |
| `Character.isLetter(ch)`    | Checks if `ch` is a letter  |
| `Character.isDigit(ch)`     | Checks if `ch` is a digit   |
| `Character.isUpperCase(ch)` | Checks if `ch` is uppercase |
| `Character.isLowerCase(ch)` | Checks if `ch` is lowercase |
| `Character.toUpperCase(ch)` | Converts to uppercase       |
| `Character.toLowerCase(ch)` | Converts to lowercase       |

```


# Inbuilt Priority Queue : 
```bash 
import java.util.PriorityQueue;

PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-heap (default)
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap



// Some useful methods. 
add()	Inserts an element into the heap
poll()	Removes and returns the head (min or max)
peek()	Returns the head without removing it
isEmpty()	Checks if the queue is empty
size()	Returns number of elements in the heap
```

# Reference
[github.com/Kunal-Kushwaha/DSA-Bootcamp](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java)