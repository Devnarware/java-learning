public class pushAtBottom {


    public static void pushAtBottom(StackUsingLL.Stack s , int data){
        if(s.isEmpty()){
            s.push(data) ;
            return ;
        }

        int top = s.pop() ;
        pushAtBottom(s , data);
        s.push(top) ;
        return;
    }


    public static void reverseStack(StackUsingLL.Stack s ){
        if(s.isEmpty()){
            return ;
        }

        int top = s.pop() ;
        reverseStack(s);
        pushAtBottom(s, top) ;
        return;
    }

    static void main(String[] args) {


        StackUsingLL.Stack s = new StackUsingLL.Stack() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        s.push(4) ;

        s.printStack();
        System.out.println("");

       reverseStack(s);

        s.printStack();
    }
}
