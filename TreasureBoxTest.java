import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe-test TreasureBoxTest.
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */
public class TreasureBoxTest
{
    //Attributes of the treasureBox class.
    List <Key> key;
    List <Special> special;
    Lock lock;
    TreasureBox treasureB;

     /**
     * Test if getters work correctly.
     */
    @Test
    public void testBoxLocked()
    {
        Door door = new Door();
        Key key = new Key("1", door);
        Key key2 = new Key("2", door);
        lock = new Lock(key);
        
        List <Key> keys = new ArrayList<Key>(); 
        keys.add(key2);
        
        List <Special> specials = new ArrayList<Special>(); 
        Special special1 = new Special("bh", 5);
        specials.add(special1);
        
        treasureB = new TreasureBox("Toto", keys, specials, lock);
        assertEquals(keys, treasureB.getKey());
        assertEquals(specials, treasureB.getSpecial());
    }
    
}


