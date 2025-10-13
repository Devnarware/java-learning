class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length ;
        int[] ans = new int[n] ;
        int i = 0 , j = 0 ;
        while(j<n){
            if(i == nums.length){
                i = 0 ;
            }
            ans[j] = nums[i] ;
            i++;
            j++ ;
        }
        return ans ;
    }
}