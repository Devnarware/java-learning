package SegmentTree;

import BinaryTree.BinaryTree;

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
        this.root = construct(arr, 0, arr.length-1) ;
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

    public void update(int index, int val){
        this.root.data = update(root, index, val);
    }
    private int update(Node node, int index, int val){

        if(index >= node.startInterval && index <= node.endInterval){
            if (index == node.startInterval && index == node.endInterval){
                node.data = val ;
                return node.data ;
            }else{

                int leftData = update(node.left, index, val) ;
                int rightData = update(node.right, index, val) ;
                node.data = leftData + rightData ;
            }
        }
        return node.data ;

    }

    public void display(){
        display(this.root, "") ;
    }
    private void display(Node node, String indent){
        if (node == null){
//            System.out.println("tree is empty");
            return ;
        }
        System.out.print(indent + node.data);
        display(node.left , " ") ;
        display(node.right , " ") ;
    }

}