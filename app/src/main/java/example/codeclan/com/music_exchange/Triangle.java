package example.codeclan.com.music_exchange;

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
