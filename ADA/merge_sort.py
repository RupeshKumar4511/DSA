from array import *
def mergesort(arr,start,end):
    if(end-start == 1):
        return
    mid = (end+start)//2
    mergesort(arr,start,mid)
    mergesort(arr,mid, end)
    mergeInplace(arr,start,end,mid)


def mergeInplace(arr,start,end,mid):
    i = start
    j = mid 
    mixArr = []

    while(i<mid and j<end):
        if(arr[i]<=arr[j]):
            mixArr.append(arr[i])
            i+=1
        else:
            mixArr.append(arr[j])
            j+=1
        

    while(i<mid):
        mixArr.append(arr[i])
        i+=1
        
    while(j<end):
        mixArr.append(arr[j])
        j+=1

    for l in range(len(mixArr)):
        arr[start+l] = mixArr[l]


arr = array('i',[6,5,4,3,2,1])
mergesort(arr,0,len(arr))
print(arr)