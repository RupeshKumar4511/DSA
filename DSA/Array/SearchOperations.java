package DSA.Array;

public class SearchOperations {

    static int index = -1;

    // For linerar search , Array can be sorted or not.
    // Time Complexity : O(n)
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                index = i;
            }
        }

        return index;
    }

   
    /* For BinarySearch Array must be sorted .
    For Binary Search :
    firstly we have to find the mid index and the check the element at this index is equal/greater/smaller than target,
    If it is equal then return index and if it is greater then left (where left is variable that indicates the starting point)
    becomes mid(where mid of the array)-1 and if it is smaller then right (where right is a variable that upto which ckecking the target is done)
    becomes mid - 1;

    Time complexity : log(n)
    */
    public static int BinarySearch(int[] arr1, int target) {
        int mid =0;
        int left = 0;
        int right = arr1.length - 1;
        
        while (left <= right) {

            mid = (left + right)/ 2;
            
            if(arr1[mid] == target){
                return mid;
            }

            else if (arr1[mid] > target) {
                right = mid - 1;
                
            }

            else {
                left = mid+1;
            }

        }
        return -1;

        

    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 4, 2, 1, 7 };
        int target = 7;
        int result1 = LinearSearch(arr, target);
        System.out.println(result1);

        target = 2;
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int result2 = BinarySearch(arr1, target);
        System.out.println(result2);
    }

    
}
