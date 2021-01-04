package sorting_examples.sort2;

import java.awt.*;
import java.util.*;

public class RectangleTester {
    public static void main(String[] args) {
        ArrayList<Rectangle> recs = new ArrayList<>();

//        Comparator<Rectangle> comparator = (o1, o2) -> {
//            if (o1.getX() < o2.getX()) {
//                return -1;
//            } else if (o1.getX() > o2.getX()) {
//                return 1;
//            } else {
//                return 0;
//            }
//        };

        recs.add(new Rectangle(1, 1, 10, 10));
        recs.add(new Rectangle(5, 5, 1, 1));
        recs.add(new Rectangle(2, 2, 11, 11));

        //Collections.sort(recs, new XComparator());

        int ascending = -1;

        Collections.sort(recs,
                (o1, o2) -> {
                    if (o1.getX() < o2.getX()) {
                        return -1 * ascending;
                    } else if (o1.getX() > o2.getX()) {
                        return 1 * ascending;
                    } else {
                        return 0;
                    }
                });

        Collections.sort(recs, new XComparator());

        for (Rectangle r : recs) {
            System.out.println(r.toString());
        }

    }
}

class XComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return (int) Math.round(o1.getX() - o2.getX());
    }
}
