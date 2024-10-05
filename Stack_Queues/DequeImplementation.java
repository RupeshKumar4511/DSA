package Stack_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // arraydequeue is used for resizable array implementation.
        // This is faster than stack and LikedList used in queues because it promots insertion and deletion at both end.
        // null elements are not allowed .
        // not thread-safe.
        deque.add(2);
        deque.add(23);
        System.out.println(deque.peek());

    }
}
