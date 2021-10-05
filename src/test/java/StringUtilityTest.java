import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtilityTest {

    @Test
    void returnStringABC(){
        assertEquals("aBc", CustomStringBuilder.returnString("aBc"));
    }

    @Test
    void returnListOfChars(){
        char[] expected = {'a', 'B', 'c'};
        assertArrayEquals(expected, CustomStringBuilder.charArray());
    }

    @Test
    void checkLengthOfListAndAvoidToShortOrToLong(){
        char[] expected = {'a', 'B', 'c'};
        assertArrayEquals(expected, CustomStringBuilder.charArray());
    }
    @Test
    void reverseString() {
        assertEquals("cBa", CustomStringBuilder.reversWord());
    }

    @Test
    void ReturnToUpperCase(){
        assertEquals("ABC", CustomStringBuilder.toUpperCase());
    }

    @Test
    void toLowerCase(){
        assertEquals("abc", CustomStringBuilder.toLowerCase());
    }
}
