def selection_sort(arr):
    for i in range(len(arr)):
        min_index=i
        for j in range(i+1,len(arr)):
            if(arr[min_index]> arr[j]):
                min_index = j
        arr[min_index],arr[i]= arr[i],arr[min_index]

from array import * 
arr = array('i',[23,25,6,12,13])
selection_sort(arr)
print(arr)