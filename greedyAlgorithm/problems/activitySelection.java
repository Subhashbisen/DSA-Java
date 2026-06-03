package greedyAlgorithm.problems;

import java.util.*;

public class activitySelection {
    public static int activitySelection(int start[], int finish[], ArrayList<Integer> list) {
        // * combine start and finish in a sigle Array
        int activities[][] = new int[start.length][2];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        // sorting
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[1]));

        int maxAct = 0;

        // 1st Activity
        maxAct++;
        int lastEnd = activities[0][1];
        list.add(activities[0][0]);

        for (int i = 1; i < finish.length; i++) {
            if (activities[i][0] > lastEnd) {
                maxAct++;
                lastEnd = activities[i][1];
                list.add(activities[i][0]);
            }
        }
        return maxAct;
    }

    public static void main(String[] args) {
        int start[] = { 5, 1, 3, 10, 2, 5, 4, 7, 2, 2 };
        int finish[] = { 10, 10, 9, 12, 10, 8, 4, 11, 10, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(activitySelection(start, finish, list));
        System.out.println(list);
    }
}
