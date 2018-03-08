package jurists;

/**
 * Created by Philip on 2/22/2018.
 */
public abstract class Jurist implements IJurist {
    enum Position{
        JUDGE, JURYMAN, LAWYER, PROSECUTOR
    }

    protected String name;
    protected final Position position;
    protected int experience;
    protected int cases;

    public Jurist(String name, Position position, int experience, int cases) {
        this.name = name;
        this.position = position;
        this.experience = experience;
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jurist jurist = (Jurist) o;

        if (experience != jurist.experience) return false;
        if (cases != jurist.cases) return false;
        if (name != null ? !name.equals(jurist.name) : jurist.name != null) return false;
        return position == jurist.position;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + experience;
        result = 31 * result + cases;
        return result;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public abstract boolean isLawyer();
    public abstract boolean isProsecutor();
    public abstract boolean isJuryman();



}
