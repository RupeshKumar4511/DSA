def prim(graph, start):
    visited = set([start])
    mst = []
    
    while len(visited) < len(graph):
        min_edge = None
        min_cost = float('inf')

        # Search all edges from visited -> unvisited
        for node in visited:
            for neighbor, cost in graph[node]:
                if neighbor not in visited and cost < min_cost:
                    min_cost = cost
                    min_edge = (node, neighbor, cost)

        # Add the best (cheapest) edge
        if min_edge:
            frm, to, cost = min_edge
            mst.append(min_edge)
            visited.add(to)

    return mst



graph = {
    'A': [('B', 4), ('C', 3)],
    'B': [('A', 4), ('C', 2), ('D', 5)],
    'C': [('A', 3), ('B', 2), ('D', 7)],
    'D': [('B', 5), ('C', 7)]
}

result = prim(graph, 'A')

print("Minimum Spanning Tree:")
for edge in result:
    print(edge)
