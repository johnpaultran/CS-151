package sorting_examples.sort3;

import java.util.*;

public class ComparatorTester
{
   public static void main(String[] args)
   {
      ArrayList<Country> countries = new ArrayList<>();
      countries.add(new Country("Uruguay", 176220));
      countries.add(new Country("Thailand", 514000));
      countries.add(new Country("Belgium", 30510));

      Collections.sort(countries, (first, second) -> first.getName().compareTo(second.getName()));

      // Now the array list is sorted by name
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
   }
}

