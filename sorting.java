public class sorting {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ",");
            i++;
        }
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            int smallest = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[smallest]) {
                   smallest  = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
            

            System.out.print(arr[i] + ",");
        }

    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Store the current element
            int prev = i - 1;

            // Finding the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // Shift elements forward
                prev--;
            }

            // Insertion
            arr[prev + 1] = curr;
        }

        // Printing the sorted array inside the function
        for (int num =0 ; num<arr.length ; num++) {
            System.out.print(arr[num] + " ");
        }
        System.out.println();
    }
    public static void countingSort(int arr[]){
        int largest = 0 ;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.min(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }
        int j =0 ;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>=0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1,2,4,2,3,5,2 }; // Unsorted array
        selectionSort(arr); // Sorting & printing the array in one function
    }
}
