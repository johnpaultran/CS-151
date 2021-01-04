package sorting_examples.sort2;

import java.util.Collections;
import java.util.TreeSet;

/**
   A country with a name and area.
*/
public class Country implements Comparable<Country>
{
   /**
      Constructs a country.
      @param aName the name of the country
      @param anArea the area of the country
   */
   public Country(String aName, double anArea)
   {
      name = aName;
      area = anArea;
   }

   /**
      Gets the name of the country.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea()
   {
      return area;
   }


   /**
      Compares two countries by area.
      @param other the other country
      @return a negative number if this country has a smaller
      area than otherCountry, 0 if the areas are the same,
      a positive number otherwise
   */
   public int compareTo(Country other)
   {
      if (area < other.area) return -1;
      if (area > other.area) return 1;
      return 0;
   }

   @Override
   public boolean equals(Object obj) {
      if(obj instanceof Country) {
         Country other = (Country) obj;
         return this.area == other.area ;
      }
      return false;
   }

   @Override
   public String toString() {
      return this.name + " area = " + this.area;
   }

   public static void main(String[] args) {

      Country c = new Country("B", 12222);
      Country c2 = new Country("A", 123);

      TreeSet<Country> countries = new TreeSet<>();
      countries.add(c);
      countries.add(c2);

      for(Country country : countries) {
         System.out.println(country);
      }

   }

   private String name;
   private double area;
}
