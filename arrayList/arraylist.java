package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);

        Collections.sort(list);

        System.out.println(list);
    }
}
