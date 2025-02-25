package SortingAlgorithms;
/*
 * When the values are given from range (1 to N ) then apply Cyclic Sort.
 * 
 * Important Point: 
 * When the values are given in a range even if it is jumbled : 
 * After sort(in case of range [1,n]) : correct_index of element = element's value - 1; 
 * 
 * After sort(in case of range [0,n]) : correct_index of element = element's value ; 
 * 
 * In this algorithm we check the element is at correct index or not.
 * if not then swap the first value with its correct index. 
 * After swap first value will be placed at correct index but the new swapped value at 
 * first position may or may not be sorted so we need to again check it and then move 
 * to next element to sort it.  
 * 
 * In worst case total no of comparison is (2N - 1 ) and total swaps made is (N-1).
 * Time Complexity: 
 * Worst Case : O(n)
 * Best Case : O(n)
 */
import java.util.Arrays;

public class CyclicSort {
     public static void main(String[] args) {
         int[] arr = { 7,8,2,1,6,5,3,4 };
         int temp ;
         int i = 0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }

         }
         System.out.println(Arrays.toString(arr));
 
     }
 }
