
/**
 * This class allows to instanciate a delivery which can be deliver by a ant.
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */

public class Delivery extends Item
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Room goal;

    /**
     * Constructeur d'objets de classe Deliveroo
     */
    public Delivery(String dName, Room goalR)
    {
        super(dName);
        goal = goalR;
    }
    
    public Room getGoal()
    {
        return goal;
    }
}
