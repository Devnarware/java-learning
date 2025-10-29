package LinkedList;

public class Main {


    public static void main(String[] args) {
        LinkedList ll = new LinkedList() ;
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printList();
        ll.head = ll.reverse(ll.head) ;
        ll.printList();
    }
}
