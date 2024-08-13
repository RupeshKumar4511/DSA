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
Time Complexity of a good Algorithm should be in O(log n) to O(1) where O is Big O notation.
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

# When to use Array:
1.When we need fast access to elements using an index.
<br>
2.When the number of elements is known ahead of time and will not change.
<br>
3.When you need a simple and straightforward data structure with minimal overhead(in terms of memory and time).
<br>


# Types of array on the basis of memory allocation:
1.Static array :These are such arrays whose size is fixed but  they allocates memory at run time.
for example : array.
<br>
2.Dynamic array : These are such array which allocates memory at runtime . It automatically grows up when we try to make insertion .
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

