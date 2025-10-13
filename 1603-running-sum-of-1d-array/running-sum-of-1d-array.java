class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0 , n = nums.length;
        int[] arr = new int[n] ;
        for(int i = 0 ; i<n ; i++){
            sum += nums[i] ;
        }
        arr[n-1] = sum ;
        for(int i = n -2 ; i >= 0 ; i--){
            arr[i] = arr[i+1] - nums[i+1] ;
        }
        return arr ;
    }
}