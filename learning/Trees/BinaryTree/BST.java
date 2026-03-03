package BinaryTree;

public class BST {

  public static class Node{


      private int data ;
      private Node left ;
      private Node right ;
      private int height ;


      public Node(int data){
          this.data = data ;
      }

      public int getData() {
          return this.data;
      }

  }

  private Node root ;

  public BST(){

  }

  public int height(Node node){
      if(node == null){
          return -1 ;
      }

      return node.height ;
  }

  public boolean isEmpty(){
      return root == null;
  }


  public void insert(int val){
      root = insert(val , root) ;
  }

  private Node insert(int val, Node node){
      if(node == null){
          node = new Node(val) ;
          return node ;
      }

      if(node.data > val){
          node.left = insert(val, node.left);
      }
      if(node.data < val){
          node.right = insert(val, node.right);
      }

      node.height = Math.max(height(node.left), height(node.right)) + 1 ;
      return node ;
  }
}
