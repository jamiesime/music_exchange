package example.codeclan.com.music_exchange;

import static android.os.Build.ID;

/**
 * Created by user on 29/10/2017.
 */

public abstract class Accessories {

    private double boughtFor;
    private double sellFor;
    private int ID;

    public Accessories(int ID, double boughtFor, double sellFor){
        this.ID = ID;
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public int getID() {
        return ID;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public double getSellFor() {
        return sellFor;
    }

    public double calculateMarkUp(){
        double markUp = (sellFor -= boughtFor);
        return markUp;
    }

}
