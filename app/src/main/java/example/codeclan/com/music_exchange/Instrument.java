package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class Instrument {

    private int ID;
    private Type type;
    private Body body;

    public Instrument(int ID, Type type, Body body) {
        this.ID = ID;
        this.type = type;
        this.body = body;
    }
}
