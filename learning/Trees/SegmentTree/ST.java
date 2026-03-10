package SegmentTree;

public class ST {

    private class Node{

        int data ;
        int startInterval ;
        int endInterval ;
        Node left ;
        Node right ;


        public Node(int startInterval, int endInterval){

            this.startInterval = startInterval ;
            this.endInterval = endInterval ;

        }

    }

    Node root ;

    public ST(int[] arr){
        this.root = construct(arr, 0, arr.length) ;
    }

    private Node construct(int[] arr, int start, int end) {

        if (start == end){
            Node node = new Node(start, end) ;
            node.data = arr[start] ;
            return node ;

        }

        Node node = new Node(start, end) ;
        int mid = start + (end - start) / 2 ;

        node.left = construct(arr, start, mid) ;
        node.right = construct(arr, mid+1, end) ;

        node.data = node.left.data + node.right.data ;

        return node ;
    }

    public int query(int si, int ei){
        return query(this.root, si, ei) ;
    }

    private int query(Node node, int qsi, int qei){
    
        // node range is within the given range
        if(node.startInterval >= qsi && node.endInterval <= qei){
            return node.data ;
        } else if (node.startInterval > qei || node.endInterval < qsi) {

            // out of the range
            return 0 ;
        }else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei) ;
        }

    }

}