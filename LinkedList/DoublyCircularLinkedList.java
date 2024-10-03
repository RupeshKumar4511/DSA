package LinkedList;

public class DoublyCircularLinkedList {
    Node head = null;
    Node tail = null;
    int size;

    public DoublyCircularLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;

            size++;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
        node.prev = tail;
        tail.next = node;
        size += 1;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            insertFirst(value);
            return;
        }

        tail.next = node;
        node.prev = tail;
        node.next = head;
        head.prev = node;
        tail = node;
        size += 1;
    }

    public void insert(int index,int value){
        if(index == 0 || size == 0){
            insertFirst(value);
        }
        else if (index == size){
            insertLast(value);
        }
        else{
           Node temp = head;
           for(int i =1;i<index;i++){
               temp = temp.next;
           }
           Node  node = new Node(value);
           node.next = temp.next;
           node.prev = temp;
           temp.next.prev= node;
           temp.next = node;
           size++;
           
        }
    }



    public void deleteFirst(){
        if(head == null){
            System.out.println("LL does not exist.");
            return;
        }
      
        else if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = temp.prev;
        temp.prev.next = head;
        size--;
    }



    public void deleteLast(){
        if(head == null){
              System.out.println("LL does not exist.");
        }
        else if(size == 1){
            deleteFirst();
        }
        else{
            Node temp = head;
            for(int i =0 ;i<size-2;i++){
                temp = temp.next;
            }
            temp.next = head;
            head.prev = temp;
            tail = temp;
            size--;
        }
    }


    public void delete(int index){
        if(head == null){
            System.out.println("LL does not exist.");
        }
        else if(index == 0){
          deleteFirst();
        }
        else if(index == size -1){
            deleteLast();
        }
        else{
            Node temp = head;
            for(int i =1 ;i<index;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
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
                System.out.print(temp.value + "<-->");
                temp = temp.next;
            } while (temp != head);

        }
        System.out.println("HEAD");

    }

    public class Node {
        int value;
        Node next, prev;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList dcl = new DoublyCircularLinkedList();
        dcl.insertFirst(12);
        dcl.insertFirst(23);
        dcl.insertLast(24);
        dcl.insert(3, 2);
        dcl.deleteFirst();
        dcl.display();
        // dcl.deleteLast();
        dcl.delete(2);
        dcl.display();

    }
}

