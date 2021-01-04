package edu.sjsu.tran.Exercise1;

import java.util.ArrayList;

// main class to implement required methods and test them
public class Main
{
    // method to return array of strings that are at least 9 characters
    public static String[] filter(String[] a, Filter<String> f)
    {
        // arraylist to store accepted values
        ArrayList<String> longStrings = new ArrayList<>();
        // for each string in a
        for(String str : a)
        {
            // if str >= 9
            if(f.accept(str))
            {
                // add to arraylist
                longStrings.add(str);
            }
        }
        // create array of string to be returned
        String[] filtered = new String[longStrings.size()];
        // copy values from arraylist to array
        filtered = longStrings.toArray(filtered);
        // return filtered array
        return filtered;
    }

    // method to return array of positive integers
    public static int[] filter(int[] a, Filter<Integer> f)
    {
        // arraylist to store accepted values
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        // for each number in a
        for(int number : a)
        {
            // if number is positive
            if(f.accept(number))
            {
                // add to arraylist
                positiveNumbers.add(number);
            }
        }
        // create array of integers to be returned
        int[] filtered = new int[positiveNumbers.size()];
        // copy values from arraylist to array
        for (int i = 0; i < positiveNumbers.size(); i++)
        {
            filtered[i] = positiveNumbers.get(i);
        }
        // return filtered array
        return filtered;
    }

    // main method to test
    public static void main(String[] args)
    {
        // array of test strings to call filter method on
        String[] testStrings = {"LeBron", "LeBronJames", "gameofthroneswassogooduntilthelastseasonruinedeverything",
                                "1taco", "NINEtacos", "123", "ihopeipass", "0123456789"};
        System.out.println("Original String Array:");
        for (String str : testStrings)
        {
            System.out.print(str+ " ");
        }
        System.out.println();

        // call method and print results
        UpdatedFilter<String> stringFilter = new UpdatedFilter<>();
        String[] longStrings = filter(testStrings, stringFilter);
        System.out.println("Output:");
        for (String str : longStrings)
        {
            System.out.print(str+ " ");
        }
        System.out.println("\n");

        // array of test integers to call filter method on
        int[] testNumbers = {23, 7, -4, 69, -96, -2, 0, -824, 100, 9, 87, 654, -321, -123};
        System.out.println("Original Integer Array:");
        for (int number : testNumbers)
        {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // call method and print results
        UpdatedFilter<Integer> numberFilter = new UpdatedFilter<>();
        int[] positiveNumbers = filter(testNumbers, numberFilter);
        System.out.println("Output:");
        for (int number : positiveNumbers)
        {
            System.out.print(number + " ");
        }
    }
}
