package nccu.se.di;

import java.util.ArrayList;
import java.util.List;

public class RpgApplication
{
    private RpgPerson tom;

    private RpgPerson mary;

    public void run()
    {
        List<RpgPerson> people = new ArrayList<RpgPerson>();
        people.add(tom);
        people.add(mary);

        for (RpgPerson p : people)
        {
            p.attack();
            p.cure();
        }
    }

    public RpgPerson getTom()
    {
        return tom;
    }

    public void setTom(RpgPerson tom)
    {
        this.tom = tom;
    }

    public RpgPerson getMary()
    {
        return mary;
    }

    public void setMary(RpgPerson mary)
    {
        this.mary = mary;
    }

}
