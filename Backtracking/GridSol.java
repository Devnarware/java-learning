public class GridSol {

    public static int gridWays(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        } else if (i == m || j == n) {
            return 0 ;
        }
        return gridWays(i + 1, j, m, n) + gridWays(i, j + 1, m, n);
    }

    public static void main(String[] args) {
        int m = 4, n = 3;
        System.out.println("Number of ways: "+ gridWays(0, 0, m, n));
    }
}
