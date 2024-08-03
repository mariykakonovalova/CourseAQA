package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {

    @Nested
    class CheckCalculateFactorial {

        @ParameterizedTest
        @ValueSource(ints = {-1, -2, -99})
        void shouldThrowRuntimeException(int n) {
            Assertions.assertThrows(RuntimeException.class, () -> Main.calculateFactorial(n));
        }

        @Test
        void shouldReturnZero() {
            int actual = Main.calculateFactorial(0);
            Assertions.assertEquals(0, actual);
        }

        @ParameterizedTest
        @CsvSource({
                "1,1",
                "2,2",
                "3,6",
                "4,24",
                "5,120",
                "6,720"
        })
        void shouldReturnExpected(int n, int expected) {
            int actual = Main.calculateFactorial(n);
            Assertions.assertEquals(expected, actual);
        }

    }

}