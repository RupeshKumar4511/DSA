from array import * 
def maximum(arr):
    max = arr[0]
    for i in range(1,len(arr)):
        if(arr[i]>max):
            max = arr[i]
    return max

def count_sort(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10

    # increment the freq of each digit
    for i in range(n):
        count[(arr[i] // exp) % 10] += 1

    # Cumulative count : It helps to know last correct index upto which the no starts with 
    # a particular index should be placed.
    for j in range(1, 10):
        count[j] += count[j - 1]

    print(f"Updated count Array for {exp} = {count}")

    # Build output array (right-to-left to maintain stability)
    # It actually place the elements at correct index in sorted order digit by digit
    for k in range(n - 1, -1, -1):
        digit = (arr[k] // exp) % 10
        output[count[digit] - 1] = arr[k]
        count[digit] -= 1

    print(f"Sorted Output array for {exp} = {output}")

    # Copy back to arr
    for i in range(n):
        arr[i] = output[i]


def radix_sort(arr):
    max_val = maximum(arr)
    exp = 1
    while (max_val // exp) > 0:
        count_sort(arr, exp)
        exp *= 10


arr = array('i',[23,25,6,12,13])
radix_sort(arr)
print(arr)


