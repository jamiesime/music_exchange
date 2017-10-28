package example.codeclan.com.music_exchange;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 28/10/2017.
 */

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        ArrayList<Sellable> stock = new ArrayList<>();
    }

    public void addToStock(Sellable newStock){
        stock.add(newStock);
    }

    public void removeFromStock(Sellable toSell){
        int toTake = stock.indexOf(toSell);
        stock.remove(toTake);
    }

}
