package Trees;

import java.util.Scanner;

public class BinaryTree {
    
    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int value){
            this.value = value;
        }
    }

    public Node root;

    public void populate(Scanner scanner){

        System.out.println("Enter the root element : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);

        }


    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to add element to the left of " + node.value) ;
        System.out.println("Enter true or false ");
        boolean left = scanner.nextBoolean();
        if(left){
           System.out.println("Enter the element ");
           int value = scanner.nextInt();
           node.left = new Node(value);
           populate(scanner, node.left);
        }
        System.out.println("Do you want to add element to the right of " + node.value) ;
        System.out.println("Enter true or false ");
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("Enter the element ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }


    }
       
    public void display(){
        display(root,0);
    }

    public void display(Node node ,int level){
        if(node == null){
            return;
        }
        display(node.right,level + 1);
        if(level != 0){
           for(int i =0 ;i<level -1 ;i++){
            System.out.print("|\t");
           }
           System.out.println("|------>"+ node.value);

        }else{
           System.out.println(node.value);
        }
        display(node.left , level +1 );
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        bt.populate(scanner);
        bt.display();
    }
            
}

