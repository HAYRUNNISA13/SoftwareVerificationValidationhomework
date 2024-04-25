//STUDENT NUMBER= B211202009
//STUDENT NAME = HAYRUN NİSA ÇELİK
//COURSE NAME = SOFTWARE VERIFICATION AND VALIDATION
//https://github.com/HAYRUNNISA13/SoftwareVerificationValidationhomework.git

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
    @CsvSource({"10, 2,5","10, 4,2.5","12.5, 2.5,5", "10, 2.5,4", "12.5, 5,2.5"})// we are gathered together all the values of each of five test together to create a parameterized test
    void testDivideHomework(float x, float y, float expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.divide(x, y), "The result of this divide method is wrong. Try again");



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