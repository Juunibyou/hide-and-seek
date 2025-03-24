package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String args[]) {
    
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder(); //My creation

    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

    //Linear Search
    int testOne = finder.linearSearch(sortedFuzzies);
    int testThree = finder.linearSearch(randomFuzzies);

    //Binary Search
    int testTwo = finder.binarySearch(sortedFuzzies);
    int testFour = finder.binarySearch(randomFuzzies);

    System.out.println("Linear search one: " + testOne);
    System.out.println("Binary search two: " + testTwo);
    System.out.println("Linear search three: " + testThree);
    System.out.println("Linear search four: " + testFour);

  }
}
