import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("RadioPlus", "R12");
    }

    @Test
    public void hasMake(){
        assertEquals("RadioPlus", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("R12", radio.getModel());
    }

    @Test
    public void canPlay(){
        radio.play();
        assertEquals("Radio1", radio.getStation());
    }
}
