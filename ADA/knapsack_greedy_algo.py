def fractional_knapsack(weights, values, capacity):
    n = len(weights)

    # Calculate value/weight ratio for each item
    ratio = []
    for i in range(n):
        ratio.append((values[i] / weights[i], weights[i], values[i]))

    # Sort items by ratio in descending order
    ratio.sort(reverse=True)

    total_value = 0.0
    items_taken = []

    for r, w, v in ratio:
        if capacity == 0:
            break

        if w <= capacity:
            # Take the whole item
            total_value += v
            capacity -= w
            items_taken.append((w, v, 1.0))   # 1.0 means full item
        else:
            # Take fraction of item
            fraction = capacity / w
            total_value += v * fraction
            items_taken.append((w, v, fraction))
            capacity = 0

    return total_value, items_taken



weights = [10, 20, 30]
values =  [60, 100, 120]
capacity = 50

max_value, taken = fractional_knapsack(weights, values, capacity)

print("Maximum value in knapsack =", max_value)
print("Items taken (weight, value, fraction):")
for item in taken:
    print(item)
