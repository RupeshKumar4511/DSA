def subset_sum(ind,target,arr):
    if(target==0):
        return True
    if(ind == 0):
        return arr[0]==target
    not_take = subset_sum(ind-1,target,arr)
    take = False 
    if(target>=arr[ind]):
        take = subset_sum(ind-1,target-arr[ind],arr)

    return (take or not_take)


arr = [1,2,3,4,5]
ind = len(arr)-1
target = 7 
result = subset_sum(ind , target,arr)
print(result)