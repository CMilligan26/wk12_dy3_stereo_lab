public class Stereo implements IConnect{
    private Radio radio;
    private CDPlayer cdPlayer;
    private TapeDeck tapeDeck;

    public Stereo(Radio radio, CDPlayer cdPlayer, TapeDeck tapeDeck){
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.tapeDeck = tapeDeck;
    }

    public String playCD() {
        this.cdPlayer.play();
        return this.cdPlayer.getCurrentCD();
    }

    public String playTape() {
        this.tapeDeck.play();
        return this.tapeDeck.getCurrentTape();
    }

    public String playRadio() {
        this.radio.play();
        return this.radio.getStation();
    }

    @Override
    public String connect() {
        return "Connected to External Source";
    }
}
