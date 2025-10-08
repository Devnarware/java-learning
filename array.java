public class array {
    public static void productExceptSelf2(int arr[] , int answer[]){
        int suff = 1 , n = arr.length;
        answer[0] = 1 ;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i-1]*arr[i-1] ;
        }
        for (int i = n-1; i >= 0 ; i--) {
            answer[i] *= suff ;
            suff *= arr[i] ;
        }
    }
    public static void productExceptSelf(int arr[] , int ans[]){
        int n = arr.length ;
        int pre[] = new int[n] ;
        int suff[] = new int[n] ;

        pre[0] = 1 ;
        suff[n-1] = 1 ;

        //pre  
        for (int i = 1; i < n ; i++) {
            pre[i] = pre[i-1] * arr[i-1] ;
        }

        //suff
        for (int i = n-2; i >= 0; i--) {
            suff[i] = suff[i+1] * arr[i+1] ;
        }

        //ans
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i] ;
        }
    }
    public static void printArr(int answer[]){
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4,5} ;
        int answer[] = new int[array.length] ;
        productExceptSelf2(array, answer);
        printArr(answer);
        
    }
}
