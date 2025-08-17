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
//         printAllSubsequence(index+1, arr, list,sum+=arr[index],k);
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



// Que : print any one subsequences with sum = k 
// import java.util.ArrayList;
// public class Subsequences {

//     public static boolean printAllSubsequence(int index, int[] arr, ArrayList<Integer> list,int sum, int k ){
//         if(index>=arr.length){
//              // condition satisfied
//             if(sum==k){
//                 System.out.println(list);
//                 return true;
//             }
//              // condition not satisfied
//             return false;
//         }
//         list.add(arr[index]);
//         if(printAllSubsequence(index+1, arr, list,sum+=arr[index],k)==true)return true;
//         list.remove(list.size()-1);
//         sum -= arr[index];
//         if(printAllSubsequence(index+1, arr, list,sum+=arr[index],k)==true)return true;
//         return false;
        
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,1};
//         ArrayList<Integer> list = new ArrayList<>();
//         int sum = 0 ;
//         int k =  2;
//         printAllSubsequence(0, arr, list,sum,k);


//     }
// }




// Que : count subsequences with sum = k 
// import java.util.ArrayList;
// public class Subsequences {

//     public static int printAllSubsequence(int index, int[] arr, ArrayList<Integer> list,int sum, int k ){
//         if(index>=arr.length){
//             if(sum==k){
//                 return 1;
//             }
//             return 0;
//         }
//         list.add(arr[index]);
//         int left =  printAllSubsequence(index+1, arr, list,sum+arr[index],k);
//         list.remove(list.size()-1);
//         sum -= arr[index];
//         int right =  printAllSubsequence(index+1, arr, list,sum+=arr[index],k);
//         return left+right;
        
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,1};
//         ArrayList<Integer> list = new ArrayList<>();
//         int sum = 0 ;
//         int k =  2;
//         System.out.println(printAllSubsequence(0, arr, list,sum,k));


//     }
// }