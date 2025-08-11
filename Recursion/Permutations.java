package Recursion;

// Que : find all permutations
// import java.util.ArrayList;

// public class Permutations {

//     public static void permutation(int[] arr, ArrayList<Integer>ds,boolean[] freq){
//         if(ds.size()==arr.length){
//            // we can store this ds into another list data structure
//             System.out.println(ds);
//             return;
//         }

//         for(int i = 0 ;i<arr.length;i++){
//             if(!freq[i]){
//                 ds.add(arr[i]);
//                 freq[i]=true;
//                 permutation(arr, ds, freq);
//                 ds.remove(ds.size()-1);
//                 freq[i]= false;
//             }
//         }
        
//         ;
//     }

    
//     public static void main(String[] args) {
//         int [] arr = {1,2,3};
//         // 3! = 3x2x1 = 6
//         ArrayList<Integer> ds = new ArrayList<>();
//         boolean[] freq = new boolean[arr.length];
//         permutation(arr,ds,freq);

//     }
// }




// Que : find all permutations (Optimized way)
import java.util.Arrays;
public class Permutations {
    public static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
    public static void permutation(int index,int[] arr){
        if(index>= arr.length){
            // We can store this result in another list data structure
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = index ;i<arr.length;i++){
            swap(arr,index,i);
            permutation(index+1, arr);
            
        }
    }

    
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        // 3! = 3x2x1 = 6
        permutation(0,arr);

    }
}
