def sort_edges(edges):
    for i in range(len(edges)):
        for j in range(len(edges)-i-1):
            if(edges[j][2] > edges[j+1][2]):
                edges[j], edges[j+1] = edges[j+1], edges[j]



# Disjoint Set (Union-Find)

class DisjointSet:
    def __init__(self, n):
        self.parent = [i for i in range(n)]
        self.rank = [0] * n

    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]

    def union(self, x, y):
        rootX = self.find(x)
        rootY = self.find(y)

        if rootX != rootY:
            if self.rank[rootX] < self.rank[rootY]:
                self.parent[rootX] = rootY
            elif self.rank[rootX] > self.rank[rootY]:
                self.parent[rootY] = rootX
            else:
                self.parent[rootY] = rootX
                self.rank[rootX] += 1
            return True  # union successful → no cycle
        return False       # union failed → cycle detected


def kruskals_algo(vertices, edges):
    # Step 1: sort edges using your bubble sort
    sort_edges(edges)

    ds = DisjointSet(vertices)
    mst = []

    for u, v, w in edges:
        # If adding the edge does not create a cycle
        if ds.union(u, v):
            mst.append([u, v, w])

        # Stop when MST has (V-1) edges
        if len(mst) == vertices - 1:
            break

    return mst



edges = [[0, 1, 10], [1, 3, 15], [2, 3, 4], [2, 0, 6], [0, 3, 5]]
vertices = 4

mst = kruskals_algo(vertices, edges)

print("MST edges:")
for row in mst:
    print(row)
