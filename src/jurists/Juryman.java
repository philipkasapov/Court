package jurists;

import citizens.Citizen;

/**
 * Created by Philip on 2/22/2018.
 */
public class Juryman extends Jurist {
    public Juryman(String name, int experience, int cases) {
        super(name, Position.JURYMAN, experience, cases);
    }
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.experience + this.cases;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.hashCode() == obj.hashCode()){
            return true;
        }
        return false;
    }

    @Override
    public boolean isLawyer() {
        return false;
    }

    @Override
    public boolean isProsecutor() {
        return false;
    }

    @Override
    public boolean isJuryman() {
        return true;
    }

    @Override
    public void askQuestion(Citizen c) {

    }

    @Override
    public void takeNotes(Citizen c) {

    }

    @Override
    public String toString() {
        return "Juryman{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", experience=" + experience +
                ", cases=" + cases +
                '}';
    }
}
