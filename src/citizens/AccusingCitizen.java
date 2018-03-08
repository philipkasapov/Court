package citizens;

import jurists.Lawyer;

import java.util.HashSet;

/**
 * Created by Philip on 2/22/2018.
 */
public abstract class AccusingCitizen extends Citizen {
    protected HashSet<Lawyer> lawyers;
    public AccusingCitizen(String name, String address, int age) {
        super(name, address, age);
        this.lawyers = new HashSet<>();
    }

    public HashSet<Lawyer> getLawyers() {
        return lawyers;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
