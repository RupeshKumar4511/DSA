def bubble_sort(arr):
    for i in range(len(arr)):
        swap = False
        for j in range(len(arr)-i-1):
            if(arr[j]> arr[j+1]):
                arr[j],arr[j+1]= arr[j+1],arr[j]
                swap=True
        if(swap==False):
            break

from array import * 
arr = array('i',[23,25,6,12,13])
bubble_sort(arr)
print(arr)