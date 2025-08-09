package Recursion;

import java.util.ArrayList;

// Que : find all combination whose sum = target
public class Combinations {
    public static void combinations(int index, int[] arr, int target, ArrayList<Integer> list) {
        if (index >= arr.length) {
            if (target == 0) {
                System.out.println(list);
            }
            return;
        }

        // case of pick the element
        if (arr[index] <= target ) {
            list.add(arr[index]);
            combinations(index, arr, target - arr[index], list);
            list.remove(list.size() - 1);
            
        }
        // not pick case
        combinations(index + 1, arr, target , list);
        

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();
        combinations(0, arr, target, list);

    }
}
