package sorting_examples.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTester {
    public static void main(String[] args) {

        //ArrayList<Country> countries = new ArrayList<>();

        Comparator<Country> comp = new CountryComparatorByName();

        TreeSet<Country> countries = new TreeSet<>(comp);

        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));




        //Collections.sort(countries, comp);


        // Now the array list is sorted by country name
        for (Country c : countries)
            System.out.println(c.getName() + " " + c.getArea());
    }
}

