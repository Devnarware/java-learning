class Solution {
    public void rotate(int[] nums, int i) {
        int n = nums.length;
        i = i%n ;
        reverse(nums , 0 , n-1) ;
        reverse(nums , 0 , i-1) ;
        reverse(nums , i , n-1) ;


    }
    public static void reverse(int[] arr , int s , int e){
        int temp ;
        while(s<=e){
            temp = arr[s] ;
            arr[s] = arr[e] ;
            arr[e] = temp ;
            s++ ;
            e-- ;
        }
    }
}