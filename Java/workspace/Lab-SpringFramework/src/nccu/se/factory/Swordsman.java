package nccu.se.factory;

public class Swordsman extends RpgPerson
{
    @Override
    public void attack()
    {
        System.out.println(getName() + ": ���z����!");
    }

    @Override
    public void cure()
    {
        System.out.println(getName() + ": �ܸɦ���!");
    }

    public Swordsman(String name, int hp, int mp)
    {
        super(name, hp, mp);
    }

}
