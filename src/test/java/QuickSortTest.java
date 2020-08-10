import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void shouldSortElementsInList(){
        //arrange
        List<Integer> toSort = new ArrayList<>(Arrays.asList(5,2,6,1,4,3));
        //act
        QuickSort.quickSort(toSort);
        //assert
        assertIterableEquals(Arrays.asList(1,2,3,4,5, 6), toSort);
    }


}