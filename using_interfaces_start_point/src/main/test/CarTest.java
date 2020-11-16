import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void canConvertCar() {
        Car car = new Car("Tesla", 3); // Given we have a car
        String message = Converter.process(car); // When we pass it to converter
        assertEquals("Car data", message); // Then we should see converted string
    }

}
