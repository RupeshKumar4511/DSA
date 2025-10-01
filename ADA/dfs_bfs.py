def bfs(graph, start):
    visited = set()
    queue = [start]
    traversal = []

    while queue:
        node = queue.pop(0)
        if node not in visited:
            visited.add(node)
            traversal.append(node)
        for neighbor in graph[node]:
            if neighbor not in visited:
                queue.append(neighbor)
    return traversal



def dfs(graph, start):
    visited = set()
    stack = [start]
    traversal = []

    while stack:
        node = stack[-1]
        if node not in visited:
            visited.add(node)
            traversal.append(node)
        for neighbor in graph[node]:
            if neighbor not in visited:
                    stack.append(neighbor)
                    break
        # every node is visited : case of backtracking
        else:
                stack.pop()
    return traversal



graph = {
    0: [1, 2],
    1: [0, 3, 4],
    2: [0, 5],
    3: [1],
    4: [1, 5],
    5: [2, 4]
}

print("BFS Traversal", bfs(graph, 0))
print("DFS Traversal", dfs(graph, 0))
