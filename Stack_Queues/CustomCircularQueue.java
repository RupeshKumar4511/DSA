package Stack_Queues;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

}

public class CustomCircularQueue {

    int[] data;
    protected static final int DEFAULT_SIZE = 3;
    protected int end = 0;
    protected int start = 0;
    protected int size = 0 ;

    public CustomCircularQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[end++] = element;
        end = end%data.length;
        size++;
    }

    public int remove() throws MyException {
        if (isEmpty()) {
            throw new MyException("Queue is empty");
        }

        int temp = data[start++];
        size--;
        return temp;
    }

    // point to be remember
    public void display() {
        if (isEmpty()) {
            // System.out.println("Queue is empty");
        } else {
           int i = start;
           do{
            System.out.print(data[i] + "->");
            i++;
            i = i%data.length;
           }while(i != end);
        }
    }


    // point to be remember
    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        try {
            CustomCircularQueue customCircularQueue = new CustomCircularQueue();
            customCircularQueue.add(24);
            customCircularQueue.add(25);
            customCircularQueue.add(26);
            // customCircularQueue.add(27);

            customCircularQueue.remove();
            customCircularQueue.display();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

}

