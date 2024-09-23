package DSA.Array;

import java.util.Scanner;
import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };
        Scanner in = new Scanner(System.in);
        System.out.println("enter the element to be insert ");
        int element = in.nextInt();
        System.out.println("enter the index at which elment to be inserted");
        int indexToInsert = in.nextInt();
        in.close();
        insert(numbers, element, indexToInsert);

    }

    // Insert an element at a specific position (requires shifting)

    public static void insert(int[] numbers, int element, int indexToInsert) {
        int[] newArr = new int[numbers.length + 1];
        if (indexToInsert >= numbers.length)   // points to be remember 
        {
            newArr[newArr.length - 1] = element;
        }
        for (int i = 0, j = 0; i < numbers.length; i++, j++) {
            if (i == indexToInsert) {
                newArr[j] = element;
                j++;
            } 
            newArr[j] = numbers[i];

        }
        System.out.println(Arrays.toString(newArr));

    }

}

