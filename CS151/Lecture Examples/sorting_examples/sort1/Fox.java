package sorting_examples.sort1;

public class Fox implements Comparable<Fox> {
    private int age;
    private double weight;

    public Fox(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int compareTo(Fox o) {
        if (age > o.age) {
            return 1;
        } else if (age < o.age) {
            return -1;
        } else {
            if (weight > o.weight) {
                return 1;
            } else if (weight < o.weight) {
                return -1;
            } else {
                return 0;
            }
        }
    }


//    public boolean equals(Object obj) {
//        if (obj instanceof Fox) {
//           Fox other = (Fox) obj;
//           this.compareTo(other);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fox) {
            Fox other = (Fox) obj;
            return age == other.age && weight == other.weight;
        }
        return false;
    }
}

