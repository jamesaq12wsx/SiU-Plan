package nccu.se.di;

public class Magician extends RpgPerson
{

    @Override
    public void attack()
    {
        System.out.println(getName() + ": 魔法攻擊!");
    }

    @Override
    public void cure()
    {
        System.out.println(getName() + ": 回復咒!");
    }

    public Magician(String name, int hp, int mp)
    {
        super(name, hp, mp);
    }

}
