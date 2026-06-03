package problems;

import java.util.*;

public class ratnMaze {

    // public static void gateWays(int maze[][], List<String> list, int row, int
    // col, String path) {
    // // * base cases
    // if (row == 0 && col == 0 && maze[row][col] == 0) {
    // return;
    // }

    // if (row < 0 || col < 0 || row >= maze.length || col >= maze.length ||
    // maze[row][col] == 0
    // || maze[row][col] == -1) {
    // return;
    // }

    // if (row == maze.length - 1 && col == maze.length - 1) {
    // list.add(path);
    // return;
    // }

    // maze[row][col] = -1; // visited mark

    // // * work
    // gateWays(maze, list, row - 1, col, path + "U"); // *up */
    // gateWays(maze, list, row + 1, col, path + "D"); // *down */
    // gateWays(maze, list, row, col - 1, path + "L"); // *left */
    // gateWays(maze, list, row, col + 1, path + "R");// *right */

    // maze[row][col] = 1; // visited umark
    // }

    public static void gateWays(int maze[][], List<String> list, int row, int col, String path) {
        // * Base Case
        if (row == 0 && col == 0 && maze[row][col] == 0) {
            return;
        }

        if (row < 0 || col < 0 || row >= maze.length || col >= maze.length || maze[row][col] == 0
                || maze[row][col] == -1) {
            return;
        }

        if (row == maze.length - 1 && col == maze.length - 1) {
            list.add(path);
            return;
        }

        // * mark visited
        maze[row][col] = -1;

        // * work
        gateWays(maze, list, row - 1, col, path + "U"); // *up */
        gateWays(maze, list, row + 1, col, path + "D"); // *down */
        gateWays(maze, list, row, col - 1, path + "L"); // *left */
        gateWays(maze, list, row, col + 1, path + "R");// *right */

        // * Backtracking
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

        gateWays(maze, list, 0, 0, path);
        System.out.println(list);
    }
}
