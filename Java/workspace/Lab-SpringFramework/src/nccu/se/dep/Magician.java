package nccu.se.dep;

public class Magician extends RpgPerson
{
    @Override
    public void attack()
    {
        System.out.println(getName() + ": Å]ªk§ðÀ»!");
    }

    @Override
    public void cure()
    {
        System.out.println(getName() + ": ¦^´_©G!");
    }

    public Magician(String name, int hp, int mp)
    {
        super(name, hp, mp);
    }

}
