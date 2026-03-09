package SegmentTree;

public class ST {

    private static class Node {

        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    Node root;


    public ST(int[] arr) {

        // Create a tree
        this.root = constructTree(arr, 0, arr.length-1) ;
    }


    public Node constructTree(int[] arr, int start, int end) {

        if(start == end){
            Node node = new Node(start, end) ;
            node.data = arr[start] ;
            return node ;
        }

        Node node = new Node(start, end) ;

        int mid = start + (end-start) / 2 ;

        node.left = constructTree(arr, start, mid) ;
        node.right = constructTree(arr, mid+1, end) ;

        node.data = node.left.data + node.right.data ;

        return node ;
    }
}
