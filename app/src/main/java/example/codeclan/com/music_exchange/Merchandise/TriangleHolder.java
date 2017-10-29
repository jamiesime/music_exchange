package example.codeclan.com.music_exchange.Merchandise;

import example.codeclan.com.music_exchange.Categories.Accessories;
import example.codeclan.com.music_exchange.Categories.Sellable;

/**
 * Created by user on 29/10/2017.
 */

public class TriangleHolder extends Accessories implements Sellable {

    public TriangleHolder(int ID, double boughtFor, double sellFor) {
        super(ID, boughtFor, sellFor);
    }

}
