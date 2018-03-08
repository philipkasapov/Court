package citizens;

/**
 * Created by Philip on 2/22/2018.
 */
public abstract class Citizen {
    protected String name;
    protected String address;
    protected int age;



    public Citizen(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
