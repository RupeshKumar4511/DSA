package SortingAlgorithms;

/*
# Merge sort algorithm is used in inbuilt sort method for object in python.

# Merge Sort Algorithm :

In this algorithm , following things should keep in mind :

1.Divide and conquer : It means that divide the problem into subparts and solving these subparts and then combined them. In this algorithm we divides the problem by using median. 

Median : It is the mid index of an array.

when we divides the problem it becomes tree like structures.

2.Recursion : method calling itself.
 

# Steps to be taken in this algorithm
Divide the array into two parts by calculate median. Median is calculated by "arr.length" divide by 2.

Sort the first half and second half individually via recursion. 

Get the both parts sorted via recursion and then merge both parts. 


Time Complexity : O (n * log(n))
Space Complexity : O(n)

MergeSort is better in linkedList due to non continuous memory allocation. 

*/

// This is not a inplace algorithm because here we are returning new sorted array while the original remains same . 

import java.util.Arrays;

public class MergeSortAlgorithm {

    public static int[] mergeSort(int[] arr) {
            
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/ 2; 

        int[] left  =  mergeSort(Arrays.copyOfRange(arr,0,mid));

        int[] right  =  mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(arr, left, right);

        
       
    }

    private static int[] merge(int[] arr, int[] left, int[] right) {
        int[] mixArr = new int[left.length+right.length];

        int i = 0; // pointer for left array
        int j = 0; // pointer for right array
        int k = 0; // pointer for resultant array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                mixArr[k] = left[i];
                i++;
            } else {
                mixArr[k] = right[j];
                j++;
            }
            k++;
        }


        // there may be possible that all elements of either of two array is not completed

        // appending the remaining element to last of the mixArr

        while (i < left.length) {
            mixArr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mixArr[k] = right[j];
            j++;
            k++;

        }
        
        return mixArr;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 2, 1, 8 };
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
        
    }
}




// This is inplace mergesort algorithm


class MergeSortInplaceAlgorithm {

    public static void mergeSortInplace(int[] arr,int start ,int end) {
            
        if(end- start == 1){
            return  ;
        }
       
        int mid = (end+start)/ 2; 

        mergeSortInplace(arr,start,mid);

        mergeSortInplace(arr,mid,end);

        mergeInplace(arr,start,mid,end);
        

        
       
    }

    private static void mergeInplace(int[] arr,int start,int mid , int end) {
        int[] mixArr = new int[end-start];

        int i = start; // pointer for left array
        int j = mid; // pointer for right array
        int k = 0; // pointer for resultant array
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                mixArr[k] = arr[i];
                i++;
            } else {
                mixArr[k] = arr[j];
                j++;
            }
            k++;
        }


        // there may be possible that all elements of either of two array is not completed

        // appending the remaining element to last of the mixArr

        while (i < mid) {
            mixArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mixArr[k] = arr[j];
            j++;
            k++;

        }
        


        for(int l = 0 ; l<mixArr.length;l++){
            arr[start+l] = mixArr[l];
        }
      

    }

    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
}
