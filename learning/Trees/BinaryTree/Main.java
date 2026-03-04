package BinaryTree;
import java.util.Scanner ;


public class Main {

    static void main(String[] args) {



//      BinaryTree tree = new BinaryTree() ;
//      Scanner sc = new Scanner(System.in) ;
//      tree.populate(sc) ;


        BST tree = new BST() ;
        int[] arr = new int[]{5,2,7,1,7,3} ;
        tree.populate(arr);
        tree.display();

    }

}
