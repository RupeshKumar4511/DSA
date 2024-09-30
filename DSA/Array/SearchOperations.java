//package DSA.Array;

public class SearchOperations {

    static int index = -1;

    // For linerar search , Array can be sorted or not.
    // In the worst case, Time Complexity : O(n)
    // In the best case, Time Complexity : O(1) i.e elements fount at zeroth index.
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                index = i;
            }
        }

        return index;
    }

    /*
     * For BinarySearch Array must be sorted .
     * In Binary Search :
     * firstly we have to find the mid index and the check the element at this index
     * is equal/greater/smaller than target,
     * If it is equal then return index and if it is greater then left (where left
     * is variable that indicates the starting point)
     * becomes mid(where mid of the array)-1 and if it is smaller then right (where
     * right is a variable that upto which ckecking the target is done)
     * becomes mid - 1;
     * 
     * In the best case , its time complexity is O(1) i.e elements found at the mid
     * index;
     * In the Worst case , its Time complexity : log(n) base2
     */
    public static int binarySearch(int[] arr1, int target) {
        int mid =0;
        int left = 0;
        int right = arr1.length - 1;
        boolean isAsc = arr1[left]<= arr1[right];
        
        while (left <= right) {


            // mid = (left + right ) /2  this may gives an error when left and right value exceeds the int limit;
            mid = left + (right-left)/ 2;
            
            if(arr1[mid] == target){
                return mid;
            }

            else if(isAsc){
                if (arr1[mid] > target) {
                right = mid - 1;
                
                }
                else {
                    left = mid+1;
                }
            }
            else{
                if (arr1[mid] < target) {
                    right = mid - 1;
                    
                    }
                    else {
                        left = mid+1;
                    }
            }

        }
        return -1;

        

    }

    // This is Linear search for 2d array

    static int[] linearSearch2d(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {

                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 4, 2, 1, 7 };
        int target = 7;
        int result1 = linearSearch(arr, target);
        System.out.println(result1);

        target = 2;
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int result2 = binarySearch(arr1, target);
        System.out.println(result2);
    }

}
