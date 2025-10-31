package LinkedList;

import java.security.PublicKey;

public class LinkedList {

    public static class Node{
        int data ;
        Node next ;
        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }

    //VARIABLE USED IN THE LINKEDLIST
    public static int size ;
    public static Node head ;
    public static Node tail ;


    //FOR ADDING AN ELEMENT AT LINKEDLIST
    public void addFirst(int data){
        //CREATE A NEW NODE
        Node newNode = new Node(data) ;
        size++ ;
        //IF IT IS THE FIRST NODE OF THE LIST
        if (head == null){
            head = tail = newNode ;
            return ;
        }

        //NOW THE NEXT OF THS NODE WILL START POINTING TOWARDS THE PREVIOUS HEAD
        newNode.next = head ;

        //HEAD SHOULD START PONITING TOWARDS THIS NODE
        head = newNode ;
    }
    public void addLast(int data) {
        //CREATE A NEW NODE
        Node newNode = new Node(data);
        size++;
        //IF IT IS THE FIRST NODE OF THE LIST
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //MAKE THE PREVIOUS TAIL'S NEXT START POINTING TO THE NEW NODE
        tail.next = newNode;

        //NOW THE TAIL SHOULD START POINTING THE LAST NODE
        tail = newNode;
    }
    public void add(int idx , int data){
        if(idx == 0 || head == null) {
            System.out.println("Either the idx is 0 or the List is empty so adding the element at first");
            addFirst(data) ;
            return ;
        }
        Node newNode = new Node(data) ;
        size++ ;
        int i = 0 ;
        Node temp = head  ;
        while(i<idx-1){
            temp = temp.next ;
            i++ ;
        }
        newNode.next = temp.next ;
        temp.next = newNode ;

    }


    //REMOE THE NODE FROM THE LINKEDLIST
    public static int removeFirst(){
        if (head == null){
            System.out.println("Empty LinkedList") ;
            return Integer.MIN_VALUE ;
        } else if (size == 1) {
            int val = head.data ;
            head = tail = null ;
            size-- ;
            return val ;
        }
        int val = head.data ;
        head = head.next ;
        size-- ;
        return val ;
    }
    public static int removelast(){
        if (size == 0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE ;
        }
        else if (size == 1){
            int val = head.data ;
            head = tail = null ;
            size-- ;
            return val ;
        }
        int val = tail.data ;
        Node prev = head ;
        for(int i = 0 ; i<size-2 ; i++){
            prev = prev.next ;
        }
        prev.next = null ;
        tail = prev ;
        size--;
        return val ;
    }
    public static void remove(int idx){
        if(size<2){
            removeFirst() ;
        } else if (idx == size ) {
            removelast() ;
        }
        Node temp = head ;
        for (int i = 0; i < idx-2 ; i++) {
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        size-- ;
    }
    public static void deleteNode(Node key){
        if(size == 0){
            System.out.println("List is empty");
            return ;
        }
        int i = itr(key);
        remove(i);
    }

    //PRINT THE LINKEDLIST
    public void printList(){
        Node temp = head ;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");


    }

    //FOR SEARCHING A PARTICULAR NODE
    public static int itr(Node key){
        Node temp = head ;
        int i = 1 ;
        while(temp != null){
            if(temp.next == key){
                return -1 ;
            }
            i++ ;
        }
        return i ;
    }

    //REVERSE THE THE LINKEDLIST
    public static Node reverse(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        Node prev = null ;
        while(head != null){
            Node temp = head.next ;
            head.next = prev ;
            prev = head ;
            head = temp ;
        }
        return prev ;


    }

    //ZIG-ZAG LINKEDLIST
    public static void zig_zag(Node head){

        //BREAK FROM THE MIDDLE
        Node slow = head ;
        Node fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        //REVERSE THE TIGHT PART
        Node rightHead = reverse(slow) ;

        //MERGE THE LINKEDLIST
        merging_for_zig_zag( head ,  rightHead) ;


    }

    // MERGING THE LINKEDLIST
    public  static void merging_for_zig_zag(Node head , Node rightHead){
        Node temp = head ;
        while(rightHead.next != null){
            Node aTemp = temp.next ;
            temp.next = rightHead ;
            Node bTemp = rightHead.next ;
            rightHead.next = aTemp ;
            rightHead = bTemp ;
            temp = aTemp ;
        }
    }

}
