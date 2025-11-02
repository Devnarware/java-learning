package Stacks;
import java.util.LinkedList ;

public class StackUsingLL {

    static class Stack{
        static LinkedList<Integer> lists = new LinkedList<>() ;


        //isEMPTY
        public static boolean isEmpty(){

            return lists == null ;
        }

        //PUSH
        public static void push(int data){
            lists.add(data) ;
        }
    }
}