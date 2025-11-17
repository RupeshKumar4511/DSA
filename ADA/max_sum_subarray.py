from array import *

def max_sum_subarray(arr, k):
    i = 0
    sum = 0
    maxlen = 0
    start = 0
    end = 0

    for j in range(len(arr)):
        sum += arr[j]

        while sum > k:
            sum -= arr[i]
            i += 1

        if sum == k:
            if j - i + 1 > maxlen:
                maxlen = j - i + 1
                start = i
                end = j

    print("Max length:", maxlen)
    print("Start index:", start)
    print("End index:", end)
    print("Max_Sum_subarray ", arr[start:end+1])


arr = array('i',[1,2,3,4,5,6,7,8,9,10])
max_sum_subarray(arr,15)