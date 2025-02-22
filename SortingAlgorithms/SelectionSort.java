package SortingAlgorithms;

/* SelectionSort Algorithm : This algorithm states that select the element and place it at the right index. 
 we firstly assume first element of array as smallest and then compare the 
first element with all other elemnt of array . If any other element is smaller than first element 
then change the minimum index (minmumIndex is a variable that stores index of minimum element).
After that swap the first value with the minimum value and
After every pass the one element is sorted at beginning. 
And total no of comparison is (N-i-1) for every pass of outer loop. 
Time Complexity :
 * Worst Case :  O(n^2) 
 * Best Case :   O(n^2) 
 * Space Complexity : O(1) It is only auxiliary space. 
 * 
 * 
 * Important Point : 
 * Selection Sort is never makes more than O(n) swaps and can be useful when memory write is costly operation.
 * It is an unstable sorting algorithm.
 * It performs well for the smaller arrays.
 * 
 * 
*/
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,4,6,2,1,9,7,8};
        int size = arr.length;
        int temp;
        int minIndex = -1;
        for (int i =0; i<size ; i++){
            minIndex=i;
            for(int j= i+1 ; j<size ;j++){
               if(arr[minIndex]>arr[j]){
                 minIndex =j;
               }
            }
            temp =arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i] = temp;

            System.out.print(arr[i]+ " ");
        }

    }
}
