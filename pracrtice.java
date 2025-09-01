public class pracrtice {
        public static void main(String[] args) {
        // String str[] = {"zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine"} ;
        // String str2 = "abcab" ;
        // Recursionquestions fi = new Recursionquestions() ;
        // // System.out.println(fi.lengthOfString(str2));
        int arr[] = {2,3,4,5,1} ;
        ArraysQuestions rd = new ArraysQuestions() ;
        // rd.removeDulicates();
        rd.countInversions(arr, 0, arr.length-1) ;
        System.out.println(rd.count);
    }
}
class Recursionquestions {
    public void fIndices(int arr[] ,int key,int n , int i){
        if(i==n){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        fIndices(arr, key, n, i=i+1);
    }
    public void digitToString(String str[] , int num  ){
        if (num==0) {
            return ;
        }
        digitToString(str, num/10);
        int k = num%10 ;
        System.out.print(str[k] +" ");
    }
    public int lengthOfString(String str){
        if(str.length() == 0){
            return 0 ;
        }
        return 1+lengthOfString(str.substring(1));

    }
}
class ArraysQuestions{
    public int count  = 0  ;

    public void removeDulicates(){
        int arr[]={1,2,2,3,4,5};
        int k = 0 ;
        int arr2[] = new int[arr.length] ;
        for(int i = 0 ; i < arr.length; i++){
            if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    arr2[k++]=arr[i] ;
                }
            }else if (arr[i]!=arr[i+1]) {
                arr2[k++] = arr[i] ;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr2[i]+" ");
        }
        
    }
    public int[] mergeTwoSortedArrays2(int[] left, int[] right){
        int n = left.length;
        int m = right.length;

        int[] res = new int[n+m];

        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                count += (n-i);
                j++;
            }
            k++;
        }

        while(i<n){
            res[k] = left[i];
            i++;
            k++;
        }

        while(j<m){
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public int[] countInversions(int[] arr, int si, int ei){
        if(si == ei){
            int[] ba = new int[1];
            ba[0] = arr[si];

            return ba;
        }
        int mid = (si+ei)/2;

        int[] left = countInversions(arr, si, mid);
        int[] right = countInversions(arr, mid+1, ei);

        int[] res = mergeTwoSortedArrays2(left,right);
        return res;
    }
}
