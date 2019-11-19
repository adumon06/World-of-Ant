
/**
 * Décrivez votre classe Human ici.
 *
 * @author G8
 * @version (un numéro de version ou une date)
 */
public class Human extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
  

    /**
     * Constructeur d'objets de classe Human
     */
    public Human(String theName)
    {
        super(theName);
        
    }

    /**
     * Inflic 25 dammage to the life of the StolenAnt
     * @param thief who represent the Stolen Ant and who will be cruch by the human
     * 
     */
    public void crush(StolenAnt thief)
    {
        
        thief.setVp(-25);
    }
}
