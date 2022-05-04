package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MVP {

// TO DO 1: (DONE)

    /* Convert a List<String> to an object stream and for each element -> System,out.println. */

    public void printNames(List<String> names) {

        // Most Optimal Solution:
        names.stream().forEach(System.out::println);
    }
        /* Other Potential Solutions 1:
            Consumer cons = (arg) -> {
                System.out.println(arg);} */

        /* Other Potential Solutions 2:
           names.stream().forEach((arg) -> {
            System.out.println(arg);
            }); */

// TO DO 2: (DONE)

    /* Given a List<Integers>, return a List<Integer> with event numbers. */

    public List<Integer> returnEvenNumbers(List<Integer> numbers) {

        // Most Optimal Solution:
        return numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
         }


// TO DO 3:

    /* Given an int [], double the value of each int and return an int []. */

    public int[] doubleInts(int[] numbers) {

        // Most Optimal Solution:
        return Arrays.stream(numbers).map(num -> num * 2).toArray();

    }
        /* Other Solution 1:
        IntStream stream = Arrays.stream(numbers);
         int[] doublesNumbers = stream.map(num -> num * 2).toArray();
         return doubleNumbers */


// TO DO 4:

    /* Given a String, return a List<String>, all caps. */

    public List<String> splitToAllCapsList(String input) {

        // Most Optimal Solution:
        return  Arrays.stream(input.split("")).map(str -> str.toUpperCase()).collect(Collectors.toList());
    }

// TO DO 5:

    /* Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps. */

    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {

        // Most Optimal Solution:

        return list.stream().filter(str -> str.substring(0, 1).equals(letter))
                .sorted().map(str -> str.toUpperCase()).collect(Collectors.toList()); }

    // Other Solution 1:

    /* list.stream().filter(str -> str.startsWith(letter));
         return null; */


// TO DO 6:

    /* Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter. */

    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {

        // Most Optimal Solution:

        return words.stream().filter(str -> str.length() < maxLength && str.startsWith(firstLetter))
                .collect(Collectors.toList());
    }
}