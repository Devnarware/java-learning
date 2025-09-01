// import java.util.*;

public class arrays {
    public static int linear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int linearString(String menu[] , String key2){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key2) {
                return i;
            }
        }
        return -1;
    }
    public static void largest(int arr[]) {
        int j = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > j) {
                j = arr[i];
            }
        }
        System.out.println("largest number is : " + arr[j]);
    }
    public static int smallestInt(int num[]){
        int largest = Integer.MAX_VALUE;
        for(int i = 0 ; i< num.length ; i++){
            if (num[i]<largest) {
                largest=num[i];
            }
        }
        return largest ;
    }
    public static int binary(int arr[] , int key){
    int high = arr.length  ;
    int low = 0 ;
    System.out.println(high);
    while (low<= high) {
          int mid = low + (high - low)  / 2 ;
        if (arr[mid]==key) {
            return mid ;
        }else if (arr[mid]>key) {
            high = mid-1 ;
        }else{
            low = mid + 1 ;
        }
      }
      return -1 ;
    }
    public static void subarray(int arr[]){
        int n = arr.length - 1 ;
        for(int i = 0 ; i<=n ; i++ ){
            for(int j = i ; j<= n ; j++){
                for(int k = i ; k<=j ; k++){
                     System.out.print(arr[k]+" ,");
                }
                System.out.println("");
            }
        } 
    }
    public static void pairs(int arr[]){
        int n = arr.length -1 ;
        for (int i = 0; i <= n; i++) {
            for(int j = i+ 1 ; j<= n ; j++ ){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println("");
        }
    }
    public static void maxSumofSubarray(int arr[]){
        int n = arr.length -1 ; 
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            for (int j = i ; j<= n ; j++){
                int sum = 0 ;
                for (int k = i ; k <= j; k++){
                    sum+=arr[k];
                    if (sum>maxSum) {
                        maxSum = sum ;
                    }
                }
                System.out.println(sum);
            }
        }
        System.out.println("max sum of an subarray is : " + maxSum);
    }
    public static void maxSumofSubarraybyPrefix(int arr[]){
        int prefix[] = new int[arr.length] ;
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1] + arr[i];
        }
        int n = prefix.length-1 ; 
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int start = i ;
            for (int j = i ; j<= n ; j++){
                int end = j ;
                int sum = start ==0 ? prefix[end]  : prefix[end]- prefix[start-1] ;
                
                // System.out.println(sum);
                if (sum>maxSum) {
                    maxSum=sum;
                }
            }
        }
        System.out.println("max sum of an subarray is : " + maxSum);
    }
    public static void mSSKadanesAlgo(int arr[]){
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i] ;
            maxSum = Math.max(maxSum, sum);
            if (sum<0){
                sum=0 ;
            }
        }
        System.out.println(maxSum);
    }
    public static int trapRainWater(int height[]){
        int n = height.length  ;
        // ....calculation of LMB.......
        int leftmaxBoundry[] = new int[n];
        leftmaxBoundry[0] = height[0]; 
        for (int i = 1; i < n; i++) {
            leftmaxBoundry[i]= Math.max(height[i], leftmaxBoundry[i-1]);
        }
        // ......calculation of RMB.......
        int rightmaxBoundry[]=new int[n];
        rightmaxBoundry[n-1]=height[n-1];
        for (int i = n-2; i>= 0; i--) {
            rightmaxBoundry[i]= Math.max(height[i], rightmaxBoundry[i+1]);
        }
        int trapRainWater = 0 ;
        for (int i = 0; i <n; i++) {
            // ...water level....
            int waterLevel = Math.min(rightmaxBoundry[i], leftmaxBoundry[i]);
            //......trapped water ......
            trapRainWater += waterLevel-height[i];
        }
        return trapRainWater; 

    }
    public static int maxProfit(int price[]){
        int buyPrice= Integer.MAX_VALUE;
        int profit = 0 ;
        int maxProfit = 0 ;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice<price[i]) {
                profit = price[i]-buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit ;
    }
    public static int maxArea(int arr[]){

        // there are two methos to sole this 
        // 1) brute force (two loops are used)
        // 2) two pointer

        int maxArea = 0 ;
        int front = 0 ;
        int back = arr.length -1 ;
        while (front<=back) {
            int length = back - front ;
            int breadth = Math.min(arr[front], arr[back]);
            int area = length*breadth;
            maxArea = Math.max(area, maxArea);
            if (arr[front]<=arr[back]) {
                front++ ;
            }else{
                back--;
            }
        }
        
        return maxArea;
    }
    public static void main(String args[]) {
        int numbers[] = { 0,1,0,2,1,0,1,3,2,1,2,};
       mSSKadanesAlgo(numbers);
       
        





    }
}
