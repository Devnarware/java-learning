public class Recursionbasic{

    public static void printDec(int n){
        if (n==1) {
            System.out.print(n+" ");
            return ;
        }else{
            System.out.print(n+" ");
            printDec(n-1);
        }
    }

    public static void printInc(int n ){
       if(n==1){
        System.out.print(n+" ");

       }else{
        printInc(n-1);
        System.out.print(n+" ");
       }
    }

    public static int factorial(int n ){
        if (n==0) {
            return 1;
        }
        int pfact = factorial(n-1);
        int fact = n*pfact ;
        return fact ;
    }

    public static int Sum(int n ){
        if (n==0) {
            return 0 ;
        }
        int psum = Sum(n-1);
        int sum = psum + n ;
        return sum ;
    }
    
    public static int Fib(int n ){
        if (n==0 || n==1) {
            return n ;
        }
        int fm1 = Fib(n-1);
        int fm2 = Fib(n-2);
        int fib = fm1 + fm2 ;
        return fib ;

    }

    public static boolean sArray(int[] arr , int i){
        if (i==arr.length-1) {
            return true ;
        }
        if (arr[i]>arr[i+1]) {
            return false ;
        }
        sArray(arr, i+1);

        return sArray(arr, i+1);

    }

    public static int focc(int[] arr , int key , int i ) {
        if (i == arr.length) {
            return -1 ;
        }
        if (arr[i]==key) {
            return i ;
        }
        return focc(arr, key, i+1);
    }

    public static int locc(int[] arr , int key , int i ) {
        if (i < 0) {
            return -1 ;
        }
        if (arr[i]==key) {
            return i ;
        }
        return focc(arr, key, i-1);
    }

    public static int calPower(int var , int pow ){
        if (pow==0) {
            return 1 ;
        }
       return var*calPower(var, pow-1);
    }

    public static int reversed(int n , int rev){
        if (n==0){
            return rev ;
        }
        rev = rev*10 + n%10 ;
        System.out.println(rev);


        return reversed(n/10 , rev);
    }

    public static int zeroes(int n ){
        if (n == 0) {
            return 0 ;
        }
        if(n%10 ==0){
           return 1 + zeroes(n/10) ;
        }
        return zeroes(n/10 ) ;
    }

    public static void rArray(int [] arr , int key ,int idx){
        if(idx>=arr.length){
            return ;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        rArray(arr , key , idx+1);
        return ;
    }

    public static int tile(int n ){
        if (n==0 || n==1){
            return 1 ;
        }
//        int tVer = tile(n-1) ;
//        int thor = tile(n-2) ;
//        int total = thor + tVer ;
//        return total ;
        return tile(n-1)+tile(n-2) ;
    }

    public static void rmDStr(String str , int idx , StringBuilder newStr , boolean map[]){
        if (idx>=str.length()){
            System.out.println(newStr);
            return ;
        }
        char currCh = str.charAt(idx) ;
        if (map[currCh-'a']==true){
            rmDStr(str , idx+1 , newStr , map);
        }else{
            map[currCh-'a']=true ;
            rmDStr(str , idx+1 , newStr.append(currCh) ,map);
        }
    }

    public static int friendsPair(int n){
        if (n==1 || n == 2){
            return n ;
        }
        return friendsPair(n-1)+(n-1)*friendsPair(n-2)   ;
    }


    public static void bitString(int n , int last ,String str ) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        bitString(n - 1, 0, str + "0");
        if (last == 0) {
            bitString(n - 1, 1, str + "1");
        }
    }


    public static void solHanoi(char curr , char aux , char dest , int n){
        if (n==0) {
            return ;
        }
        solHanoi(curr, dest, aux, n-1);
        System.out.println("move disc " + n +" from tower  "+ curr + " to tower "+ dest);
        solHanoi(aux, curr, dest, n-1);
    }
    
    public static void mergeSort(int si , int ei , int[] arr){
        if(si>=ei){
            return ;
        }
        int mid = si + (ei-si)/2 ;
        mergeSort(si, mid, arr);
        mergeSort(mid+1, ei, arr);
        merge(si, mid, ei, arr);
        
    }
    public static void merge(int si, int mid , int ei ,int[] arr){
        int temp[] = new int[ei - si +1];
        int i = si ;
        int j = mid+1 ;
        int k = 0 ;
        while (i<=mid && j <= ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++ ;
            }else{
                temp[k]=arr[j];
                j++ ;
            }
            k++ ;
        } 
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static int search(int arr[] , int tar , int si , int ei){
        if(si>ei){
            return -1 ;
        }
        int mid = si + (ei-si)/2 ;
        if(arr[mid]==tar){
            return mid ;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                return search(arr, tar, mid+1, ei);
            }
        }else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, mid-1, ei);
            }
        }
        // return -1 ;
    }
    public static void main(String[] args) {
        // int n = 4;
        // printDec(n);
        // System.out.println("");
        // printInc(n);
        // System.out.println("");
        // System.out.println(factorial(n )); 
        // System.out.println(Sum(n));
        // System.out.println(Fib(7));
        int[] arr = {4,5,6,7,0,1,2  } ;
        // System.err.println(sArray(arr, 0));
        // System.out.println(focc(arr, 7, 0));
        // System.out.println(locc(arr, 5, arr.length-1));
        // System.out.println(calPower(2, 26 ));
        // String str = "appnnnacollege" ;
        // rmDStr(str ,0 , new StringBuilder("") ,newstr) ;
        // bitString(n , 0 , "");
        // rArray(arr , n , 0 );
        // solHanoi('A', 'B', 'C', n);
        // mergeSort(0, arr.length-1, arr);
        // quickSort(0, arr.length-1, arr);
        // printArr(arr);
        int idx = search(arr, 2, 0, arr.length-1) ;
        System.out.println("your key is at index "+ idx);
    }
}