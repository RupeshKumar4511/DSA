package SortingAlgorithms;

import java.util.Arrays;

/* 
# Quick sort algorithm is used as inbuilt method to sort the primitive type of data in java.

# Quick Sort Algorithm :

In this algorithm , following things should keep in mind :


1.Divide and conquer : It means that divide the problem into subparts and solving these subparts and then combined them.
when we divides the problem it becomes tree like structures.


2.Recursion  : method calling itself.


3.Pivot : It is considered as central point of our problem. 

Note : In most of cases we take last element of an array as a pivot.


Time Complexity : O (n * log(n))
Space Complexity : O(log(n))
 */



public class QuickSort {

    public static void sort(int arr[],int low,int high){
        if(low >= high){
            return;
        }
    
        int start = low;
        int end = high;
        int mid = start + (end- start)/2;
        
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start]< pivot){
                start++;
            }
            while (arr[end]>pivot) {
                end--;
                
            }
            // this is why because if (start>end) it means no violation occurs so we
            // don't need to swap. 
            if(start<= end ){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }

        // Now the pivot is at correct index and we need to sort the remaining two halves.

        sort(arr,low,end);
        sort(arr,start,high);

    }
    public static void main(String[] args) {
        
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}