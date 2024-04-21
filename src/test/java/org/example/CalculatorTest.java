//STUDENT NUMBER= B211202009
//STUDENT NAME = HAYRUN NİSA ÇELİK
//COURSE NAME = SOFTWARE VERIFICATION AND VALIDATION
//

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @ParameterizedTest
    @CsvSource({"10, 2,5"})
    void testDivide1(int a, int b, int expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.divide(a, b),
                "The result of Calculator.add method is incorrect.");



    }
    @ParameterizedTest
    @CsvSource({"10, 4,2.5"})
    void testdivision2(int a, int b, float expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.divide(a, b),
                "The result of Calculator.add method is incorrect.");



    }


    @ParameterizedTest
    @CsvSource({"12.5, 2.5,5"})
    void testdivision3(float a, float b, float expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.divide(a, b),
                "The result of Calculator.add method is incorrect.");



    }

    @ParameterizedTest
    @CsvSource({"10, 2.5,4"})
    void testdivision4(int a, float b, float expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.divide(a, b),
                "The result of Calculator.add method is incorrect.");



    }


    @ParameterizedTest
    @CsvSource({"12.5, 5,2.5"})
    void testdivision5(float a, int b, float expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.divide(a, b),
                "The result of Calculator.add method is incorrect.");



    }


    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );


        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}