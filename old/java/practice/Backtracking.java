public class Backtracking {

    public static void permutation(int[] arr , int i ){
        if(i == arr.length){
            System.out.println(i);
            return ;
        }
        for ( int j = i; j <arr.length ; j++) {
            permutation(arr, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3} ;
        permutation(arr , 0);
    }
}
