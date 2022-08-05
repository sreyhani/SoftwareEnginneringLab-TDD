import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private Rectangle rectangle = new Rectangle(10,20);

    @Test
    public void getSize() {
        assertEquals(rectangle.getHeight(), 20);
        assertEquals(rectangle.getWidth(), 10);
    }

    @Test
    public void computeArea() {
        Shape shape = rectangle;
        assertEquals(shape.computeArea(), 200);
    }

    @Test
    public void changeSize(){
        rectangle.setHeight(15);
        assertEquals(rectangle.computeArea(), 150);
        rectangle.setWidth(5);
        assertEquals(rectangle.computeArea(), 75);
    }

}