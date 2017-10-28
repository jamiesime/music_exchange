package example.codeclan.com.music_exchange;

import static android.R.attr.type;

/**
 * Created by user on 28/10/2017.
 */

public class FrenchHorn extends Instrument implements Sellable, Playable{

    private double boughtFor;
    private double sellFor;

    public FrenchHorn(int ID, Type type, Body body, double boughtFor, double sellFor) {
        super(ID, type, body);
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public double calculateMarkUp(){
        double markUp = (sellFor -= boughtFor);
        return markUp;
    }

    public int getID(){
        return this.getID();
    }

    public String play(){
        return "The noise a French Horn makes.";
    }
}
