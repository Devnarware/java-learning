package BinarySearch;

public class CeilingQue {

    public static int ceiling(int[] arr , int x){

        int n = arr.length;
        int s = 0, e = n - 1;
        int ans = -1;
        int m ;

        while (s <= e) {
            m = s + (e - s) / 2;

            if (arr[m] == x) {
                ans = m;
                e = m - 1;
            } else if (arr[m] < x) {
                s = m + 1;
            } else {
                ans = m;
                e = m - 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,1,1,4,4,4,4,5,6,7} ;
        int target = 4 ;
       System.out.println( ceiling(arr, target) );


    }
    
}
