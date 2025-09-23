import java.util.Arrays;

public class RadixSort {
private static int largest(int[] arr){
        int max = arr[0];
        for(int i = 1 ; i<arr.length;i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    private static void countSort(int[] arr,int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        // sort the digits
        for(int i = 0 ;i<n;i++){
            count[(arr[i]/exp)%10]++; // increment the frequency of that digit in the count array.
        }

        // These two loops are used to show the change in the original array 
        // according to sorted by digits


        for(int j = 1 ;j <10;j++){
            // Converts count into a prefix sum array.
            // Each index now stores the position of the last occurrence of that digit in the sorted output.
            count[j] = count[j]+ count[j-1];
        }
        System.out.println("Updated count Array for "+exp+ "="+Arrays.toString(count));

        // Build output array
        // Process elements from right to left to maintain stability (important for Radix Sort).
        // Places each element in its correct position inside output.
        // Decrements count so the next same-digit element is placed correctly.
        for(int k = n-1 ;k>=0;k--){
            output[count[(arr[k]/exp)%10]-1]= arr[k];
            count[(arr[k]/exp)%10]--;
        }
        System.out.println("Sorted Output array for "+exp+"="+Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void radixSort(int[] arr){
        int max = largest(arr);
        // do count sort for every digit place
        for(int exp = 1 ;max/exp>0;exp*=10){
            countSort(arr,exp);     
        }
    }

    public static void main(String[] args) {
        int[] arr = {29,83,471,36,91,8};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
}
