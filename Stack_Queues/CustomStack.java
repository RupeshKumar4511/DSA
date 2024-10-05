package Stack_Queues;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

}

public class CustomStack {
    public int[] data;
    protected static final int DEFAULT_SIZE = 10;
    public int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int element) throws MyException {
        if (isFull()) {
            throw new MyException("Stack is full");
        } else {
            ptr++;
            data[ptr] = element;
        }

    }

    public int pop() throws MyException {
        if (isEmpty()) {
            throw new MyException("Stack is empty");

        }
        int temp = data[ptr];
        data[ptr] = 0;
        ptr--;
        return temp;

    }

    public void display() throws MyException {
        if (isEmpty()) {
            throw new MyException("Stack is empty");
        }
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + "->");
        }
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public static void main(String[] args) {
        try {
            CustomStack stack = new CustomStack();
            // stack.push(23);
            // stack.push(12);
            System.out.print(stack.pop());
            // stack.pop();
            // stack.display();
        } catch (MyException e) {
            System.out.print(e);
        }
    }

}
