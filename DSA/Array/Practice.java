// Que 1. Given an array A as integer we need to find the leaders in the array. A
//  elements is said to be leader if it is greater than or equal to its all
//  elements to right side.

// import java.util.HashSet;
// public class  Practice{

//     public static  HashSet<Integer> findLeaders(int[] arr) {
        
//         HashSet<Integer> leaders = new HashSet<>();
//         leaders.add(arr[arr.length-1]);
//         int max = arr[arr.length-1];
//         for(int i = arr.length-2;i>=0;i--){
//             if(arr[i] >= max){
//               leaders.add(arr[i]);
//               max = arr[i];
              
//             }
//         }
        
//         return leaders;

//     }
        
    

//     public static void main(String[] args) {
//         int[] A = {16, 17,5,1,3, 4, 3, 5, 2};
        
//         HashSet<Integer> leaders = findLeaders(A);
        
//         // Print the leaders
//         System.out.println("Leaders in the array: " + leaders);
//     }
// }


// Que 2. maximum b/w two points in array:

// public class Practice{
//     public static void main(String[] args){
//       int[] arr = {2,3,5,6,8,9,10};
//       System.out.println(maxRange(arr,2,5));
//     }
//     public static int maxRange(int[] arr, int start, int end){
//       int max = arr[start];
//       if(start>end) // point to be noted
//       {
//         return -1;
//       }
//       else if (arr.length == 0){
//         return -1;
//       }
//       for(int i =start ;i<=end ; i++){
//          if(arr[i]>arr[start]){
//           max = arr[i];
//          }
//       }
//       return max;
//     }
//   }




// Que 3.Insertion and deletion in array.

// import java.util.Arrays;
// import java.util.Scanner;

// public class Practice {

// public static void main(String[] args) {
// // Declare and initialize an array
// int[] numbers = { 10, 20, 30, 40, 50 };
// Scanner in = new Scanner(System.in);
// System.out.println("enter the element to be insert ");
// int element = in.nextInt();
// System.out.println("enter the index at which elment to be inserted");
// int indexToInsert = in.nextInt();

// insert(numbers, element, indexToInsert);

// System.out.println("enter the element to be deleted");
// int elementToDelete = in.nextInt();
// delete(numbers, elementToDelete);
// in.close();

// }

// Insert an element at a specific position (requires shifting)

// public static void insert(int[] numbers, int element, int indexToInsert) {
// int[] newArr = new int[numbers.length + 1];
// for (int i = 0, j = 0; i < numbers.length; i++, j++) {
// if (i == indexToInsert) {
// newArr[j] = element;
// j++;
// } else if (indexToInsert >= numbers.length - 1) {
// newArr[newArr.length - 1] = element;
// }
// newArr[j] = numbers[i];

// }
// System.out.println(Arrays.toString(newArr));

// }


// other way
// int[] arr = { 2, 6, 3, 1, 7, 8 };
// int[] newArr = new int[arr.length + 1];
// int element = 5;
// int index = arr.length-1;
// int j = 0;
// for (int i = 0; i < arr.length; i++) {

//     newArr[j] = arr[i];
//     if (i == index) {
//         int temp = arr[i];
//         newArr[j] = element;
//         j++;
//         newArr[j] = temp;

//     }
//     j++;
// }

// System.out.println(Arrays.toString(newArr));



// Delete an element at a specific position (requires shifting)
// public static void delete(int[] numbers, int elementToDelete) {

// for (int i = 0, j = 0; i < numbers.length - 1; i++, j++) {
// if (numbers[i] == elementToDelete) {
// j++;
// }
// else if (numbers[numbers.length - 1] == elementToDelete) {
// numbers[numbers.length-1]= 0;
// }
// numbers[i] = numbers[j];
// }

// System.out.println(Arrays.toString(numbers));

// }
// }







// Bubble sort
// public class Practice {

// public static void main(String[] args) {
// int[] arr = { 2, 23, 43, 34, 1, 3, 42, 45 };
// int temp;
// for (int i = 0; i < arr.length; i++) {
// for(int j = 0 ; j<arr.length-i-1;j++){
// if(arr[j]>arr[j+1]){
// temp = arr[j];
// arr[j] = arr[j+1];
// arr[j+1] = temp;

// }
// }
// }

// for(int i: arr){
// System.out.print(i+ " ");
// }
// }
// }

// Selection Sort
// public class Practice {

// public static void main(String[] args) {
// int[] arr = {23,564,656,22,33,43,344};
// int minIndex;
// int temp;
// for(int i =0; i < arr.length;i++){
// minIndex = i;
// for(int j = i+1; j<arr.length;j++){
// if(arr[minIndex] > arr[j]){
// minIndex = j;
// }

// }
// temp = arr[minIndex];
// arr[minIndex] = arr[i];
// arr[i] = temp;
// }
// for(int k : arr){
// System.out.println(k);
// }
// }
// }


// Linear Search in 2d array
// import java.util.Arrays;

// public class Practice {
// public static void main(String[] args) {
// int[][] arr = { { 234, 434, 2 }, { 324, 345325 } };
// int target = 2;
// System.out.println(Arrays.toString(Search(arr, target)));

// }

// static int[] Search(int [][] arr, int target){

// for(int i = 0 ; i< arr.length;i++){
// for(int j =0 ; j<arr[i].length;j++){
// if(arr[i][j] == target ){

// return new int[]{i,j}; // Point to be noted
// }
// }

// }
// return new int[]{-1,-1};
// }
// }


// Q: Given an array containing some integer value . find the no of elements
// which contains even no of digits.

// public class Practice{
// public static void main(String[] args){
// int[] nums = {12,345,23,6,7896};
// int count = 0;
// for(int i : nums){
// if(digits(i) %2 == 0){
// count++;
// }
// }
// System.out.println(count);

// }

// static int digits(int element){
// int number =0;
// if(element < 0){
// element = element * -1;

// }
// if(element == 0){
// return 1;
// }

// while (element>0) {
// number++;

// element = element/10;
// }

// // the other way to counts the no of digits is using number system.
// /*if(element<0){
// element = element * -1;}
// * return (int) (Math.log10(element)) +1 ;
// } */

// return number;
// }
// }

// Q. Given an m * n integer grid accounts where accounts[i][j] is the amount of
// money the ith customers has in the jth accounts . Return the wealth the
// richest customer has.

// public class Practice {
// public static void main(String[] args) {
// int[][] arr = { { 100, 2, 3 }, { 30, 20, 10 } };
// int max = checkBalance(arr);
// System.out.println(max);
// }

// static int checkBalance(int[][] arr) {
// int maxWealth = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// int rowsum = 0;
// for (int j = 0; j < arr[i].length; j++) {
// rowsum += arr[i][j];

// }
// if(rowsum > maxWealth){
// maxWealth = rowsum;
// }
// }
// return maxWealth;
// }
// }

// Binary Search
// public class Practice {
// public static void main(String[] args){
// int [] arr = {1,2,3,4,5,77,89};
// int target = 3;
// System.out.println(BinarySearch(arr,target));

// }

// public static int BinarySearch(int[] arr1, int target) {
// int mid =0;
// int left = 0;
// int right = arr1.length - 1;
// boolean isAsc = arr1[left]<= arr1[right];

// while (left <= right) {

// // mid = (left + right ) /2 this may gives an error when left and right value
// exceeds the int limit;
// mid = left + (right-left)/ 2;

// if(arr1[mid] == target){
// return mid;
// }

// else if(isAsc){
// if (arr1[mid] > target) {
// right = mid - 1;

// }
// else {
// left = mid+1;
// }
// }
// else{
// if (arr1[mid] < target) {
// right = mid - 1;

// }
// else {
// left = mid+1;
// }
// }

// }
// return -1;

// }
// }

// Q .Find the ceiling and floor of a number in an array.
// ceiling : smallest element in an array which is greater than or equal to
// target.In this case , just return value of left index(using binary search).
// floor : greatest element in arrray which smaller than or equal to target .In
// this case , just return value of right index(using binary search).

// public class Practice {
// public static void main(String[] args){
// int [] num = {2,3,9,13,15,17,18};
// int target = 14;
// System.out.println(searchCeiling(num,target));

// // Here this an sorted array so that we can apply Binar Search

// }

// static int searchCeiling(int[] arr, int target){
// int left =0;
// int right = arr.length -1;

// while(left<=right){
// int mid = left + (right-left)/2;

// if(arr[mid] == target){
// return arr[mid];
// }
// else if (arr[mid]>target){
// right = mid-1;
// }
// else{
// left = mid +1;
// }

// }
// return arr[left];

// }
// }

// Q. Find the smallest letter greater than target in an array.

// public class Practice {
// public static void main(String[] args){
// char[] arr = {'c','f','j'};
// char target = 'j';
// System.out.println(Search(arr,target));

// }

// static char Search(char[] arr,char target){
// int start = 0;
// int end = arr.length-1;

// while(start <= end){
// int mid = start + (end-start)/2;
// if(arr[mid] <= target){
// start = mid +1;
// }
// else if(arr[mid] > target){
// end = mid-1;

// }

// }
// return arr[start%arr.length];   //point to be remember
// }

// }

// Q . find the first index and last index of target element in a sorted  array.
// This is totally logical so remember this logic.
// import java.util.*;  

// public class Practice {
// public static void main(String[] args) {
// int[] arr = { 5,8,8,8, 10 };
// int target = 8;
// int[][] result = rangeSearch(arr, target);
// for (int i = 0; i < result.length; i++) {
// System.out.println(Arrays.toString(result[i]));
// }
// }

// public static int[][] rangeSearch(int[] arr, int target) {

// int first = position(arr, target, true);
// int last = position(arr, target, false);

// return new int[][] { { first, last } };

// }

// public static int position(int[] arr, int target, boolean findIndex) {
// int left = 0;
// int right = arr.length - 1;

// int result = -1;

// while (left <= right) {
// int mid = left + (right - left) / 2;

// if (arr[mid] == target) {
// if (findIndex) {

// result = mid;
// right = mid - 1;
// }
// else{

// result = mid;
// left = mid + 1;
// }
// } else if (arr[mid] > target) {
// right = mid - 1;
// } else {
// left = mid + 1;
// }
// }

// return result;

// }

// }

// how to find the position of an element in an infinite sorted array.

// public class Practice {
// public static void main(String[] args){
// int[] arr = {5,7,7,8,8,10};
// int target = 10
// ;

// System.out.println(search(arr,target));

// }
// public static int search(int[] arr,int target){
// int left = 0 ;
// int right = 1;


// //point to be remember 

// while(target>arr[right]){
// int temp = right + 1;
// right = right + (right -left + 1)*2;
// left = temp;

// }

// return position(arr, target, left, right);
// }

// public static int position(int[] arr,int target,int left,int right){

// while(left<=right){
// int mid = left + (right-left)/2;

// if(arr[mid] == target){
// return mid ;
// }
// else if(arr[mid]>target){
// right = mid -1;
// }
// else{

// left = mid +1;
// }

// }

// return -1;
// }

// }

/*
 * Mountain Array/bitonic array : An array of numbers is considered a mountain
 * array if numbers increase up till one point, then decreases till the end.
 */

// Q . find the peak of the mountain array.

// public class Practice{
// public static void main(String[] args){
// int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
// System.out.println(peakValue(arr));
// }

// static int peakValue(int[] arr){
// int start = 0;
// int end = arr.length -1 ;
// while(start < end)    // points to be remember 
//{
// int mid = start + (end - start)/2;

// if(arr[mid] > arr[mid +1]){
// end = mid ;
// }

// else if(arr[mid]< arr[mid +1]){
// start = mid +1;
// }

// }
// return arr[start];
// }
// }

// Q. find the index of the element in the mountain array

// public class Practice {
// public static void main(String[] args) {
// int[] arr = { 1, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
// int target = 2;
// System.out.println(findValue(arr, target));
// }

// static int findValue(int[] arr, int target) {
// int start = 0;
// int end = arr.length - 1;
// while (start < end)    // point to be remember
//{
// int mid = start + (end - start) / 2;

// if (arr[mid] > arr[mid + 1]) {
// end = mid;
// if (arr[mid] == target) {
// return target;
// } else if (arr[mid] > target) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }

// }

// else {
// start = mid +1;
// if (arr[mid] == target) {
// return target;
// } else if (arr[mid] > target) {
// start = mid + 1;

// } else {
// end = mid - 1;
// }

// }
// }
// return -1;
// }
// }
