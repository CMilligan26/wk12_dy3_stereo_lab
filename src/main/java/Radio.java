public class Radio extends Component {

    private String station;

    public Radio(String make, String model){
        super(make, model);
        this.station = "";
    }

    @Override
    public void play() {
       this.tune();
    }

    private void tune() {
        this.station = "Radio1";
    }

    public String getStation() {
        return station;
    }
}
