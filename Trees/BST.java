package Trees;

public class BST {
    
    public Node root;
    
    class Node{

        public int value ;
        public Node left;
        public Node right;
        public int height;


        public Node(int value){
           this.value = value;
        }

    }



    public void insert(int value){
        root = insert(value,root);

    }
    public Node insert(int value,Node node){
        if(node == null){
          node  = new Node(value);
          return node ;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+ 1;



        return node ; // this is why because if the left and right child of parent node exists then it returns the same node. It does not change in the existing node.
    }



    public int height(Node node){
        if(node == null){
            return -1;

        }
        return node.height;
    }




   public boolean balanced(){
       return balanced(root);
   }

    private boolean balanced(Node node){
        if(node == null ){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right))<= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        if(this.root == null){
            System.out.println("Tree is empty");
            return;
        }
        display(this.root,"Root node :");

    }
    public void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left,"Left Child of "+ node.value+ ": ");
        display(node.right,"Right Child of " + node.value +": ");
    }

 


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(12);
        bst.insert(11);
        bst.insert(19);
        bst.insert(40);
        bst.display();
        System.out.println(bst.balanced());
    }

}


