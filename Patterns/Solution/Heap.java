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


    public static void main(String[] args) throws Exception{

        HeapSort heap = new HeapSort() ;
        heap.insert(5);
        heap.insert(3);
        heap.insert(6);
        heap.insert(1);
        heap.insert(2);

        heap.heapsort();
    }
}

class HeapSort {
    ArrayList<Integer> list;

    public HeapSort() {
        list = new ArrayList<>();
    }

    private void swap(int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }


    private int parent(int idx) {
        return (idx - 1) / 2;
    }

    private int left(int idx){
        return (idx * 2) + 1 ;
    }

    private int right(int idx){
        return (idx * 2) + 2 ;
    }

    public void insert(int val) {
        list.add(val);
        upheap(list.size() - 1);
    }

    private void upheap(int idx) {
        if (idx == 0) {
            return;
        }

        int p = parent(idx);
        if (list.get(p) > list.get(idx)) {
            swap(p, idx);
            upheap(p);
        }
    }

    public int remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from Empty list....!!") ;
        }

        int temp = list.getFirst() ;
        int last = list.removeLast() ;

        if(!list.isEmpty()){
            list.set(0, last) ;
            downheap(0) ;
        }
        return temp ;
    }

    private void downheap(int idx){
        int min = idx ;
        int left = left(idx) ;
        int right = right(idx) ;

        if(left < list.size() && list.get(min) > list.get(left)){
            min = left ;
        }
        if (right < list.size() && list.get(min) > list.get(right)){
            min = right ;
        }

        if(min != idx){
            swap(min, idx) ;
            downheap(min);
        }
    }

    public void heapsort(){
        for (int i = 0; i < 5; i++) {
            System.out.print(list.removeFirst() + " ");
        }
    }
}
