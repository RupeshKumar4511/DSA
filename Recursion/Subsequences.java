package Recursion;

// import java.util.ArrayList;

// public class Subsequences {
//     public static void printAllSubsequence(int index, int[] arr, ArrayList<Integer> list) {
//         if (index >= arr.length) {
//             System.out.println(list);
//             return;
//         }
//         list.add(arr[index]);
//         printAllSubsequence(index + 1, arr, list);
//         list.remove(list.size() - 1);
//         printAllSubsequence(index + 1, arr, list);

//     }

//     public static void main(String[] args) {
//         int[] arr = { 3, 1, 2 };
//         ArrayList<Integer> list = new ArrayList<>();
//         printAllSubsequence(0, arr, list);

//     }
// }



// Que : print all subsequences with sum = k 
// import java.util.ArrayList;
// public class Subsequences {

//     public static void printAllSubsequence(int index, int[] arr, ArrayList<Integer> list,int sum, int k ){
//         if(index>=arr.length){
//             if(sum==k){
//                 System.out.println(list);
//             }
//             return;
//         }
//         list.add(arr[index]);
//         printAllSubsequence(index+1, arr, list,sum+arr[index],k);
//         list.remove(list.size()-1);
//         sum -= arr[index];
//         printAllSubsequence(index+1, arr, list,sum+=arr[index],k);
        
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,1};
//         ArrayList<Integer> list = new ArrayList<>();
//         int sum = 0 ;
//         int k =  2;
//         printAllSubsequence(0, arr, list,sum,k);


//     }
// }