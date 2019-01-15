public class CDPlayer extends Component{

    private String currentCD;

    public CDPlayer(String make, String model){
        super(make, model);
    }

    @Override
    public void play() {
        this.chooseCD();
    }

    private void chooseCD() {
        this.currentCD = "CD1";
    }

    public String getCurrentCD() {
        return currentCD;
    }
}
