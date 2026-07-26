package Solution;
import java.util.ArrayList ;

class Heap {
    public void mergeSort(int[] arr, int s, int e){
        if(s >= e){
            return ;
        }

        int mid = s + (e + s) / 2 ;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, e, mid) ;
    }

    private static void merge(int[] arr, int s, int e, int mid){
        int i = s ;
        int j = mid ;
        int k = 0 ;
        int[] temp = new int[e - s + 1] ;

        while(i <= mid && j <= e){
            if(arr[i] > arr[j]){
                temp[k] = arr[j] ;
                j++ ;
            }else {
                temp[k] = arr[i] ;
                i++ ;
            }
            k++ ;
        }

        while(i <= mid){
            temp[k] = arr[i] ;
            i++ ;
            k++ ;
        }

        while(j <= e){
            temp[k] = arr[j] ;
            j++ ;
            k++ ;
        }

        for (int l = 0; l < temp.length; l++) {
            arr[s + l] = temp[l] ;
        }
    }

}
