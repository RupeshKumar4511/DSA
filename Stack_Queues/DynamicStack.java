package Stack_Queues;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

}

public class DynamicStack {

    int[] data;
    protected static final int DEFAULT_SIZE = 2;
    public int ptr = -1;

    public DynamicStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void push(int element) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            // Now the stack is not empty
            ptr++;
            data[ptr] = element;
        } else {
            ptr++;
            data[ptr] = element;
        }
    }

    public int pop() throws MyException {
        if (isEmpty()) {
            throw new MyException("Stack is Empty");
        }
        int temp = data[ptr];
        data[ptr] = 0;
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

            DynamicStack dynamicStack = new DynamicStack();
            // dynamicStack.push(23);
            // dynamicStack.push(24);
            // dynamicStack.push(25);
            // dynamicStack.push(26);
            // dynamicStack.push(23);
            // dynamicStack.push(24);
            // dynamicStack.push(25);
            // dynamicStack.push(26);

            System.err.println(dynamicStack.pop());
            // dynamicStack.display();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

