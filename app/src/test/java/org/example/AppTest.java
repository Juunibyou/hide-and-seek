package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class AppTest {

//Linear Search Test
@Test
  public void testLinearSearchSorted(){

    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder(); //My creation
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();

    int index = finder.linearSearch(sortedFuzzies);
    assertEquals("gold", sortedFuzzies.get(index).color);
  }

  @Test
  public void testLinearSearchRandom(){

    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder(); //My creation
    ArrayList<Fuzzy> randomFuzzies = generator.sortedRainbowFuzzies();

    int index = finder.linearSearch(randomFuzzies);
    assertEquals("gold", randomFuzzies.get(index).color);
  }

//Binary Search Test
  @Test
  public void testBinarySearchSorted(){

    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder(); //My creation
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();

    int index = finder.binarySearch(sortedFuzzies);
    assertEquals("gold", sortedFuzzies.get(index).color);
  }

  @Test
  public void testBinarySearchRandom(){

    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder(); //My creation
    ArrayList<Fuzzy> randomFuzzies = generator.sortedRainbowFuzzies();

    int index = finder.linearSearch(randomFuzzies);
    assertNotEquals(-1, randomFuzzies.get(index).color);
    assertEquals("gold", randomFuzzies.get(index).color);
  }

}
