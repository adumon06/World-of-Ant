

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe-test TreasureBoxTest.
 *
 * @Ad
 * @13/11/2019
 *
 */
public class TreasureBoxTest
{
    //Attributes of the treasureBox class.
    List <Key> key;
    List <Special> special;
    TreasureBox treasureB;

    /**
     * Default constructor of the test class TreasureBox
     */
    public TreasureBoxTest()
    {
        
    }

    /**
     * Set up the test fixture
     * Called before every test case method
     */
     @Before
     public void setUpTreasure() 
    {
       treasureB = new TreasureBox("");      
       
    }

    
}
