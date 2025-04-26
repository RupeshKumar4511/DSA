package Trees;

public class AVL {

    class Node {
        public Node left ;
        public Node right ;
        public int value;
        public int  height;

        public Node(int value){
            this.value = value;
        }

    }

    public Node root ;


    public void insert(int value){
        if(this.root == null){
            this.root = new Node(value);
            return;
        }
        this.root = insert(this.root,value);
        
    }

    public Node insert(Node node , int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left =  insert(node.left,value);
        }else if(value > node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left),height(node.right))+ 1;


        return rotate(node);
    }

    public Node rotate(Node node) {
        if(height(node.left)-height(node.right)>1){
            //left heavy
        
            if(height(node.left.left)- height(node.left.right) > 0){
                //left-left heavy

                return rightRotate(node);
            }
            if(height(node.left.left)- height(node.left.right) < 0){
                //left-right heavy

                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }


        if(height(node.left)-height(node.right)<-1){
            //right heavy
        
            if(height(node.right.left)- height(node.right.right) < 0){
                //right-right heavy

                return leftRotate(node);
            }
            if(height(node.right.left)- height(node.right.right) > 0){
                //right-left heavy

                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.right;

        c.right = t;
        p.left = c;
        
        p.height =  Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return p;

    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height =  Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;

        return c;
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }



    public void display(){
        if(this.root == null){
            System.out.println("BST has no node. ");
        }
        display(this.root,"Root Node is ");
    }
    public void display(Node node , String details){
        if(node == null){
           return;
        }
        
        System.out.println(details+node.value);
        display(node.left,"Left Node is : ");
        display(node.right,"Right Node is : ");
    }


    public Node Search(int value){
        
        return Search(this.root,value);
    }

    public Node  Search(Node node, int value) {
        if(node == null){
            return null;
        }
        if(node.value == value){
            System.out.println(node.value);
            return node;
        }
        else if ( value < node.value){
           return Search(node.left,value);
        }else if(value > node.value){
           return Search(node.right,value);
        }

        return null;
    }

    public boolean balanced(){
        
        return balanced(this.root);
    }

    public boolean balanced(Node node){
        if(node  == null ){
            return true;
        }
        
        return Math.abs(height(node.left)-height(node.right))<= 1 && balanced(node.left) && balanced(node.right);
    }


    public static void main(String[] args) {
        AVL a = new AVL();
        a.insert(2);
        a.insert(1);
        a.insert(5);
        a.insert(4);
        // a.insert(6);
        a.display();
        System.out.println(a.Search(4));
        System.out.println(a.balanced());
    }
}
