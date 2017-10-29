package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public class HornVarnish extends Accessories implements Sellable {

    private String quality;

    public HornVarnish(int ID, double boughtFor, double sellFor, String quality) {
        super(ID, boughtFor, sellFor);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}
