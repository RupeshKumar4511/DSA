# Way of Representing graph
def adjacency_matrix(vertices, edges):
    # Create an n x n matrix initialized with 0
    matrix = [[0] * vertices for i in range(vertices)]

    for (u, v) in edges:
        matrix[u][v] = 1  # Set edge
        # For undirected graphs, also set matrix[v][u] = 1

    return matrix


vertices = 4
edges = [(0, 1), (0, 2), (1, 2), (2, 0), (2, 3)]

adj_matrix = adjacency_matrix(vertices, edges)

print("Adjacency Matrix:")
for row in adj_matrix:
    print(row)
