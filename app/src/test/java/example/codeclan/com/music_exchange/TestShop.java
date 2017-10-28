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

    @Before
    public void setUp(){
        shop = new Shop("Steve's Music Shop");
        kazoo = new Kazoo(1, Type.BLOWINGSTYLE, Body.PLASTIC, 50.00, 75.00);
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


}
