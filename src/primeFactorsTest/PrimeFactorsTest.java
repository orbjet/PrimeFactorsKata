package primeFactorsTest;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static primeFactors.PrimeFactors.*;

public class PrimeFactorsTest {

    private List<Integer> list(Integer... ints) {
        List<Integer> list = new ArrayList<>(Arrays.asList(ints));

        return list;
    }

    @Test
    public void generateOne() {
        assertEquals(list(), generate(1));
    }

    @Test
    public void generateTwo() {
        assertEquals(list(2), generate(2));
    }

    @Test
    public void generateThree() {
        assertEquals(list(3), generate(3));
    }

    @Test
    public void generateFour() {
        assertEquals(list(2, 2), generate(4));
    }

    @Test
    public void generateFive() {
        assertEquals(list(5), generate(5));
    }

    @Test
    public void generateSix() {
        assertEquals(list(2, 3), generate(6));
    }

    @Test
    public void generateSeven() {
        assertEquals(list(7), generate(7));
    }

    @Test
    public void generateEight() {
        assertEquals(list(2, 2, 2), generate(8));
    }

    @Test
    public void generateNine() {
        assertEquals(list(3, 3), generate(9));
    }

    @Test
    public void generateTes() {
        assertEquals(list(2, 5), generate(10));
    }

}
