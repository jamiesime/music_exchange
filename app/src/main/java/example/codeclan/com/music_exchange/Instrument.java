package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public abstract class Instrument {

    private int ID;
    private Type type;
    private Body body;
    private double boughtFor;
    private double sellFor;

    public Instrument(int ID, Type type, Body body, double boughtFor, double sellFor) {
        this.ID = ID;
        this.type = type;
        this.body = body;
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public Type getType() {
        return type;
    }

    public Body getBody() {
        return body;
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
