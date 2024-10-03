package LinkedList;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }

        head = node;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        } else if (index == size) {
            insertLast(value);
            return; 
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // first way
        Node node = new Node(value, temp.next, temp);

        // second way
        // Node node = new Node(value);
        // node.next = temp.next;
        // node.prev = temp;
        // temp.next.prev = node;
        // temp.next = node;

        temp.next.prev = node;
        temp.next = node;
        size++;

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("LinkedList does not exist");
            tail = null;
            return;
        }
        else if (size == 1){
            head= null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;

    }

    public void deleteLast() {
        if (size == 1) {
            deleteFirst();
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;

    }

    public void delete(int index) {
        if (size == 0) {
            System.out.println("LinkedList does not exist");
            return;
            
        } else if (index == 0) {
            deleteFirst();
            
        } else if (index == size-1) {
            deleteLast();
        
        } else if (index > size) {
            System.out.println("index out of bounds");
        } else {

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }

    public void deleteByValue(int value) {
        int index = index(value);
        delete(index);

    }

    public int index(int value) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.value == value) {
                break;
            }
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void display() {
        Node temp = head;
        if(temp == null){
            System.out.println("LL does not exist");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        

    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertFirst(23);
        // dl.insertLast(34);
        // dl.insertLast(54);
        // dl.insert(45, 1);
        // dl.display();
        dl.deleteFirst();

        // dl.deleteLast();
        // dl.delete(1);
        // dl.deleteByValue(34);
        dl.display();
    }
}
