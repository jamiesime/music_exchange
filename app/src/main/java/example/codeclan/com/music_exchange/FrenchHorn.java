package example.codeclan.com.music_exchange;

import static android.R.attr.type;

/**
 * Created by user on 28/10/2017.
 */

public class FrenchHorn extends Instrument implements Sellable, Playable{

    private int valves;

    public FrenchHorn(int ID, Type type, Body body, double boughtFor, double sellFor, int valves) {
        super(ID, type, body, boughtFor, sellFor);
        this.valves = valves;
    }

    public String play(){
        return "Hroooaahmm";
    }

    public int getValves() {
        return valves;
    }
}
