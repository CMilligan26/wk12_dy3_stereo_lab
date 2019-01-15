import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    private Stereo stereo;
    private Radio radio;
    private CDPlayer cdPlayer;
    private TapeDeck tapeDeck;

    @Before
    public void before(){
        radio = new Radio("RadioPlus", "R12");
        cdPlayer = new CDPlayer("CDPlus", "CD12");
        tapeDeck = new TapeDeck("TapePlus", "Tape98");
        stereo = new Stereo(radio, cdPlayer, tapeDeck);
    }

    @Test
    public void canPlayCD(){
        assertEquals("CD1", stereo.playCD());
    }

    @Test
    public void canPlayTape(){
        assertEquals("Tape1", stereo.playTape());
    }

    @Test
    public void canPlayRadio(){
        assertEquals("Radio1", stereo.playRadio());
    }

    @Test
    public void canConnect(){
        assertEquals("Connected to External Source", stereo.connect());
    }
}
