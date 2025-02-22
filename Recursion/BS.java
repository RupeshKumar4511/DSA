package Recursion;

public class BS {

    public int search(int[] arr, int start , int end,int target){
      int mid = start + (end - start)/2;
  
      if(start>end){
        return -1;
      }
  
      if(arr[mid]== target){
        return mid;
      }
      else if(arr[mid] < target){
        return search(arr, mid+1, end, target);
      }
      return search(arr, start, mid-1, target);
  
    }
  
    public static void main(String[] args) {
      BS p = new BS();
      int[] arr = {2,3,4,5,6,8,9};
      System.out.println(p.search(arr, 0, arr.length-1, 19));
  
    }
  }
