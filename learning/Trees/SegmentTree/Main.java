package SegmentTree;

public class Main {


    static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9} ;
        ST tree = new ST(arr) ;

//        tree.display() ;
//        System.out.println("");
//        tree.update(3, 4);
//        tree.display() ;


        int ans = tree.query(4, 5);
        System.out.println(ans);
    }
}
