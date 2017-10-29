package example.codeclan.com.music_exchange.Merchandise;

import example.codeclan.com.music_exchange.MerchAttributes.Body;
import example.codeclan.com.music_exchange.Categories.Instrument;
import example.codeclan.com.music_exchange.Categories.Playable;
import example.codeclan.com.music_exchange.Categories.Sellable;
import example.codeclan.com.music_exchange.MerchAttributes.Type;

/**
 * Created by user on 28/10/2017.
 */

public class Triangle extends Instrument implements Sellable, Playable {


    public Triangle(int ID, Type type, Body body, double boughtFor, double sellFor) {
        super(ID, type, body, boughtFor, sellFor);
    }

    public String play(){
        return "Ding!";
    }
}
