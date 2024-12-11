package SortingAlgorithms;

/*For Insertion Sort ,firstly we assume a key (where key is a variable that indicates 
the elemnent of array which is at right position in the array  and in most of cases we starts chosing key from first element of array ) and then assumes
another varible j which is used to compare with key . In this Sorting technique we are
basically shifting the element on the right index.

 * Time Complexity :
 * Worst Case :  O(n^2) means when the array is reverse sorted.
 * Best Case :   O(n)  means when the array is already sorted.
 * Space Complexity : O(1) It is only auxiliary space. 
*/

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,9,1,7};
        int key;
        int j; // this is our pointer
        for(int i=1; i<arr.length; i++){
            key = arr[i];
            j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=key;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}

