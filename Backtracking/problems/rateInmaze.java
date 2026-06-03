package problems;

import java.util.*;

public class rateInmaze {
    public static void getways(int maze[][], int row, int col, String path, List<String> list) {
        int n = maze.length;
        // Base cases

        // 🔥 start blocked check (sirf initial call ke liye)
        if (row == 0 && col == 0 && maze[0][0] == 0) {
            return;
        }

        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || maze[row][col] == -1) {
            return;
        }

        if (row == n - 1 && col == n - 1) {
            list.add(path);
            return;
        }
        // work
        maze[row][col] = -1; // visited

        getways(maze, row + 1, col, path + "D", list); // down
        getways(maze, row - 1, col, path + "U", list); // up
        getways(maze, row, col - 1, path + "L", list); // left
        getways(maze, row, col + 1, path + "R", list); // right

        maze[row][col] = 1;
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 },
        };

        List<String> list = new ArrayList<>();
        String path = "";

        getways(maze, 0, 0, path, list);
        System.out.println(list);

    }
}