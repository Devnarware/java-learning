class Solution {
    public static int bSearch(int[] arr, int key, int si, int ei) {
        if(si>ei){
            return -1 ;
        }
        int mid = si + (ei - si)/2 ;
        if(arr[mid] == key){
            return mid ;
        }
        if(arr[mid]<key){
            return bSearch(arr , key , mid+1 , ei) ;
        }else{
            return bSearch(arr , key , si , mid-1) ;

        }
    }

    public int search(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        return bSearch(arr, target, si, ei);

    }
}