import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConvertRomanTest {

    //assert equals true
    @Test
    public void Test1() {
        assertTrue(true);
    }

    // convert 1 to I
    @Test
    public void Test2() {
        assertEquals("I", ConvertRoman.convert(1));
    }

}
