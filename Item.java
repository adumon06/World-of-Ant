
/**
 * This class allows to be able to create an item.  
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */
public class Item
{
    // This variables gives name to item
    private String name;

    /**
     * This constructor create an item object and give him a name.
     */
    public Item(String iName)
    {
        if (name.length() > 0 )
        {
        name = iName;
        } 
    }
    
    
    public String getName()
    {
      return name;
    }
    
    
}
