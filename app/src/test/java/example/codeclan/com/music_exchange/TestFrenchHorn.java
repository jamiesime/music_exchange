package example.codeclan.com.music_exchange;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.music_exchange.MerchAttributes.Body;
import example.codeclan.com.music_exchange.MerchAttributes.Type;
import example.codeclan.com.music_exchange.Merchandise.FrenchHorn;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 28/10/2017.
 */

public class TestFrenchHorn {

    FrenchHorn frenchHorn;

    @Before
    public void setUp(){
        frenchHorn = new FrenchHorn(3, Type.BRASS, Body.SOLIDGOLD, 223.45, 499.99, 5);
    }

    @Test
    public void testValves(){
        assertEquals(5, frenchHorn.getValves());
    }
}
