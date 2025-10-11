class Solution {
    public boolean isPowerOfFour(int n) {
        return helper(n , 0) ;

    }
    public static boolean helper(int n , int i){
        if(Math.pow(4,i)>n){
            return false ;
        }
        if(Math.pow(4,i) == n){
            return true ;
        }else{
             return helper(n , i+1) ;
        }
       
    }
}