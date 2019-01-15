import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeDeckTest {
    private TapeDeck tapeDeck;

    @Before
    public void before(){
        tapeDeck = new TapeDeck("TapePlus", "Tape98");
    }

    @Test
    public void hasMake(){
        assertEquals("TapePlus", tapeDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Tape98", tapeDeck.getModel());
    }

    @Test
    public void canPlay(){
        tapeDeck.play();
        assertEquals("Tape1", tapeDeck.getCurrentTape());
    }
}
