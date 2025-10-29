// import java.util.* ;
public class binary {
    public static void evenOrOdd(int num){
        int bitMask = 1 ;
        if ((num & bitMask) == 0) {
            System.out.println("even");
        }else{ 

            System.out.println("odd");
        }
    }
    public static void getIthbit(int num , int i ){
        int bitMask = 1 << i ;
        if ((num & bitMask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }

    }
    public static void clearIthBit(int num , int i ){    int bitMask = ~(1<<i) ;
        System.out.println(num&bitMask);
    }
    public static void updateIthbit(int num , int i ,int nb){
        num = num & ~(1<<i) ;
        num = num | (nb<<i) ;
        System.out.println(num);
    }
    public static void clearIbit(int num , int i ){
        num = num &((~0)<<i) ;
        System.out.println(num);
    }
    public static void countSetBit(int num ){
        int count = 0  ;
        while (num>0) {
            num = num&(num-1) ;
            count++ ;
        }
        System.out.println(count);
    }
    public static void swapTwoNums(int x ,int y){
        System.out.println(x +" "+ y);
        x = x^y ;
        y = x^y ;
        x = x^y ;
        System.out.println(x +" "+ y);

    }
    public static void main(String[] args){
        swapTwoNums( 34 , 45);
        System.out.println(~(10));
    }
}
