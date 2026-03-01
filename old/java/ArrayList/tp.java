public class tp {
    public static void main(String[] args){
        int arr[] = {5,2,6,4,1,7,2} ;
        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i] ;
            int prev = i-1 ;
            while (prev>=0 && arr[prev]>curr ) {
                arr[prev+1] = arr[prev] ;
                prev-- ;
            }
            arr[prev+1] = curr ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println(arr.length);
    }

}
