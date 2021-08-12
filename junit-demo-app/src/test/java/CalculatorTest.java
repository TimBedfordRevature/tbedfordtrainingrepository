import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

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

    @Test
    public void testForFindMaxNumber(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.findMaxNumber(new int[]{1,2,3});
        int expectedResult = 3;

        assertEquals(expectedResult, actualResult);

        int actualResult2 = calculator.findMaxNumber(new int[]{-12, -5, -7, -4, -1});
        int expectedResult2 = -1;
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void testGetCube(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.getCube(3);
        int expectedResult = 27;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForReverseString(){
        assertEquals("cba", calculator.reverseString("abc"));
    }

    @Test
    public void testForMultiplyTwoNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.multiplyTwoNumbers(20, 30);
        assertEquals(600, result);
    }
}
