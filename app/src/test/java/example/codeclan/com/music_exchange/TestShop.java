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

    @Before
    public void setUp(){
        shop = new Shop("Steve's Music Shop");
        kazoo = new Kazoo(1, Type.BLOWINGSTYLE, Body.PLASTIC, 50.00, 75.00);
        triangle = new Triangle(2, Type.PERCUSSIVE, Body.STEEL, 10.00, 15.00);
        frenchHorn = new FrenchHorn(3, Type.BRASS, Body.SOLIDGOLD, 223.45, 499.99, 5);
    }

    @Test
    public void testAddToStock(){
        shop.addToStock(kazoo);
        assertEquals(1, shop.getStockSize());
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

}
