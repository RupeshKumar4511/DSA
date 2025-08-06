package Recursion;

import java.util.Arrays;

public class basics {
    public static void printN(int i, int N) {
        if (i > N) {
            return;
        }
        printN(i + 1, N);
        System.out.println(i);
        // This will not be printed until "printN(i+1,N)" is completed its execution.
        // If there is one more recursive function at this place then that will also not
        // executed until the previous function is completed its execution.
    }

    public static void sumUsingParams(int i, int sum) {
        if (i < 1) {
            System.err.println(sum);
            return;
        }
        sumUsingParams(i - 1, sum + i);

    }

    public static int sum(int N) {
        if (N == 1) {
            return 1;
        }
        return N + sum(N - 1);
    }

    public static int sumOfArraysElement(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sumOfArraysElement(arr, i + 1, sum + arr[i]);

    }

    public static int[] reverse(int arr[], int left, int right) {
        if (left == right) {
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return reverse(arr, left + 1, right - 1);
    }

    public static boolean palindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return palindrome(str, left + 1, right - 1);

    }

    public static void main(String[] args) {
        printN(1, 4);
        sumUsingParams(10, 0);
        System.out.println(sum(10));
        int[] arr = { 1, 2, 3 };
        System.out.println(sumOfArraysElement(arr, 0, 0));
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length - 1)));

        String str = "aba";
        System.out.println(palindrome(str, 0, str.length() - 1));

    }
}
