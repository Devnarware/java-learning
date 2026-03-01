public class StackUsingLL {

    static class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }



    static class Stack{

        public static Node head ;

        public static boolean isEmpty(){
            if(head == null){
                return true ;
            }
            return false ;
        }


        //PUSH
        public static void push(int data){
            Node newNode = new Node(data) ;
            if (isEmpty()){
                head = newNode ;
                return ;
            }
            newNode.next = head ;
            head = newNode ;
        }


        //POP
        public static int pop(){
            if (isEmpty()){
                return -1 ;
            }

            int top = head.data ;
            head = head.next ;
            return top ;
        }


        //PEEK
        public static int peek(){
            if (isEmpty()){
                return -1 ;
            }

            return head.data ;
        }


        public static void printStack(){
            if (isEmpty()){
                System.out.println("Empty stack");
            }
            Node temp = head ;
            while(head != null){
                System.out.print(peek()+" ");
                head = head.next ;
            }

            head = temp ;

        }
    }

    static void main(String[] args) {

//
//        Stack s = new Stack() ;
//        s.push(2) ;
//        s.push(3) ;
//        s.push(4) ;
//        s.push(5) ;
//
//        s.printStack() ;
//        System.out.println("\n"+s.peek());
//        s.pop() ;
//        s.printStack() ;
    }




}