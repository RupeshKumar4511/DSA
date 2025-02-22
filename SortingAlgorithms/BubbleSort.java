package SortingAlgorithms;

/*
 * BubbleSort Algorithm : It is a comparison based algorithm. 
 * In BubbleSort Algorithm ,firstly we take two value from starting and then check if the first value is smaller or greater than second ,
 * if fisrt value is greater than second then we swap first value with second value and this comparison continues  for (total comparison : (N-i-1) for every pass of outer loop).   
 * In this way the largest value will be set to the end in every pass.
 * Time Complexity :
 * Worst Case :  O(n^2) means when the array is reverse sorted.
 * Best Case :   O(n)  means when the array is already sorted.
 * Space Complexity : O(1) It is only auxiliary space. 
 * It is also known as sinking sort/exchange sort. 
 * It is also known as inplace sort because no extra space is required 
 * It is stable sorting algorithm. 
 */

 import java.util.Arrays;

 public class BubbleSort {
     public static void main(String[] args) {
         int[] arr = { 2, 6, 3, 8, 4, 5, 8 };
         int length = arr.length;
         boolean swapped;
         int temp;
         for (int i = 0; i < length; i++) {
            swapped = false;
             for (int j = 0; j < length - i - 1; j++) {
                 if(arr[j]> arr[j+1]){
                 temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
                 swapped = true;
                 
                 }
             }

            // if there is no swap in a single pass then it means it is already sorted. 
            if(!swapped){
                break;
            }
 
 
         }
         System.out.println(Arrays.toString(arr));
 
     }
 }