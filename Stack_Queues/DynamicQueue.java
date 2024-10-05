package Stack_Queues;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

}

public class DynamicQueue {

    int[] data;
    protected static final int DEFAULT_SIZE = 2;
    public int ptr = -1;

    public DynamicQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            // Now the queue is not empty
            ptr++;
            data[ptr] = element;
        } else {
            ptr++;
            data[ptr] = element;
        }
    }

    public int remove() throws MyException {
        if (isEmpty()) {
            throw new MyException("Stack is Empty");
        }
        int temp = data[0];
        for(int i = 1;i<=ptr;i++){
            data[i-1] = data[i];
        }
        ptr--;
        return temp;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i=0;i<=ptr;i++) {
                System.out.print(data[i] + "->");
            }
        }
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {
        try {

            DynamicQueue dynamicQueue = new DynamicQueue();
            dynamicQueue.add(23);
            dynamicQueue.add(24);
            dynamicQueue.add(25);
            dynamicQueue.add(26);
            dynamicQueue.add(23);
            dynamicQueue.add(24);
            dynamicQueue.add(25);
            dynamicQueue.add(26);

            System.err.println(dynamicQueue.remove());
            dynamicQueue.display();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}




