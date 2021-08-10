import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testForGetArea(){
        // Arrange
        Rectangle rectangle = new Rectangle();

        // Act
        int actualResult = rectangle.getArea(10,30);

        // Assert
        assertEquals(actualResult, 300);
    }

    @Test
    public void testForGetAreaWithMultipleValues(){
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle.getArea(10, 50), 500);
        assertEquals(rectangle.getArea(20, 50), 1000);
        assertEquals(rectangle.getArea(3, 50), 150);
    }

    @Test
    public void testForGetPerimeter(){
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle.getPerimeter(10,20), 60);
    }
}
