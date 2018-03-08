package jurists;

import citizens.Citizen;

import java.util.Scanner;

/**
 * Created by Philip on 2/22/2018.
 */
public class Prosecutor extends Jurist {
    public Prosecutor(String name, int experience, int cases) {
        super(name, Position.PROSECUTOR, experience, cases);
        if(experience<10){
            System.out.println("Enter new number for experience for prosecutor.");
            Scanner sc = new Scanner(System.in);
            int exp;
            do {
                exp = sc.nextInt();
            } while(exp<10);

            setExperience(exp);
        }
    }

    public void setExperience(int experience){
        if(experience >= 10){
            this.experience = experience;
        }
        else {
            System.out.println("Invalid experience for a prosecutor.");
            this.experience = 0;
        }
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
        return true;
    }

    @Override
    public boolean isJuryman() {
        return false;
    }

    @Override
    public void askQuestion(Citizen c) {
        System.out.println("PROSECUTOR"+this.name+" asking question to " + c.getName());
    }

    @Override
    public void takeNotes(Citizen c) {

    }

    @Override
    public String toString() {
        return "Prosecutor{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", experience=" + experience +
                ", cases=" + cases +
                '}';
    }
}
