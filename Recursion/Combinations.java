package Recursion;


// Que : find all combination whose sum = target

// import java.util.ArrayList;
// public class Combinations {
//     public static void combinations(int index, int[] arr, int target, ArrayList<Integer> list) {
//         if (index >= arr.length) {
//             if (target == 0) {
//                 // We can store these list in another list data structure
//                 System.out.println(list);
//             }
//             return;
//         }

//         // case of pick the element
//         if (arr[index] <= target ) {
//             list.add(arr[index]);
//             combinations(index, arr, target - arr[index], list);
//             list.remove(list.size() - 1);
            
//         }
//         // not pick case
//         combinations(index + 1, arr, target , list);
        

//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 6, 7 };
//         int target = 7;
//         ArrayList<Integer> list = new ArrayList<>();
//         combinations(0, arr, target, list);

//     }
// }







// Que : find all combination whose sum is target but one element will picked or not picked only once. Result index will be in lexicographically sorted order. 

// import java.util.ArrayList;

// public class Cominations {

//     public static void combinations(int index, int[] arr, int target, ArrayList<Integer> list) {

//         if (target == 0) {
//             System.out.println(list);
//             return;
//         }

//         for (int i = index; i < arr.length; i++) {
            // Here (i>index) because first index will always be taken whether it is repeated or not 
            // while picking next element.
            // Here ( arr[i] == arr[i - 1]) because duplicate gives the same combination. 
//             if (i > index && arr[i] == arr[i - 1])
//                 continue;
//             // case of not pick the element
//             if (arr[i] > target) {
//                 break;
//             }
//             // case of pick element
//             list.add(arr[i]);
//             combinations(i + 1, arr, target - arr[i], list);
//             list.remove(list.size() - 1);

//         }

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1,1,1,2,2};
//         int target = 4;
//         ArrayList<Integer> list = new ArrayList<>();
//         combinations(0, arr, target, list);

//     }
// }