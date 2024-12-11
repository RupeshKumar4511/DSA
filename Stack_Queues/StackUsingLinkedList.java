class CustomStackException extends Exception {
    public CustomStackException(String message) {
        super(message);
    }

}

public class StackUsingLinkedList {

    Node head = null;
    

    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        
        } else {

            node.next = head;
            head = node;
    

        }

    }

    public int pop() throws CustomStackException {
        if (head == null) {
            throw new CustomStackException("Queue is empty");
        }
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    public void display() throws CustomStackException {
        if (head == null) {
            throw new CustomStackException("Queue is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-");
            temp = temp.next;
        }
    }

    public int peek() throws CustomStackException {
        if (head == null) {
            throw new CustomStackException("Queue is empty");
        }
        return head.data;
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
