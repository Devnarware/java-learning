package Solution;
import java.util.ArrayList ;
import java.util.Arrays;

class Heap {
    public static void mergeSort(int[] arr, int s, int e){
        if(s >= e){
            return ;
        }

        int mid = s + (e - s) / 2 ;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, e, mid) ;
    }

    private static void merge(int[] arr, int s, int e, int mid){
        int i = s ;
        int j = mid + 1 ;
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

    private static void quicksort(int[] arr, int s, int e){
        if(s >= e){
            return ;
        }

        int low = s ;
        int hi = e ;
        int mid = low + (hi - low) / 2 ;
        int pivot = arr[mid] ;

        while(low <= hi){
            while(arr[low] < pivot){
                low++ ;
            }

            while(arr[hi] > pivot){
                hi-- ;
            }

            if (low <= hi){
                swap(arr, low, hi) ;

                low++ ;
                hi-- ;
            }
        }

        quicksort(arr, s, hi);
        quicksort(arr, low, e);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }


    public static void main(String[] args) {

        int[] arr = {5,4,3,6,8,2};
        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}

class HeapSort{
    ArrayList<Integer> list ;

    public HeapSort(){
        list = new ArrayList<>() ;
    }

    public void insert(int val){
        
    }
}
