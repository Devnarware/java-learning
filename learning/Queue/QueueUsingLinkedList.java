public class QueueUsingLinkedList {

    static class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
            next = null ;
        }
    }

    static class Queue{
        Node head = null ;
        Node tail = null ;
        int size = 0 ;

        boolean isEmpty(){
            return head == null  ;
        }

        //  ADD
        void add(int n){
            Node newNode = new Node(n) ;
            size = size++ ;
            if (isEmpty()){
                head = newNode ;
                tail = newNode ;
                return ;
            }

            tail.next = newNode ;
            tail = newNode ;
        }

        //   REMOVE
        int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1 ;
            }
            size = size-- ;
            int result = head.data ;
            // FOR ONLY 1 ELEMENT
            if(head.next == null){
                head = null ;
                tail = null ;
                return result ;
            }

            head = head.next ;
            return result ;
        }

        //  PEEK TO THE FIRST ELEMENT
        int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1 ;
            }

            return head.data ;
        }

        void print(){
            if (isEmpty()){
                System.out.println("Queue is empty");
            }

            Node temp = head ;
            while(temp.next != null){
                System.out.print(temp.data + " ") ;
                temp = temp.next ;
            }
        }


        static void main(String[] args) {
            Queue q = new Queue() ;
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            q.print();
            System.out.println(" ");
            q.remove() ;
            System.out.print(q.peek());
        }

    }
}
