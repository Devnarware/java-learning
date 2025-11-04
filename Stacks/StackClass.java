package Stacks;
import java.util.ArrayList ;


public class StackClass{




        static ArrayList<Integer> list = new ArrayList<>() ;

        //CHECK IF THE STACK IS EMPTY OR NOT
        public static boolean isEmpty(){

            return list.size() == 0 ;
        }

        //PUSH
        public static void push(int data){
            list.add(data) ;
        }

        //POP
        public static int pop(){
            if(isEmpty()){
                return -1 ;
            }
            int top = list.getLast() ;
            list.removeLast() ;
            return top ;
        }

        //PEEK
        public static int peek(){
            if (isEmpty()){
                return -1 ;
            }
            return list.getLast() ;
        }

        //DISPLAY STACK
        public static void display (){
            if (isEmpty()){
                System.out.println("Empty Stack");
            }

            while(!isEmpty()){
                System.out.println(pop());
            }
        }

        public static void pushAtBottom(/*StackClass.Stack s */int n){
            if(isEmpty()){
                push(n);
                return ;
            }

            int top = pop() ;
            pushAtBottom(n);
            push(top) ;

        }


        public static void reverse(){
            if(isEmpty()){
                return ;
            }
            //SAVE THE LAST ELEMENT
            int top = pop() ;
            reverse();
            pushAtBottom(top); ;
        }

}
