import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {
    Counter counter;

    @BeforeEach
    public void setup(){
        System.out.println("before test");
        counter = new Counter();
    }

    @Test
    public void testForCounterIncrement(){
        System.out.println("Increment Test");
        int countValue = counter.increment();
        assertEquals(countValue, 1);
    }

    @Test
    public void testForCounterDecrement(){
        System.out.println("Decrement Test");
        int countValue = counter.decrement();
        assertEquals(countValue, -1);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("after test\n");
        counter = null;
    }
}
