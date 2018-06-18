import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterbottle {
    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle();
    }

    @Test
    public void drink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void isEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void isFill(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}
