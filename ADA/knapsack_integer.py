def knapsack (n,w, weight,cost):
    #base case : 
    if(n == 0):
        if(weight[0]<=w):
            return cost[0]
        else:
            return 0
    
    # recursive case 
    nottake =  0 + knapsack(n-1,w,weight,cost)
    take = 0 
    if(weight[n]<=w):
        take = cost[n] + knapsack(n-1,w-weight[n],weight,cost)
    return max(take,nottake)


def knapsack_tabulation(n,w,weight,cost):
    dp = [[0] * n for i in range(w)]

    # base case
    for i in range(weight[0],w):
        dp[0][i] = cost[0]
    # recursive case
    for j in range(0,n-1):
        for k in range(0,w):
            not_take = 0 + dp[n+1][k]
            take = 0 
            if(weight[n]<=w):
                take = cost[n] + dp[n-1][w-weight[n]]
            dp[n][k] = max(take,not_take)
    return dp[n-1][w]

maximum_weight =  6 
weight = [3,2,5]
cost = [30,40,60]
n = 2 # 0,1,2
# profit = knapsack(n,maximum_weight,weight,cost)
profit = knapsack(n,maximum_weight,weight,cost)
print("maximum profit : ", profit)