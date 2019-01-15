import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    private CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("CDPlus", "CD12");
    }

    @Test
    public void hasMake(){
        assertEquals("CDPlus", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("CD12", cdPlayer.getModel());
    }

    @Test
    public void canPlay(){
        cdPlayer.play();
        assertEquals("CD1", cdPlayer.getCurrentCD());
    }
}
