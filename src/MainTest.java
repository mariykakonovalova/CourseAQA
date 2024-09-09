package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @DataProvider
    public static Object[] negativeNumbers() {
        return new Object[]{-1, -2, -99};
    }

    @Test(dataProvider = "negativeNumbers")
    void checkCalculateFactorialShouldThrowRuntimeException(int n) {
        assertThrows(RuntimeException.class, () -> Main.calculateFactorial(n));
    }

    @Test
    void checkCalculateFactorialShouldReturnZero() {
        int actual = Main.calculateFactorial(0);
        assertEquals(0, actual);
    }

    @DataProvider
    public static Object[][] positiveNumber() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
    }

    @Test(dataProvider = "positiveNumber")
    void checkCalculateFactorialShouldReturnExpected(int n, int expected) {
        int actual = Main.calculateFactorial(n);
        assertEquals(expected, actual);
    }


}