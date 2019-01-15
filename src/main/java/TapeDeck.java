public class TapeDeck extends Component{

    private String currentTape;

    public TapeDeck(String make, String model){
        super(make, model);
    }

    @Override
    public void play() {
        this.startTape();
    }

    private void startTape() {
        this.currentTape = "Tape1";
    }

    public String getCurrentTape() {
        return currentTape;
    }
}
