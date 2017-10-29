package example.codeclan.com.music_exchange;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.music_exchange.Merchandise.HornVarnish;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 29/10/2017.
 */

public class TestHornVarnish {

    HornVarnish hornVarnish;

    @Before
    public void setUp(){
        hornVarnish = new HornVarnish(4, 3.00, 5.50, "Very Poor");
    }

    @Test
    public void testQuality(){
        assertEquals("Very Poor", hornVarnish.getQuality());
    }
}
