import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TESTTRIANGLE {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TRIANGLE.classifyTriangle(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TRIANGLE.classifyTriangle(5, 5, 6));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TRIANGLE.classifyTriangle(3, 8, 5));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", TRIANGLE.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("notATriangle", TRIANGLE.classifyTriangle(0, 0, 0));
    }
}
