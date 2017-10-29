package example.codeclan.com.music_exchange;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by user on 28/10/2017.
 */

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;
    private ArrayList<Sellable> sold;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.sold = new ArrayList<>();
    }

    public String addToStock(Sellable newStock){
        for (Sellable item : stock){
            if (item.getID() == newStock.getID()){
                return "Invalid ID";
            }
        }
        stock.add(newStock);
        return "Item added to stock.";
    }

    public void addToSold(Sellable isSold){ sold.add(isSold);}

    public void removeFromStock(Sellable toSell){
        int toTake = stock.indexOf(toSell);
        stock.remove(toTake);
    }

    public int getSoldSize() { return this.sold.size();}

    public int getStockSize (){
        return this.stock.size();
    }

    public boolean checkForItem(Sellable item){
        return this.stock.contains(item);
    }

    public double getPotentialProfit(){
        double total = 0.00;
        for (Sellable item : stock){
            total += item.calculateMarkUp();
        }
        return total;
    }

    public double getProfitAsPercentage(){
        double overhead = 0;
        double profit = getPotentialProfit();
        for (Sellable item : stock) {
            overhead += (item.getBoughtFor());
        }
        double result = ((profit / overhead) * 100);
        DecimalFormat df = new DecimalFormat("#.##");
        result = Double.valueOf(df.format(result));
        return result;
    }

    public double getProfitMade(){
        double total = 0;
        for (Sellable item : sold){
            total += item.calculateMarkUp();
        }
        return total;
    }

}
