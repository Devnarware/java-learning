class Solution {
    public void rotate(int[] nums, int i) {
        int n = nums.length ;
       if(n<=i){
         i = i%n ;
       }
        int j = 0 , m = n-i ;
        int[] arr = new int[n] ;
        while(m<n){
            arr[j] = nums[m] ;
            m++ ;
            j++ ;
        }
        m = n-i ;
        for(int k = 0 ; k<m ; k++){
            arr[j] = nums[k] ;
            j++ ;
        }
        for(int l = 0 ; l<n ; l++){
            nums[l]= arr[l] ;
        }

    }
}