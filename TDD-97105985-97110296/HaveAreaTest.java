import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HaveAreaTest {
    @Test
    public void test_compute_area_rectangle() {
        Rectangle rectangle = new Rectangle(1, 2);
        float a = rectangle.computeArea();
        assertEquals(2.0, a, 0.01);
    }

    @Test
    public void test_compute_area_rectangle_zero() {
        Rectangle rectangle = new Rectangle(0, 2);
        float a = rectangle.computeArea();
        assertEquals(0.0, a, 0.01);
    }

    @Test
    public void test_compute_area_rectangle_after_edit_height() {
        Rectangle rectangle = new Rectangle(1, 2);
        float a = rectangle.computeArea();
        assertEquals(2.0, a, 0.01);

        rectangle.setHeight(5);
        float ap = rectangle.computeArea();
        assertEquals(10.0, ap, 0.01);
    }

    @Test
    public void test_compute_area_rectangle_after_edit_width() {
        Rectangle rectangle = new Rectangle(1, 2);
        float a = rectangle.computeArea();
        assertEquals(2.0, a, 0.01);

        rectangle.setWidth(5);
        float ap = rectangle.computeArea();
        assertEquals(5.0, ap, 0.01);
    }

    @Test
    public void test_compute_area_rectangle_after_edit_both_dimensions() {
        Rectangle rectangle = new Rectangle(1, 2);
        float a = rectangle.computeArea();
        assertEquals(2.0, a, 0.01);

        rectangle.setHeight(5);
        rectangle.setWidth(5);
        float ap = rectangle.computeArea();
        assertEquals(25.0, ap, 0.01);
    }

    @Test
    public void test_compute_area_rectangle_after_fake_edit() {
        Rectangle rectangle = new Rectangle(1, 2);
        float a = rectangle.computeArea();
        assertEquals(2.0, a, 0.01);

        rectangle.setHeight(rectangle.getHeight());
        rectangle.setWidth(rectangle.getWidth());
        float ap = rectangle.computeArea();
        assertEquals(a, ap, 0.01);
    }

    @Test
    public void test_compute_area_square() {
        Square square = new Square(2);
        float a = square.computeArea();
        assertEquals(4.0, a, 0.01);
    }

    @Test
    public void test_compute_area_square_zero() {
        Square square = new Square(0);
        float a = square.computeArea();
        assertEquals(0.0, a, 0.01);
    }

    @Test
    public void test_compute_area_square_after_edit_side() {
        Square square = new Square(2);
        float a = square.computeArea();
        assertEquals(4.0, a, 0.01);

        square.setSide(5);
        float ap = square.computeArea();
        assertEquals(25.0, ap, 0.01);
    }

    @Test
    public void test_compute_area_square_after_fake_edit() {
        Square square = new Square(2);
        float a = square.computeArea();
        assertEquals(4.0, a, 0.01);

        square.setSide(square.getSide());
        float ap = square.computeArea();
        assertEquals(a, ap, 0.01);
    }
}
