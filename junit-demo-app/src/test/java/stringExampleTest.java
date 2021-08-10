import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class stringExampleTest {

    @Test
    public void testForCompareFirstAndLastCharactersAreSame(){
        StringExample stringExample = new StringExample();
        boolean actualValue = stringExample.compareFirstAndLastCharactersAreSame("ABAB");
        boolean expectedValue = true;

        assertEquals(actualValue,true);
//        assertTrue(actualValue);
//        assertFalse(actualValue);
//        assertEquals(actualValue, false);

    }
}
