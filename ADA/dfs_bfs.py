from collections import deque
class Node:

    def __init__(self,data,left = None,right = None):
        self.data = data
        self.left = left 
        self.right = right


class BinarySearchTree:
    
    def __init__(self):
        self.root = None


    def insert(self,data):
        self.root = self.insert_recursive(data,self.root)

    def insert_recursive(self,data,node):
        if(node == None):
            node = Node(data)
            return node 
        
        elif(data < node.data):
            node.left = self.insert_recursive(data,node.left)

        elif(data > node.data):
            node.right = self.insert_recursive(data,node.right)

        elif(data == node.data):
            print("duplicate value found")
            
        
        return node
    

    def display(self):
        if(self.root == None):
           print("Tree is empty")
           return
        self.display_recursive(self.root,"Root Node :")



    def display_recursive(self,node,details):
        if(node == None):
           return
        
        print(details, node.data)
        

        self.display_recursive(node.left,f"Left Child Node of  {node.data} :")
        self.display_recursive(node.right,f"Right Child Node of {node.data} :")


    def display_inorder(self):
        if(self.root == None):
            print("Tree is empty")
            return
        self.display_inorder_recursive(self.root)

    def display_inorder_recursive(self,node):
        if(node == None):
           return
        

        self.display_inorder_recursive(node.left)
        print(node.data,end = " ")
        self.display_inorder_recursive(node.right)

    
    def display_preorder(self):
        if(self.root == None):
            print("Tree is empty")
            return
        self.display_preorder_recursive(self.root)

    def display_preorder_recursive(self,node):
        if(node == None):
           return
        
        print(node.data,end = " ")
        self.display_preorder_recursive(node.left)
        
        self.display_preorder_recursive(node.right)

    def display_postorder(self):
        if(self.root == None):
            print("Tree is empty")
            return
        self.display_postorder_recursive(self.root)

    def display_postorder_recursive(self,node):
        if(node == None):
           return
        
        
        self.display_postorder_recursive(node.left)
        self.display_postorder_recursive(node.right)
        print(node.data,end = " ")




    def search(self,data):
        if(self.root == None):
            print("Tree is empty")
            return
        return self.search_recursive(self.root,data)
    def search_recursive(self,node,data):
            if(data == node.data):
               return node
            elif(data > node.data):
                return self.search_recursive(node.right,data)
            
            elif(data < node.data):
                return self.search_recursive(node.left,data)

            else:
                return None
            
    def deleteNode(self,data):
        if(self.root == None):
            print("Tree is empty")
            return
        
        self.root = self.deleteNode_recursive(self.root,data)

    def deleteNode_recursive(self,root ,data):
        if(root == None):
            return root
        elif(data > root.data):
            root.right = self.deleteNode_recursive(root.right,data)

        elif(data < root.data):
            root.left = self.deleteNode_recursive(root.left,data)
        else:
            if(root.left == None):
                return root.right
            elif(root.right == None):
                return root.left
            
            else:
                root.data = self.min_value(root.right)
                root.right = self.deleteNode_recursive(root.right,root.data)
        
        return root
            
    def min_value(self,root):
        minv = root.data
        while(root.left != None):
            minv = root.left.data
            root = root.left


        return minv



    def iterative_inorder(self):
        node = self.root
        stack = []
        while(True):
            if(node != None):
                stack.append(node)
                node = node.left
            else:
                if(len(stack) == 0):
                    break
                node = stack.pop()
                print(node.data)
                node = node.right


    def iterative_preorder(self):  
        node = self.root
        stack = [] 
        stack.append(node)
        while(len(stack)!= 0):
            node = stack.pop()
            print(node.data,end= " ")
            if(node.right != None):
                stack.append(node.right)
            if(node.left != None):
                stack.append(node.left)


    
    def iterative_postorder(self):
        node = self.root
        stack = [] 
        while(len(stack) != 0 or node != None ):
            if(node != None):
                stack.append(node)
                node = node.left
            else:
                temp = stack[-1].right
                if(temp == None):
                   temp = stack.pop()
                   print(temp.data)
                   while(len(stack) != 0 and temp == stack[-1].right):
                    temp = stack.pop()
                    print(temp.data)
                else:
                    node = temp

    def bfs(self):
        self.bfs_traversal(self.root)

        
    def bfs_traversal(self,root):
        if root is None:
            return

        queue = deque()
        queue.append(root)

        while queue:
            current = queue.popleft()
            print(current.data, end=" ")

            if current.left:
                queue.append(current.left)
            if current.right:
                queue.append(current.right)
    



bst = BinarySearchTree()
bst.insert(23)
bst.insert(13)
bst.insert(56)
bst.insert(12)
bst.insert(89)

print("In order : ")
bst.display_inorder()
print()
print("Post order :")
bst.display_postorder()
print()
print("Pre order :")
bst.display_preorder()
print()
print(bst.search(56))
print()
bst.deleteNode(23)
bst.display_inorder()
print()
bst.bfs()




# bst.display()
# bst.display_inorder()
# bst.iterative_inorder()
# bst.display_preorder()
# bst.iterative_preorder()
# bst.iterative_postorder()


