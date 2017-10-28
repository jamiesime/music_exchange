package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class HornVarnish implements Sellable {

    public double calculateMarkUp(double boughtFor, double sellFor){
        double markUp = (sellFor -= boughtFor);
        return markUp;
    }

    public int getID() {
        return this.getID();
    }

}
