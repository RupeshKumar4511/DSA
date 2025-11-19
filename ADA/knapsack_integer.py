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


maximum_weight =  6 
weight = [3,2,5]
cost = [30,40,60]
n = 2 # 0,1,2
profit = knapsack(n,maximum_weight,weight,cost)
print("maximum profit : ", profit)