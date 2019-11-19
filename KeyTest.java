

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test KeyTest.
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */
public class KeyTest
{
    private Door door;
    private Key key;

     /**
     * Test that an item is correctly initialised .
     */
    @Test
    public void testKey()
    {
        Door door = new Door();
        Key key = new Key("1", door);
        assertEquals(door, key.getDoor());
    }
    
}


