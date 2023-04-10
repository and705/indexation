package com.nd705;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    @Test
    public void testGetSequences() {
        String[] indexes = {"1,3-5", "2", "3-4"};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 3, 4, 5),
                Arrays.asList(2),
                Arrays.asList(3, 4)
        );
        List<List<Integer>> actual = Port.getSequences(indexes);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateCombinations() {
        List<List<Integer>> sequences = Arrays.asList(
                Arrays.asList(1, 3, 4, 5),
                Arrays.asList(2),
                Arrays.asList(3, 4)
        );
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 4),
                Arrays.asList(3, 2, 3),
                Arrays.asList(3, 2, 4),
                Arrays.asList(4, 2, 3),
                Arrays.asList(4, 2, 4),
                Arrays.asList(5, 2, 3),
                Arrays.asList(5, 2, 4)
        );
        List<List<Integer>> actual = Port.generateCombinations(sequences);
        assertEquals(expected, actual);
    }
}
