/*Insertion Sort : This algorithm states that sort the array in parts. 
In this sorting algorithm, firstly we take two values from the array and sort it by comparing the last value is smaller or not than previous one and if is smaller then swap them and if not then break the inner loop . And this process continues for (N-2) times. For moving to next value we use "j" variable. 
Total no of iteration for outer loop : (N-2) where N = length of array. 


 * Time Complexity :
 * Worst Case :  O(n^2) means when the array is reverse sorted.
 * Best Case :   O(n)  means when the array is already sorted.
 * Space Complexity : O(1) It is only auxiliary space. 
 * 
 * Advantages: 
 * It is adaptive because no of steps get reduced if array is sorted. No of swaps reduced  as compared to bubble sort. 
 * 
 * It is stable sorting algorithm.
 * 
 * It works well for smaller values of N. 
 * 
 * It is efficient for the array which is partially sorted. 
 * 
 * It takes part in hybrid sorting algorithm(means used in different useful sorting algorithm as a part of it).
*/

import java.util.Arrays;

class InsertionSort {
     public static void main(String[] args) {
         int[] arr = { 2, 6, 3, 8, 4, 5, 1 };
         int temp;
         for(int i = 0 ;i<=arr.length-2;i++){
            // for each outer loop pass, upto j value this inner loop will sort it. 
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
         }     
         System.out.println(Arrays.toString(arr));
 
     }
 }
