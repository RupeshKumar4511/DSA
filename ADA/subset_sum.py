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


def subset_sum_tabulation(arr, target):
    n = len(arr)
    dp = [[False] * (target + 1) for _ in range(n)]

    # sum 0 (when picking nothing)
    for i in range(n):
        dp[i][0] = True

    # First element initialization
    if arr[0] <= target:
        dp[0][arr[0]] = True

    # Fill the table
    for i in range(1, n):
        for k in range(1, target + 1):
            not_take = dp[i - 1][k]
            take = False        
            if k >= arr[i]:
                take = dp[i - 1][k - arr[i]]
            dp[i][k] = take or not_take

    return dp[n-1][target]

            
    
arr = [1,2,3,4,5]
ind = len(arr)-1
target = 7 
result = subset_sum(ind , target,arr)
result = subset_sum_tabulation (arr,target)
print(result)