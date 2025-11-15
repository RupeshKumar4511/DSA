# Matrix muliplication using traditional way
import numpy as np

arr1 = np.array([[1,2],[3,4]])
arr2 = np.array([[5,6],[7,8]])

result = np.array([[0, 0],[0, 0]])

for i in range(len(arr1)):
    for j in range(len(arr2[0])):
        for k in range(len(arr2)):
            result[i][j] += arr1[i][k] * arr2[k][j]


for row in result:
    print(row.tolist())



# matrix mulitiplication using strassen's method

def strassens_multi(A, B):
    n = len(A)

    if n == 1:
        return A * B

    mid = n // 2
    def split(matrix):
        return (
            matrix[:mid, :mid], matrix[:mid, mid:],
            matrix[mid:, :mid], matrix[mid:, mid:]
        )

    A11, A12, A21, A22 = split(A)
    B11, B12, B21, B22 = split(B)

    M1 = strassens_multi(A11 + A22, B11 + B22)
    M2 = strassens_multi(A21 + A22, B11)
    M3 = strassens_multi(A11, B12 - B22)
    M4 = strassens_multi(A22, B21 - B11)
    M5 = strassens_multi(A11 + A12, B22)
    M6 = strassens_multi(A21 - A11, B11 + B12)
    M7 = strassens_multi(A12 - A22, B21 + B22)

    C11 = M1 + M4 - M5 + M7
    C12 = M3 + M5
    C21 = M2 + M4
    C22 = M1 - M2 + M3 + M6

    top = np.hstack((C11, C12))
    bottom = np.hstack((C21, C22))
    return np.vstack((top, bottom))

A = np.array([[8, 7], [6, 5]])
B = np.array([[4, 3], [2, 1]])
print(strassens_multi(A, B))