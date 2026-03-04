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

  public boolean balanced(){
       return balanced(root) ;
  }

  private boolean balanced(Node node){
      if(node == null){
          return true ;
      }
      return ( Math.abs(height(node.left) - height(node.right)) <= 1 ) && (balanced(node.left)) && balanced(node.right) ;
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

  public void populate(int[] arr){
//      for (int i = 0; i < arr.length; i++) {
//          this.insert(arr[i]);
//      }

      for(int i : arr){
          this.insert(i);
      }
  }

  public void populateSorted(int[] arr){
      populateSorted(arr, 0, arr.length);
  }
  private void populateSorted(int[] arr, int si, int ei){

      if(si >= ei){
          return ;
      }

      int mid = si + (ei-si)/2 ;
      this.insert(arr[mid]);
      populateSorted(arr, si, mid);
      populateSorted(arr, mid+1, ei);

  }

  public void display(){
      display(root, "Root node is: ");
  }
  private void display(Node node, String details){
      if(node == null){
          return ;
      }
      System.out.println(details + node.data);
      display(node.left, "Left node of " + node.data + " is: ");
      display(node.right, "Right node of " + node.data + " is: ");
  }
}
