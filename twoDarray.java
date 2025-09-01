public class twoDarray {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0 ;
        int startColoumn = 0 ;
        int endRow = matrix.length-1 ;
        int endColoumn = matrix[0].length-1 ;
        while (startColoumn<=endColoumn && startRow<=endRow) {
            //....TOP ROW ....//
            for(int j = startColoumn ; j<=endColoumn ; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            System.out.print("  ");
            //...LEFT COLOUMN ...//
            for(int i = startRow+1 ; i<=endRow ; i++){
                if (startColoumn==endColoumn) {
                    break; 
                }
                System.out.print(matrix[i][endColoumn] + " ");
            }
            System.out.print("  ");
            //...BOTTOM ROW...//
            for(int j = endColoumn-1 ; j>=startColoumn ; j--){
                System.out.print(matrix[endRow][j] + " ");
            }
            System.out.print("  ");
            //....RIGHT COLOUMN...//
            for(int i = endRow-1 ; i>=startRow+1 ; i--){
                if (startRow==endRow) {
                    break ;
                }
                System.out.print(matrix[i][startRow] + " ");
            }
            System.out.print("  ");
            startColoumn++;
            startRow++;
            endColoumn--;
            endRow--;
        }
    }
    public static int sumOfDiagonal(int matrix[][]){
        int sum = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if (i!= matrix.length-1-i) {
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum ;
    }
    public static boolean searchinSortedMatrix(int matrix[][] , int key){
        int row = matrix.length -1 ;
        int col = 0 ; 
        while (row>=0 && col<matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.println(row + ","  + col );
                return true ;
            } else if (key>matrix[row][col]) {
                col++;
            }else{
                row--;
            }
        }
        return false ;
    }
    public static void numTime(int matrix[][] , int key){
        int row = matrix.length -1 ;
        int col = 0 ;
        int numCount = 0 ; 
        while (row>=0 && col<matrix[0].length-1) {
            System.out.println("Checking row: " + row + ", col: " + col + " -> " + matrix[row][col]);
            if (key == matrix[row][col]) {
                numCount++;
                col++;
            } else if (key>matrix[row][col]) {
                col++;
            }else{
                row--;
            }
        }
        System.out.println(numCount);
        
       
    }
    public static void transpose(int arr[][]){
        // int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            // int temp = i ;
            
        }
    }
    public static void main(String[] args) {
        // char matrix[][] = new char [3][3];
        // char check = 'x' ;
        // numTime(matrix, 30);
        
    }
}
