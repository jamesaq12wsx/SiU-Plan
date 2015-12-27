package nccu.se.dep;

import java.util.ArrayList;
import java.util.List;

public class RpgApplication
{
    private RpgPerson tom = new Swordsman("Tom", 100, 0);
    private RpgPerson mary = new Magician("Mary", 80, 20);
    
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
