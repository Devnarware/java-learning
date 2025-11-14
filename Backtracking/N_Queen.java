import java.util.* ;
public class N_Queen{

    static int count = 0 ;

    public static boolean isSafe(char board[][] , int row , int col){
        //vertical
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false ;
            }
        }
        //left
        for (int i = row-1 , j = col-1; i>=0 && j>=0; i-- , j--) {
            if (board[i][j]=='Q') {
                return false ;
            }
        }
        //right
        for (int i = row-1 , j = col+1; i>=0 && j<board.length; i-- , j++) {
            if (board[i][j]=='Q') {
                return false ;
            }
        }

        return true ;
    }

    public static boolean nQueen(char board[][] , int row){
        if (row == board.length) {
            // printBoard(board);
            // count++ ;
            return true ;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board , row , i)) {
                board[row][i] = 'Q' ;
                if (nQueen(board, row+1)) {
                    return true ;
                }
                board[row][i] = 'X' ;
            }
        }
        return false ;
    }

    public static void printBoard(char board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number:- ");
        int n = sc.nextInt() ;
        char board[][] = new char[n][n] ;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X' ;
            }
        }
        // nQueen(board, n) ;
        // System.out.println("Number of solution are: "+count);
        if (nQueen(board, 0)) {
            System.out.println("Solution is possible ");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        sc.close();
    }
}