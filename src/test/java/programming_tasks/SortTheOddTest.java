package programming_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTheOddTest {

    @Test
    public void shouldSortCorrectlyElementsInAnArray() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void shouldSortCorrectlyElementsInAnArrayWithZeroElement() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void shouldNotSortAnEmptyArray() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

}