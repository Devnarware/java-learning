package AVLTree;

public class AVL {

    public class Node{


        private int data ;
        private Node left ;
        private Node right ;
        int height ;



        public Node(int data){
            this.data = data ;
            this.height = 0 ;
        }
    }

    public AVL(){

    }
    private Node root ;


    public int height(){
        return height(root) ;
    }

    private int height(Node node){
        if(node == null){
            return -1 ;
        }
        return node.height ;
    }

    public void insert(int val){
        root = insert(val, root) ;
    }
    private Node insert(int val, Node node){
        if(node == null){
            node = new Node(val) ;
        }

        if(val > node.data){
            node.right = insert(val, node.right);
        }

        if(val < node.data){
            node.left = insert(val, node.left) ;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1 ;
        return rotate(node) ;
    }

    private Node rotate(Node node){
        // if the tree is unbalanced form the left side of the tree
        if((height(node.left) - height(node.right)) > 1 ){

            // for the case Left-Left
            if(height(node.left.left) - height(node.left.right) > 0){
                return rotateRight(node) ;
            }

            // Left-Right case
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = rotateLeft(node) ;
                return rotateRight(node) ;
            }
        }

        // if the tree is unbalanced from the right side of the tree
        if (height(node.left) - height(node.right) < -1){


            // Right-Right
            if(height(node.right.left) - height(node.right.right) < 0){
                return rotateLeft(node) ;
            }

            // Right-Left case
            if (height(node.right.left) - height(node.right.right) > 0){
                node.right = rotateRight(node) ;
                return  rotateLeft(node) ;
            }
        }

        return node ;
    }

    private Node rotateRight(Node node){
        Node leftNode = node.left ;
        Node rightNode = leftNode.right ;


        leftNode.right = node ;
        node.left = rightNode ;

        leftNode.height = Math.max(height(leftNode.left), height(leftNode.right) ) + 1;
        node.height = Math.max(height(node.left), height(node.right)) +1 ;

        return leftNode ;
    }

    private Node rotateLeft(Node node){

        Node rightNode = node.right ;
        Node leftNode = rightNode.left ;


        rightNode.left = node ;
        node.right = leftNode ;


        rightNode.height = Math.max(height(rightNode.left), height(rightNode.right)) + 1 ;
        node.height = Math.max(height(node.left), height(node.right)) + 1 ;

        return rightNode ;

    }
}
