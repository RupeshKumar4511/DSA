package Trees;

import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> list;

    public Heap() {
        this.list = new ArrayList<>();
    }

    public static int parent(int index) {
        return (index - 1) / 2;
    }

    public static int left(int index) {
        return 2 * index + 1;
    }

    public static int right(int index) {
        return 2 * index + 2;
    }

    public void insert(int element) {
        list.add(element);
        upheap(list.size() - 1);
    }

    public void upheap(int index) {
        if (index == 0) {
            return;
        }
        int parentNode = parent(index);
        if (list.get(index) < list.get(parentNode)) {
            swap(index, parentNode);
            upheap(parentNode);
        }
    }

    private void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int remove() {
        if (list.size() == 0) {
            throw new Error("Heap is empty");
        }

        int root = list.get(0);
        int last = list.remove(list.size() - 1);

        if (list.size() != 0) {
            list.set(0, last);
            downheap(0);
        }

        return root;

    }

    private void downheap(int i) {
        int min = i;
        int leftChild = left(i);
        int rightChild = right(i);
        if (leftChild < list.size() && list.get(leftChild) < list.get(min)) {
            min = leftChild;
        }
        if (rightChild < list.size() && list.get(rightChild) < list.get(min)) {
            min = rightChild;
        }

        if (min != i) {
            swap(i, min);
            downheap(min);
        }
    }

    public static Heap populate(int[] elements) {
        Heap p = new Heap();
        for (int i : elements) {
            p.insert(i);
        }
        return p;
    }

    public static ArrayList<Integer> heapSort(int[] elements) {
        ArrayList<Integer> ans = new ArrayList<>();
        Heap p = populate(elements);
        while (!p.list.isEmpty()) {
            ans.add(p.remove());
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(heapSort(new int[]{13,9,25,12,4}));
    }
}
