package BinarySearch ;

public class Floor {
    public static int findFloor(int[] arr, int target) {
        // code here
        int n = arr.length ;
        if(arr[n-1]<target){
            return n-1 ;
        }
        int s = 0 ;
        int e = n-1 ;
        int m ;
        int ans = -1 ;

        while (s <= e){

            m = s + (e-s)/2 ;

            if(arr[m] == target){
                s = m+1 ;
                ans = m ;
            } else if (arr[m]>target) {
                e = m-1 ;

            }else{
                s = m+1 ;
                ans = m ;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19} ;
        int target = 5 ;
        findFloor(arr , target) ;
    }
}
