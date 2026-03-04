package BinaryTree;
import java.util.Scanner ;

public class BinaryTree {

    private class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
        }
    }

    private Node root ;

    //  to inset the element

    public void populate(Scanner sc){

        System.out.print("Enter the root node: ");
        int val = sc.nextInt() ;
        root = new Node(val) ;
        populate(sc , root) ;
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter the next element to the left side of " + node.data);
        boolean left = sc.nextBoolean() ;
        if (left){
            System.out.print("Enter the value: ");
            int data = sc.nextInt() ;
            node.left = new Node(data) ;
            populate(sc, node.left);
        }


        System.out.println("Do you want to enter the next element to the right side of " + node.data);
        boolean right = sc.nextBoolean() ;
        if (right){
            System.out.print("Enter the value: ");
            int data = sc.nextInt() ;
            node.right = new Node(data) ;
            populate(sc, node.right);
        }

    }

    public void display(){
        display(this.root, "") ;
    }
    private void display(Node node, String indent){
        if (node == null){
//            System.out.println("tree is empty");
            return ;
        }
        System.out.println(indent + node.data);
        display(node.left , "") ;
        display(node.right , "") ;
    }
}
