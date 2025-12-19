class Heap:
    def __init__(self):
        self.heap = []

    def parent(self, i):
        return (i - 1) // 2

    def left(self, i):
        return 2 * i + 1

    def right(self, i):
        return 2 * i + 2

    def swap(self, i, j):
        self.heap[i], self.heap[j] = self.heap[j], self.heap[i]

    def insert(self, value):
        self.heap.append(value)
        self.upheap(len(self.heap) - 1)

    def upheap(self, index):
        if index == 0:
            return
        p = self.parent(index)
        if self.heap[index] < self.heap[p]:
            self.swap(index, p)
            self.upheap(p)


    def remove(self):
        if not self.heap:
            raise Exception("Removing from an empty heap!")

        root = self.heap[0]
        last = self.heap.pop()

        if self.heap:
            self.heap[0] = last
            self.downheap(i=0)

        return root

    def downheap(self, i):
        min = i
        l = self.left(i)
        r = self.right(i)

        # Here we check (l < len(self.heap)) because it can out of index 
        # due to formula used : (l = 2*i + 1)
        if l < len(self.heap) and self.heap[l] < self.heap[min]:
            min = l
        if r < len(self.heap) and self.heap[r] < self.heap[min]:
            min = r

        if min != i:
            self.swap(i, j=min)
            self.downheap(min) 

    def heap_sort(self):
        result = []
        temp = self.heap[:]
        while self.heap:
            result.append(self.remove())
        self.heap = temp  # Restore heap after sorting
        return result


heap= Heap()
heap.insert(10)
heap.insert(9)
heap.insert(3)
heap.insert(7)
heap.insert(4)
heap.insert(8)
heap.insert(4)
print(heap.heap_sort())