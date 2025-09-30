from array import * 
def quicksort(arr,low,high):
    start = low
    end = high
    pivot = (start+end)//2

    if(low>=high):
        return
        
    while(start<=end):
        while(arr[start]<arr[pivot]):
            start+=1
        
        while(arr[end]>arr[pivot]):
            end-=1
        
        if(start<=end):
            arr[start],arr[end]=arr[end],arr[start]
            start+=1
            end-=1
        
    quicksort(arr,low, end)
    quicksort(arr,start,high)

arr = array('i',[34,23,12,11,10])
quicksort(arr,0,(len(arr)-1))
print(arr)