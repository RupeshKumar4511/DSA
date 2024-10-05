package Stack_Queues;

class CustomQueueException extends Exception {
    public CustomQueueException(String message) {
        super(message);
    }

}


public class QueueUsingLinkdList {
    
    Node head = null;
    Node tail = null;
    int size = 0;
   
    
    public void add(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            tail = node;
            size++;
        }else{
            
            tail.next = node;
            tail = node;
            size++;

        }

    }

    public int remove() throws CustomException{
        if(head == null){
            throw new CustomException("Queue is empty");
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }


    public void display() throws CustomQueueException{
        if(head == null){
            throw new CustomQueueException("Queue is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public int peek() throws CustomQueueException{
        if(head == null){
            throw new CustomQueueException("Queue is empty");
        }
        return head.data;
    }

    class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data  = data;
            
        }
    
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
            
    
        }
    
    }
    
    public static void main(String[] args) {
      try{
        QueueUsingLinkdList queue  = new QueueUsingLinkdList();
        queue.add(32);
        queue.add(43);
        queue.add(35);
        queue.add(31);
        System.out.println(queue.remove());
        queue.display();

      }catch(Exception e){
        System.out.println(e);
      }
    }

}
