package LinkedList;

public class CircularLinkedList {

    Node head;
    Node tail;
    int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            tail = node;
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        tail.next = node;
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            tail = node;
            head = node;
            size++;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int index, int value) {

        if (index == 0 || size == 0) {
            insertFirst(value);
            return;
        } else if (index == size) {
            insertLast(value);
            return;
        } else if (index > size) {
            System.out.print("Index is out of bounds");
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else if (head == tail) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            tail.next = head;
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else if (head == tail) {
            head = null;
            size--;

        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            size--;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            size -= 1;
        } else if (index > size) {
            System.out.println("index is out of bounds");
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size -= 1;
        }

    }

    public void display() {
        
        if (head == null) {
            System.out.println("linked list does not exist");
            return;
        }
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
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

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertLast(23);
        cl.insertLast(24);
        cl.insertLast(2);
        cl.insertFirst(21);
        cl.insert(1, 20);

        // cl.display();
        // cl.delete(2);
        // cl.deleteFirst();
        // cl.deleteLast();
        // cl.deleteLast();
        // cl.deleteLast();
        // cl.deleteLast();
        // cl.deleteLast();

        cl.display();
        cl.delete(3);
        cl.display();
    }
}

