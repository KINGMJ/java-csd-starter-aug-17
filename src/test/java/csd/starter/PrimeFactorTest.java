package csd.starter;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {
    private PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void test_prime_factor() {
        assertEquals(Arrays.asList(2), primeFactor.getFactors(2));
        assertEquals(Arrays.asList(3), primeFactor.getFactors(3));
        assertEquals(Arrays.asList(2, 2), primeFactor.getFactors(4));
        assertEquals(Arrays.asList(2, 2, 2), primeFactor.getFactors(8));
        assertEquals(Arrays.asList(3, 3), primeFactor.getFactors(9));
        assertEquals(Arrays.asList(2, 11, 13), primeFactor.getFactors(2 * 11 * 13));
    }
}
