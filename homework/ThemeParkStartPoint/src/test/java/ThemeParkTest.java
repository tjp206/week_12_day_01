import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before() {
        themePark = new ThemePark(ArrayList<Attraction>, );
    }

    @Test
    public void getAllReviewsFromStallsAndAttractions() {
        assertEquals(, themePark.getAllReviewed());
    }

}
