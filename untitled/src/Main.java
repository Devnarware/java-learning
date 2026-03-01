import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter three number");
        int a = 12345 ;
        int b = 0;
        while(a>0){
            b = (b*10) + a%10 ;
            a = a/10 ;
        }
        System.out.println(b);
    }

}
