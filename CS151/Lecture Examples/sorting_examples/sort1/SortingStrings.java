package sorting_examples.sort1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Kate");
        names.add("Donna");
        names.add("Anna");

        Collections.sort(names);


        for(String name : names) {
            System.out.println(name);
        }
    }
}
