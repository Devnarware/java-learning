import java.util.ArrayList ;

public class StackUsingAL {

    static class Stack{

        static ArrayList<Integer> list = new ArrayList<>() ;


        public static boolean isEmpty(){
            return list.size() == 0 ;
        }

        //PUSH
        public static void push(int data){
            list.add(data) ;
        }


        //POP
        public static int pop(){
            if (isEmpty()){
                return -1 ;
            }

            int top = list.getLast() ;
            list.removeLast() ;
            return top ;
        }

        //PEEK
        public static int peek(){
            if(isEmpty()){
                return -1 ;
            }
            return list.getLast() ;
        }

        //PRINT
        public static void printStack(){
            if (isEmpty()){
                System.out.println("stack is empty");
            }

            for (int i = list.size()-1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
        }
    }


    static void main(String[] args) {


        Stack s = new Stack() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        s.push(4) ;
        s.push(5) ;

        s.printStack() ;
        System.out.println("\n"+s.peek());
        s.pop() ;
        s.printStack() ;
    }
}
