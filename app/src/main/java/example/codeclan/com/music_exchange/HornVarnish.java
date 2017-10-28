package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class HornVarnish implements Sellable {

    private double boughtFor;
    private double sellFor;

    public HornVarnish(double boughtFor, double sellFor) {
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    @Override
    public double getBoughtFor() {
        return boughtFor;
    }

    public double calculateMarkUp(){
        double markUp = (sellFor -= boughtFor);
        return markUp;
    }

    public int getID() {
        return this.getID();
    }

}
