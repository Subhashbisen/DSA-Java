package Strings.quetions;

import java.util.*;

public class shortestPath {

    public static float getshortestpath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == "S") {
                y--;
            }
            // north
            else if (dir == "N") {
                y++;
            }
            // west
            else if (dir == "W") {
                x--;
            }
            // east
            else {
                x++;
            }
        }
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
    }
}
