def linear_search(arr,target):
    for i in range(len(arr)):
        if(arr[i]== target):
            print(i)
            break
from array import * ;
arr = array('i',[23,25,6,12,13])
target = 6 
linear_search(arr,target)
