package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class Kazoo extends Instrument implements Sellable, Playable{

    private double boughtFor;
    private double sellFor;

    public Kazoo(int ID, Type type, Body body, double boughtFor, double sellFor) {
        super(ID, type, body);
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;

    }

    public double calculateMarkUp(){
        double markUp = (sellFor -= boughtFor);
        return markUp;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public int getID(){
        return this.getID();
    }

    public String play(){
        return "Kazoom";
    }
}
