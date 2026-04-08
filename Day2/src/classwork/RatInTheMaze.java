package classwork;

public class RatInTheMaze {

    static void solve(int[][] maze, int i, int j, String path, boolean[][] visited) {
        int n = maze.length;

        // boundary + invalid checks FIRST
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || visited[i][j]) {
            return;
        }

        // destination reached
        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        // mark visited
        visited[i][j] = true;

        // move Down
        solve(maze, i + 1, j, path + "D", visited);

        // move Left
        solve(maze, i, j - 1, path + "L", visited);

        // move Right
        solve(maze, i, j + 1, path + "R", visited);

        // move Up
        solve(maze, i - 1, j, path + "U", visited);

        // backtrack
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        boolean[][] visited = new boolean[maze.length][maze.length];

        solve(maze, 0, 0, "", visited);
    }
}