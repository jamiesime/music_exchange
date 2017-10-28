package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class Kazoo extends Instrument implements Sellable, Playable{


    public Kazoo(int ID, Type type, Body body, double boughtFor, double sellFor) {
        super(ID, type, body, boughtFor, sellFor);
    }

    public String play(){
        return "Kazoom";
    }
}
