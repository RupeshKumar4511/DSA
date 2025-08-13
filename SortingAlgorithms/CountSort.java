

/*
 * Count Sort : 
 * 
 * It is a non-comparison sorting algorithm. 
 * It is good for small numbers. 
 */

import java.util.Arrays;

public class CountSort {
    private static int largest(int[] arr){
        int max = arr[0];
        for(int i = 1 ; i<arr.length;i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    private static void countSort(int[] arr) {
        int max = largest(arr);
        int[] freq = new int[max+1];
        for(int i = 0 ;i<arr.length;i++){
            freq[arr[i]] +=1;
        }
        int orginalIndex = 0 ;
        for(int j = 0 ;j <freq.length;j++){
            if(freq[j]>=0){
                for(int k = 0 ;k <freq[j];k++){
                    arr[orginalIndex] = j;
                    orginalIndex++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,2,8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    
}