public class RatInMaze {
    public static void rmp(int x, int y, int maze[][], int n, String curr) {
        // X represting the columns of the matrix and y is rows
        if (x < 0 || y < 0 || x == n || y == n || maze[y][x] == 0) {
            return;
        } else if (x == n - 1 && y == n - 1) {
            System.out.println(curr);
            return;
        }
        maze[y][x] = 0;
        // work
        rmp(x + 1, y, maze, n, curr + 'R');
        rmp(x - 1, y, maze, n, curr + 'L');
        rmp(x, y + 1, maze, n, curr + 'D');
        rmp(x, y - 1, maze, n, curr + 'U');
        maze[y][x] = 1;
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 }
        };
        rmp(0, 0, maze, 4, "");
    }
}
