class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            n = n*-1 ;
           return -n == reverse(n , 0) ;
        }
        return n == reverse(n , 0) ;
    }
    public static int reverse(int n , int ans){
        if(n==0){
            return ans ;
        }
        ans = (ans*10) + n%10 ;
        return reverse(n/10 , ans) ;
    }
}