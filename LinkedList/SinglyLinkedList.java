package LinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
  
    public SinglyLinkedList() {
      size = 0;
    }
  
    public void insertFirst(int value) {
      Node node = new Node(value);
      node.next = head;
      head = node;
      size++;
  
      if (tail == null) {
        tail = head;
      }
  
    }
  
    public void insertLast(int value) {
      Node node = new Node(value);
      if (tail == null) {
        insertFirst(value);
      }
  
      tail.next = node;
      tail = node;
      size++;
  
    }
  
    public void insert(int value, int index) {
  
      if (index == 0) {
        insertFirst(value);
        return;
      } else if (index >= size) {
        insertFirst(value);
        return;
      }
  
      Node temp = head;
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
  
      Node node = new Node(value, temp.next);
      temp.next = node;
      size++;
  
    }
  
    public void deleteFirst() {
      
      if (head == null) {
        tail = null;
      }
      Node temp = head.next;
      head.value = temp.value;
      head = head.next;
  
      size--;
    }
  
    public void deleteLast() {
      if (size <= 1) {
        deleteFirst();
      }
      Node temp = head;
      for (int i = 0; i < size - 2; i++) {
        temp = temp.next;
      }
      tail.value = temp.value;
      temp.next = null;
      size--;
  
    }
  
    public void deleteByValue(int value) {
      if (size == 0) {
        System.out.println("SinglyLinkedList does not exist");
        return;
      }
      Node temp = head;
      while (temp.next != null) {
        if (temp.next.value == value) {
          break;
        }
        temp = temp.next;
      }
      temp.next = temp.next.next;
  
      size--;
  
    }
  
    public void delete(int index) {
  
      if (index == 0) {
        deleteFirst();
        return;
      } else if (index == size) {
        deleteLast();
        return;
      }
  
      Node temp = head;
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
  
    }
  
    public void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.value + " -> ");
        temp = temp.next;
      }
      System.out.println("end");
    }
  
  
    
    class Node {
      int value;
      Node next;
  
      public Node(int value) {
        this.value = value;
  
      }
  
      public Node(int value, Node next) {
        this.value = value;
        this.next = next;
      }
  
    }
  
    public static void main(String args[]) {
      SinglyLinkedList l = new SinglyLinkedList();
      l.insertFirst(3);
      l.insertLast(5);
      l.insertLast(45);
      l.insert(20, 2);
      l.display();
      // l.deleteFirst();
      // l.display();
      // l.deleteLast();
      // l.display();
  
      // l.delete(2);
      l.deleteByValue(45);
      l.display();
  
    }
  
  }