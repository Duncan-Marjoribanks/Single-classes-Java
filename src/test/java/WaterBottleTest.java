import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.volume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canRefill(){
        WaterBottle emptyWaterBottle = new WaterBottle(0);
        assertEquals(100, emptyWaterBottle.refill());
    }

}
