# Topological Sorting Using DFS: 
graph = {
    5:[2,0],
    4:[0,1],
    2:[3],
    3:[1],
    1:[],
    0:[]
}

visited = set()
stack= []

def dfs(node):
    if node in visited : 
        return 
    visited.add(node)
    for neighbour in graph[node]:
        dfs(neighbour)
    stack.append(node)


for node in graph : 
    dfs(node)


print("Topological order : ",stack[::-1])
