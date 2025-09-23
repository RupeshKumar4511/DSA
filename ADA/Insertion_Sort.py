def insertion_sort(arr):
    for i in range(len(arr)-1):
        for j in range(i+1,0,-1):
            if(arr[j-1]> arr[j]):
                arr[j-1],arr[j]= arr[j],arr[j-1]
            else:
                break

from array import * 
arr = array('i',[23,25,6,12,13])
insertion_sort(arr)
print(arr)