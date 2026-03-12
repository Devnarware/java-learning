package BinaryTree;


public class BFS {


    static void main(String[] args) {


        BST tree = new BST() ;


        int[] arr = {5,4,2,7,9,8,1} ;
        tree.populate(arr);
        tree.printBFS();
    }


}
