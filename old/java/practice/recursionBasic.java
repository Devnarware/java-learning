public class recursionBasic {
    public static void printNum(int i , int n){
        if(i>n)return ;
        printNum(i+1, n);
        System.out.print(i+" ");
    }
    public static void rev(int n , int ans ){
        if(n==0){
            System.out.println(ans);
            return  ;
        }
        ans  = (ans*10) + (n%10) ;
        rev(n/10 , ans) ;
    }
    public static int fibo(int n){
        if(n<2){
            return n ;
        }
        return fibo(n-1) + fibo(n-2) ;
    }
    public static void main(String[] args) {
//        rev(1234 , 0) ;
        int ans = fibo(4) ;
        System.out.println(ans);


    }

}


