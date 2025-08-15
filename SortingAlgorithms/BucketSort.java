import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void bucketSort(double[] arr) {
        int n = arr.length;

        // 1. Create n empty buckets
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // 2. Put array elements into different buckets
        for (double value : arr) {
            int bucketIndex = (int) (value * n); 
            buckets[bucketIndex].add(value);
        }

        // 3. Sort individual buckets
        for (ArrayList<Double> bucket : buckets) {
            Collections.sort(bucket); // TimSort
        }

        // 4. Concatenate all buckets into arr[]
        int index = 0;
        for (ArrayList<Double> bucket : buckets) {
            for (double value : bucket) {
                arr[index++] = value;
            }
        }
    }
   
    public static void main(String[] args) {
        double [] arr = {.78,.17,.39,.26,.72,.97,.21,.12,.23,.68};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
