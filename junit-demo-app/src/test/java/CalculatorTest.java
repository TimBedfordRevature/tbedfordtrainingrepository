import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void addNumberTest(){
        // AAA Rule

        Calculator cal = new Calculator();

        // Act
        int actualResult = cal.addNumber(10, 20);

        // Assert
        int expectedResult = 30;
        assertEquals(expectedResult, actualResult);

    }
}
