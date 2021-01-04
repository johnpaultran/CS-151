package sorting_examples.sort2;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Racoon implements Comparable<Racoon> {
    private boolean isHungry;
    private int lengthOfTail;
    private String name;

    public Racoon(boolean isHungry, int lengthOfTail, String name) {
        this.isHungry = isHungry;
        this.lengthOfTail = lengthOfTail;
        this.name = name;
    }

    public int getLengthOfTail() {
        return this.lengthOfTail;
    }

    @Override
    public int compareTo(Racoon o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.name + " width tail = " + this.lengthOfTail;
    }
}

class TailComparator implements Comparator<Racoon> {
    @Override
    public int compare(Racoon o1, Racoon o2) {
        // if -1 (or any negative number), when sorted o1 will be before o2
        // If 1 (or any positive number), when sorted o1 will be after o2
        // I want to sort by length of tail in descnending order
        return -(o1.getLengthOfTail() - o2.getLengthOfTail());
    }
}

class RacoonTester {
    public static void main(String[] args) {
        Racoon tally = new Racoon(true, 10, "Tally");
        Racoon josh = new Racoon(true, 14, "Josh");
        Racoon mila = new Racoon(true, 9, "Mila");

        ArrayList<Racoon> tailCompetition = new ArrayList<>();
        tailCompetition.add(tally);
        tailCompetition.add(josh);
        tailCompetition.add(mila);

        Collections.sort(tailCompetition, new TailComparator());

        for (Racoon r : tailCompetition) {
            System.out.println(r);
        }
    }
}

class RacoonLambdaTester {
    public static void main(String[] args) {
        Racoon tally = new Racoon(true, 10, "Tally");
        Racoon josh = new Racoon(true, 14, "Josh");
        Racoon mila = new Racoon(true, 9, "Mila");

        // Remember it stores values in sorted order! defined by compareTo
        // OR you can supply some comparator
        TreeSet<Racoon> raccoons = new TreeSet<>((o1, o2) -> -(o1.getLengthOfTail() - o2.getLengthOfTail()));
        raccoons.add(tally);
        raccoons.add(josh);
        raccoons.add(mila);

        for (Racoon r : raccoons) {
            System.out.println(r);
        }
    }
}


