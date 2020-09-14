package programming_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InPartsTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSplitStringCorrectly() {
        String ans = InParts.splitInParts("supercalifragilisticexpialidocious", 3);
        String sol = "sup erc ali fra gil ist ice xpi ali doc iou s";
        testing(ans, sol);
        ans = InParts.splitInParts("HelloKata", 3);
        sol = "Hel loK ata";
        testing(ans, sol);
        ans = InParts.splitInParts("HelloKata", 1);
        sol = "H e l l o K a t a";
        testing(ans, sol);
        ans = InParts.splitInParts("HelloKata", 9);
        sol = "HelloKata";
        testing(ans, sol);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenPartLengthIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> InParts.splitInParts("someString", -1));
    }

}