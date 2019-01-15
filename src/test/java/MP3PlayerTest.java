import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {
    private MP3Player mp3Player = new MP3Player();

    @Test
    public void canConnect(){
        assertEquals("Connected to Stereo", mp3Player.connect());
    }
}
