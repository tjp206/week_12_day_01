package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollercoaster() {
        Visitor visitor = new Visitor(14,201,50);
        visitor.getHeight();
        visitor.getAge();
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void getPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void checkDoublePrice() {
        Visitor visitor = new Visitor(11, 210, 50);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }
}
