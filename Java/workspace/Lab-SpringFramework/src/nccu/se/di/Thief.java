package nccu.se.di;

public class Thief extends RpgPerson
{
    @Override
    public void attack()
    {
        System.out.println(getName() + ": 偷東西!");
    }

    @Override
    public void cure()
    {
        System.out.println(getName() + ": 賣東西!");
    }

    public Thief(String name, int hp, int mp)
    {
        super(name, hp, mp);
    }

}
