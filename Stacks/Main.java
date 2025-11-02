package Stacks;


public class Main {
    public static void main(String[] args) {

        StackClass.Stack s = new StackClass.Stack() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        s.push(4) ;

      while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop() ;

      }






    }
}
