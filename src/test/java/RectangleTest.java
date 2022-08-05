import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void createRectangle() {
        Rectangle rectangle = new Rectangle(10,20);
        assertEquals(rectangle.height, 20);
        assertEquals(rectangle.width, 10);
    }

    @Test
    public void computeArea() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(rectangle.computeArea(), 200);
    }
}