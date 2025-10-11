class Solution {
    public boolean isPowerOfThree(int n) {
        return helper(n , 0) ;
    }
    public static boolean helper(int n , int i){
        if(Math.pow(3,i)>n){
            return false ;
        }
        if(Math.pow(3,i) == n){
            return true ;
        }else{
             return helper(n , i+1) ;
        }
       
    }
}