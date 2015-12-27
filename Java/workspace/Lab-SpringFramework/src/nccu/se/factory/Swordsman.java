package nccu.se.factory;

public class Swordsman extends RpgPerson
{
    @Override
    public void attack()
    {
        System.out.println(getName() + ": ª«²z§ðÀ»!");
    }

    @Override
    public void cure()
    {
        System.out.println(getName() + ": ³Ü¸É¦åÃÄ!");
    }

    public Swordsman(String name, int hp, int mp)
    {
        super(name, hp, mp);
    }

}
