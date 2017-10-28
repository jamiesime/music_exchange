package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public enum Type {

    BRASS("Brass"),
    BLOWINGSTYLE("Blowing Style"),
    PERCUSSIVE("Percussive");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
