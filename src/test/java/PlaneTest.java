import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747, 1, 50);
    }

    @Test
    public void getPlaneCapacity() {
        assertEquals(1, plane.getCapacity());
    }

    @Test
    public void getPlaneTotalWeight() {
        assertEquals(50, plane.getTotalWeight());
    }
}
