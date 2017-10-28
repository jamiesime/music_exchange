package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class Triangle extends Instrument implements Sellable, Playable {

    public Triangle(int ID, Type type, Body body) {
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
        return "Ding!";
    }
}
