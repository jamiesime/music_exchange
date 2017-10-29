package example.codeclan.com.music_exchange;

/**
 * Created by user on 29/10/2017.
 */

public abstract class Accessories {

    public double boughtFor;
    public double sellFor;

    public Accessories(double boughtFor, double sellFor){
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public double calculateMarkUp(){
        double markUp = (sellFor -= boughtFor);
        return markUp;
    }

}
