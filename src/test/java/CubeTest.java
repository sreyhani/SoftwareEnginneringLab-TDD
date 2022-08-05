import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubeTest {
    private Cube cube = new Cube(20);

    @Test
    public void computeArea() {
        Shape shape = cube;
        assertEquals(shape.computeArea(), 400);
    }

    @Test
    public void changeSize() {
        cube.setSide(5);
        assertEquals(cube.getSide(), 5);
        assertEquals(cube.computeArea(), 25);
    }
}