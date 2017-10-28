package example.codeclan.com.music_exchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 28/10/2017.
 */

public class TestKazoo {

    Kazoo kazoo;

    @Before
    public void setUp(){
        kazoo = new Kazoo(1, Type.BLOWINGSTYLE, Body.PLASTIC, 50.00, 75.00);
    }

    @Test
    public void testPlay(){
        assertEquals("Kazoom", kazoo.play());
    }

    @Test
    public void testCalculateMarkUp(){
        assertEquals(25.00, kazoo.calculateMarkUp());
    }

}
