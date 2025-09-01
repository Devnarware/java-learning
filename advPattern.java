import java.util.*; 

public class advPattern {
    public static void hollowSquarePattern(int row , int col ){
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= col ; j++){
                if (((i==1)||(i==row))||  ( (j==1) || ( j==col) ) ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        return;
    }
    public static void pyramidPattern(int n){
        int spaces = n-1 ;
        int star = 1 ;
        int col = 1 ;
        while (col<=2*n){
            //forSpaces
            for(int i = 1 ; i<=spaces; i++){
                System.out.print(" ");
            }
            //forStars
            for(int j = 1; j<= star; j++ ){
                System.out.print("*");
            }
            if (col<n) {
                spaces--;
                star=star+2;
            }else{
                spaces++;
                star=star-2;
            }
            col++;
            System.out.println("");
        }
       

    }
    public static void hipofnum(int n){
        // int m =1 ;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if (i-j>=0) {
                    if ((i-j)%2==0||i-j==0) {
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                
            }   
            System.out.println("");
        }
    }
    public static void butterfly(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=2*n ; j++){
                if (i-j>=0 || i+j >= 2*n + 1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=2*n ; j++){
                if (i+j<=n+1 || j-i >= n-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    public static void diamond(int n){
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<=2*n-1 ; j++){
                if(i+j <= n+1 || j-i >= n-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0 ; j<=2*n ; j++){
                if(i-j >= 0 || i+j >=2*n){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    public static void easyDiamond(int n){
    int spaces = n-1 ;
    int star = 1 ;
    int col = 1 ;
    while (col<=2*n){
        //forSpaces
        for(int i = 1 ; i<=spaces; i++){
            System.out.print(" ");
        }
        //forStars
        for(int j = 1; j<= star; j++ ){
            System.out.print("*");
        }
        if (col<n) {
            spaces--;
            star=star+2;
        }else{
            spaces++;
            star=star-2;
        }
        col++;
        System.out.println("");
    }
}
    public static void solidRhombus(int n){
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <=2*n ; j++){
                if (i+j <= n || i+j > 2*n+1) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    public static void emptyRhombus(int n){
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <=2*n ; j++){
                if (i+j <= n || i+j > 2*n+1) {
                    System.out.print(" ");
                }else{
                    if( (i==1 || i==n ) || (i+j==n+1|| i+j==2*n+1) ) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }    
    } 
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many lines did you want");
        int row = sc.nextInt();
        // System.out.println("how many coloum did you want");
        // int col = sc.nextInt();
        // hollowSquarePattern(row, col);
        // pyramidPattern(row, col);
        diamond(row);
        sc.close();
    
    }
}