package Stack_Queues;
class CustomStackException extends Exception {
    public CustomStackException(String message) {
        super(message);
    }

}

public class StackUsingLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {

            tail.next = node;
            tail = node;
            size++;

        }

    }

    public int pop() throws CustomStackException {
        if (head == null) {
            throw new CustomStackException("Queue is empty");
        }else if(head == tail){
            Node temp = head;
            head = null;
            tail = null;
            return temp.data;
        }
        Node temp = head;
        while(temp.next.next != null){
             temp = temp.next;
        }
        temp.next = null;
        Node temp2 = tail;
        tail = temp;
        return temp2.data;
    }

    public void display() throws CustomStackException {
        if (head == null) {
            throw new CustomStackException("Queue is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public int peek() throws CustomStackException {
        if (head == null) {
            throw new CustomStackException("Queue is empty");
        }
        return tail.data;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;

        }

    }

    public static void main(String[] args) {
        try {
            StackUsingLinkedList stack = new StackUsingLinkedList();
            stack.add(32);
            stack.add(43);
            stack.add(35);
            stack.add(31);
            System.out.println(stack.pop());
            stack.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

