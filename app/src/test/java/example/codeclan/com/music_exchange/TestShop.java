package example.codeclan.com.music_exchange;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 28/10/2017.
 */

public class TestShop {

    Shop shop;
    Kazoo kazoo;
    Triangle triangle;
    FrenchHorn frenchHorn;
    HornVarnish hornVarnish;

    @Before
    public void setUp(){
        shop = new Shop("Steve's Music Shop");
        kazoo = new Kazoo(1, Type.BLOWINGSTYLE, Body.PLASTIC, 50.00, 75.00);
        triangle = new Triangle(2, Type.PERCUSSIVE, Body.STEEL, 10.00, 15.00);
        frenchHorn = new FrenchHorn(3, Type.BRASS, Body.SOLIDGOLD, 223.45, 499.99, 5);
        hornVarnish = new HornVarnish(4, 3.00, 5.50);

    }

    @Test
    public void testAddToStock(){
        shop.addToStock(kazoo);
        shop.addToStock(hornVarnish);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void testAddToSold(){
        shop.addToSold(frenchHorn);
        assertEquals(1, shop.getSoldSize());
    }

    @Test
    public void testRemoveFromStock(){
        shop.addToStock(kazoo);
        shop.removeFromStock(kazoo);
        assertEquals(false, shop.checkForItem(kazoo));
    }

    @Test
    public void testTotalProfit(){
        shop.addToStock(kazoo);
        shop.addToStock(triangle);
        assertEquals(30.00, shop.getPotentialProfit());
    }

    @Test
    public void testProfitAsPercentage(){
        shop.addToStock(kazoo);
        shop.addToStock(triangle);
        shop.addToStock(frenchHorn);
        assertEquals(108.15, shop.getProfitAsPercentage());
    }

    @Test
    public void testProfitMade(){
        shop.addToSold(kazoo);
        shop.addToSold(triangle);
        shop.addToSold(hornVarnish);
        assertEquals(32.50, shop.getProfitMade());
    }

}
