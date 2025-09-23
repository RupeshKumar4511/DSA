from array import * 
def maximum(arr):
    max = arr[0]
    for i in range(1,len(arr)):
        if(arr[i]>max):
            max = arr[i]
    return max

def counting_sort(arr):
    max = maximum(arr)
    freq = array('i',[0]*(max+1))
    for i in range(len(arr)):
        freq[arr[i]] += 1

    original_Index = 0
    for j in range (len(freq)):
        if(freq[j]>=0):
            for k in range(freq[j]):
                arr[original_Index] = j
                original_Index += 1


arr = array('i',[23,25,6,12,13])
counting_sort(arr)
print(arr)


