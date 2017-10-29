package example.codeclan.com.music_exchange.Merchandise;

import example.codeclan.com.music_exchange.MerchAttributes.Body;
import example.codeclan.com.music_exchange.Categories.Instrument;
import example.codeclan.com.music_exchange.Playable;
import example.codeclan.com.music_exchange.Sellable;
import example.codeclan.com.music_exchange.MerchAttributes.Type;

/**
 * Created by user on 28/10/2017.
 */

public class FrenchHorn extends Instrument implements Sellable, Playable {

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
