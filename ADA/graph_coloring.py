# Graph coloring : 
# Graph coloring is the process of assigning colors to vertices of a graph such that:

# No two adjacent vertices (vertices connected by an edge) have the same color.

# The goal is usually to use the minimum number of colors possible — this minimum number is called the chromatic number of the graph.


def greedy_graph_coloring(adj_list):
    n = len(adj_list)
    result = [-1] * n  # -1 means no color assigned yet

    # Assign first color to first vertex
    result[0] = 0

    # Temporary array to store used colors for neighbors
    available = [False] * n

    # Assign colors to remaining vertices
    for u in range(1, n):
        # Mark colors used by adjacent vertices
        for neighbor in adj_list[u]:
            if result[neighbor] != -1:
                available[result[neighbor]] = True

        # Find first available color
        color = 0
        while color < n and available[color]:
            color += 1

        result[u] = color  # Assign color

        # Reset available for next vertex
        for neighbor in adj_list[u]:
            if result[neighbor] != -1:
                available[result[neighbor]] = False

    return result



adj_list = {
    0: [1, 2],
    1: [0, 2, 3],
    2: [0, 1, 3],
    3: [1, 2]
}

coloring = greedy_graph_coloring(adj_list)
print("Vertex Colors:", coloring)


