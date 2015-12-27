package nccu.se.factory;

public class RpgPersonFactory
{
    public static RpgPerson create(String occupation, String name, int hp, int mp)
    {
        if ("magician".equalsIgnoreCase(occupation))
            return new Magician(name, hp, mp);
        else if ("swordsman".equalsIgnoreCase(occupation))
            return new Swordsman(name, hp, mp);
        else
            throw new IllegalArgumentException("No such occupation!");
    }
    
}
