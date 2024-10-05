package Stack_Queues;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

}

public class DynamicCircularQueue {

    
    int[] data;
    protected static final int DEFAULT_SIZE = 3;
    protected int end = 0;
    protected int start = 0;
    protected int size = 0 ;

    public DynamicCircularQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        // point to be remember
        if (isFull()) {
            int[] temp = new int[data.length*2];
            for(int i =0 ;i<data.length;i++){
                temp[i] = data[(start+ i)%data.length];
            }
            // we are making the start = 0 and end = data.length because the previous is full and in new ones start is always 0 end points to the last element.
            start = 0 ;
            end = data.length;
            data = temp;
            
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

            DynamicCircularQueue dynamicCircularQueue = new DynamicCircularQueue();
            dynamicCircularQueue.add(23);
            dynamicCircularQueue.add(24);
            dynamicCircularQueue.add(25);
            System.err.println(dynamicCircularQueue.remove());
            dynamicCircularQueue.add(26);
            dynamicCircularQueue.add(27);
            
            dynamicCircularQueue.add(28);
            dynamicCircularQueue.add(29);
            dynamicCircularQueue.add(30);

            
            dynamicCircularQueue.display();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
