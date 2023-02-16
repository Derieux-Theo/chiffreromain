import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestConvertRomain {

    //assertTrue true
    @Test
    public void testTrue() {
        assertTrue(true);
    }


    @Test
    public void testConvert() {
        assertEquals("I", ConvertRoman.convert(1));
    }
}
