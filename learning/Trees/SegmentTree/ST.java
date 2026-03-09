package SegmentTree;

public class ST {

    private static class Node{

        int data ;
        int startInterval ;
        int endInterval ;
        Node left ;
        Node right ;

        public void Node(int startInterval, int endInterval){
            this.startInterval = startInterval ;
            this.endInterval = endInterval ;
        }

        public Node root ;
    }


    public ST(int[] arr){

        // Create a tree
//        this.root = constructTree(arr, 0, arr.length-1) ;
    }


    public void constructTree(int[] arr, int si, int ei){
//        return Node ;
    }
}
