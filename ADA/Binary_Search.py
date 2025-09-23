def binary_search(arr,target):
    left = 0
    right = len(arr)-1
    while(left<=right):
        mid = left + (right-left)//2
        if(arr[mid]==target):
            return mid
        elif (arr[mid]>target):
            right = mid -1
        elif (arr[mid]<target):
            left = mid+1
    return -1

from array import *
arr = array('i',[12,13,15,17,34,45])
target = 17
result = binary_search(arr,target)
print(result)