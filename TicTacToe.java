import java.util.*;
public class TicTacToe {
    public static char board[][] = new char[3][3] ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        initializeBoard();
        char currentPlayer = 'X' ;
        boolean endGame = false ;
        while (!endGame) {
            printBoard();
            System.out.print("player "+currentPlayer+" choose your block :");
            int row = sc.nextInt() ;
            int col = sc.nextInt() ;
            if (row>2 || row<0 || col>2 || col<0) {
                System.out.println("invalid input ");
                continue ;
            }
            if (board[row][col] != ' ') {
                System.out.println("block is already occupied");
                System.out.println("choose another block");
                continue ;
            }
            board[row][col] = currentPlayer ;

            if(checkWin(currentPlayer)){
                printBoard();
                endGame = true ;
                System.out.println("player "+currentPlayer+" is winner");
            }else if(isDraw()){
                printBoard();
                System.out.println("GAME IS ENDED");
                endGame = true;
            }else{
                if (currentPlayer == 'X') {
                     currentPlayer = 'O' ;
                }else{
                    currentPlayer = 'X' ;
                }
             }

        }
        sc.close();

    }
    public static void initializeBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               board[i][j] = ' ' ;
            }
        }
    }
    public static void printBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
                if (j<2) {
                    System.out.print("  |");
                }
            }
            System.out.println("");
            if (i<2) {
                System.out.println("----+----+----");
            }
        }
    }
    public static boolean checkWin(char player ){
        for (int i = 0; i < 3; i++) {
            //for row and col
            if ((board[i][0]==player &&
                board[i][1]==player &&
                board[i][2]==player ) ||
                ((board[0][i] == player &&
                 board[1][i] == player &&
                 board[2][i] == player )
                )) {
                return true ;
            }
        }
    
    //for diagonals
    if ((board[0][0]==player &&
    board[1][1]==player &&
    board[2][2]==player ) ||
    ((board[0][2] == player &&
    board[1][1] == player &&
    board[2][0] == player )
    )) {
        return true ;
    }
    return false ;
    }
    public static boolean isDraw(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j] == ' '){
                    return false ;
                }
            }
        }
        return true ;
    }
}


