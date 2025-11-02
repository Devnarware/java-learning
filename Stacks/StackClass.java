package Stacks;
import java.util.ArrayList ;


public class StackClass{


    public static class Stack{

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
    }
}