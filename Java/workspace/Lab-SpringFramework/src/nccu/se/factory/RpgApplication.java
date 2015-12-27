package nccu.se.factory;

import java.util.ArrayList;
import java.util.List;

public class RpgApplication
{
    private RpgPerson tom = RpgPersonFactory.create("Swordsman","Tom", 100, 0);
    private RpgPerson mary = RpgPersonFactory.create("Magician","Mary", 80, 20);
    
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
}
