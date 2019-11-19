
/**
 * Décrivez votre classe Special ici.
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */
public class Special extends Item
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int bonus;

    /**
     * Constructeur d'objets de classe Special
     */
    public Special(String sName, int aBonus)
    {
        super(sName);
        bonus = aBonus;
    }

    public int getBonus()
    {
        return bonus;
    }
}
