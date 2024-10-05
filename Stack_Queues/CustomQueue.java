package Stack_Queues;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

}

public class CustomQueue {
    int[] data;
    protected static final int DEFAULT_SIZE = 10;
    public int end = -1;   

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[++end] = element;
    }

    public int remove() throws MyException {
        if (isEmpty()) {
            throw new MyException("Queue is empty");
        }

        // if we are using one pointer i.e end then it requires shifting
        for(int i = 1;i<=end;i++){
            data[i-1] = data[i];
        }
        end--;
        return data[0];


    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i <= end; i++) {
                System.out.print(data[i] + "<-");
            }
        }
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public static void main(String[] args) {
        try {
            CustomQueue customQueue = new CustomQueue();
            customQueue.add(24);
            customQueue.add(25);
            customQueue.add(26);
            customQueue.remove();
            customQueue.display();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

