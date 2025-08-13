// Que 1. Find the missing no when nos are given from [0,n].


// import java.util.Arrays;

// public class Practice {

//     public static void main(String[] args) {
//         int[] arr = {1,6,4,2,0,3};
//         int i =0;
//         int temp ;
        
//         while(i<arr.length){
//             int correct = arr[i] ;
//  Note:  when the element is greater than arr.length then simply ignore it(in case of range [0,n]). 
//             if(arr[i] < arr.length && arr[i] != arr[correct]){
//                 temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }else{
//                 i++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));

//         int missing=arr.length;
//         for(int index =0 ;index<arr.length;index++){
//             if(arr[index] != index){
//                 missing = index;
//                 break;
//             }
//         }


//         System.out.println(missing);
//     }
// }


// Que 2. Find the all the missing no when nos are given from [1,n].
// import java.util.ArrayList;
// import java.util.Arrays;

// public class AllMissingNo {

//     public static void main(String[] args) {
//         int[] arr = {4,3,2,7,8,2,3,1};
//         int i =0;
//         int temp ;
        
//         while(i<arr.length){
//             int correct = arr[i] -1 ; 
//             if(arr[i] != arr[correct]){
//                 temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }else{
//                 i++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));

//         ArrayList<Integer> arrayList = new ArrayList<>();

//         // Indices where the correct element is not present will be the answers.
//         for(int index= 0;index<arr.length;index++){
//             if(arr[index] != index+1 ){
//                 arrayList.add(index+1);
//             }
//         }


//         System.out.println(arrayList);
//     }
// }



// Q 3 :Find the duplicate element which occurs in the array of range [1,n];

//public class DuplicateElement {

    //     public static void main(String[] args) {
    //         int[] arr = { 1, 3, 4, 2, 2 };
    //         int i = 0;
    //         int temp;
    //         int duplicate_value = -1;
    //         while (i < arr.length) {
    
    //             if (arr[i] != i + 1) {
    //                 int correct = arr[i] - 1;
    
    //                 // when on correct indices, the correct element is not present then check that
    //                 // element at current index is already exist at its actual index
    
    //                 if (arr[i] != arr[correct]) {
    //                     temp = arr[i];
    //                     arr[i] = arr[correct];
    //                     arr[correct] = temp;
    //                 } else {
    
    //                     // this block of code will be executed element at current index is already exist
    //                     // at its actual index.
    //                     duplicate_value = arr[i];
    //                     break;
    //                 }
    //             } else {
    //                 i++;
    //             }
    
    //         }
    
    //         System.out.println(duplicate_value);
    
    //     }
    // }




// Q 4: Find the all duplicate elements which occurs in the array of range [1,n];

// import java.util.ArrayList;
// import java.util.Arrays;

// public class AllDuplicates {

//     public static void main(String[] args) {
//         int[] arr = {4,3,2,7,8,2,3,1};
//         int i = 0;
//         int temp ;
        
//         while(i<arr.length){
//             int correct = arr[i] -1 ;
//             if(arr[i] != arr[correct]){
//                 temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }else{
//                 i++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));

//         ArrayList<Integer> arrayList = new ArrayList<>();

//         // Element which is not at correct index will be the answers.
//         for(int index= 0;index<arr.length;index++){
//             if(arr[index] != index+1 ){
//                 arrayList.add(arr[index]);
               
//             }
//         }


//         System.out.println(arrayList);
//     }
// }





// Que 5 : Find the set mismatch. 
// Hint : In an array there is a no which is duplicated and there is a no missing. Just find out both


// import java.util.ArrayList;
// import java.util.Arrays;

// public class SetMismatch {

//     public static void main(String[] args) {
//         int[] arr = {1,2,2,4};
//         int i = 0;
//         int temp ;
        
//         while(i<arr.length){
//             int correct = arr[i] -1 ;
//             if(arr[i] != arr[correct]){
//                 temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }else{
//                 i++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
    
//         ArrayList<Integer> arrayList  = new ArrayList<>();
//         // Element which is not at correct index and (index+ 1) will be the answers.
//         for(int index= 0;index<arr.length;index++){
//             if(arr[index] != index+1 ){
//               arrayList.add(arr[index]);
//               arrayList.add(index+1);
               
//             }
//         }


//         System.out.println(arrayList);
//     }
// }


// Q 6 : Find the first smallest positive missing integer in an array . 

//import java.util.Arrays;

// public class PositiveMissing {

//     public static void main(String[] args) {
//         int[] arr = {7,8,9,11,12};
//         int i = 0;
//         int temp ;
        
//         while(i<arr.length){
//             int correct = arr[i] -1 ;
//             // ignore the no which are less than or equal to 0 and which are greater than arr.length.
//             if(arr[i]> 0 && arr[i]<=arr.length && arr[i] != arr[correct]){
//                 temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }else{
//                 i++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
    
//         int positive_missing = arr.length+1;

//         // Index where correct element is not present will be our answer. 
//         for(int index= 0;index<arr.length;index++){
//             if(arr[index] != index+1 ){
//               positive_missing = index+1;
//               break;
//             }
//         }


//         System.out.println(positive_missing);
//     }
// }





