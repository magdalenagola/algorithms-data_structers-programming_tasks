package programming_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciStringsTest {

    @Test
    public void shouldReturnCorrectStringForAGivenNumber(){
        assertEquals("0", FibonacciStrings.solve(0));
        assertEquals("01", FibonacciStrings.solve(1));
        assertEquals("010", FibonacciStrings.solve(2));
        assertEquals("01001", FibonacciStrings.solve(3));
        assertEquals("0100101001001", FibonacciStrings.solve(5));
    }

}