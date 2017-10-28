package example.codeclan.com.music_exchange;

import static android.R.attr.type;

/**
 * Created by user on 28/10/2017.
 */

public class FrenchHorn extends Instrument implements Sellable, Playable{

    public FrenchHorn(int ID, Type type, Body body) {
        super(ID, type, body);
    }

    public double calculateMarkUp(double boughtFor, double sellFor){
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
