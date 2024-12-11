package SortingAlgorithms;

/*
 * BubbleSort Algorithm :
 * In BubbleSort Algorithm ,firstly we take two value from starting and then check if the first value is smaller or greater than second ,
 * if fisrt value greater than second then we swap first value with second value and this process continues till last comparison.
 * In this way the largest value will be set to the end.
 * Time Complexity :
 * Worst Case :  O(n^2) means when the array is reverse sorted.
 * Best Case :   O(n)  means when the array is already sorted.
 * Space Complexity : O(1) It is only auxiliary space. 
 * 
 */

 import java.util.Arrays;

 public class BubbleSort {
     public static void main(String[] args) {
         int[] arr = { 2, 6, 3, 8, 4, 5, 8 };
         int length = arr.length;
         int temp;
         for (int i = 0; i < length; i++) {
             for (int j = 0; j < length - i - 1; j++) {
                 if(arr[j]> arr[j+1]){
                 temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
                 
                 }
             }
 
 
         }
         System.out.println(Arrays.toString(arr));
 
     }
 }
 