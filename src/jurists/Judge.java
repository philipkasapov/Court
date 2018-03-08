package jurists;

import citizens.Citizen;

import java.util.Scanner;

/**
 * Created by Philip on 2/22/2018.
 */
public class Judge extends Jurist {

    public Judge(String name, int experience, int cases) {
        super(name, Position.JUDGE, experience, cases);
        if(experience<5){
            System.out.println("Experience cannot be under 5 years. Input another number: ");
            Scanner sc = new Scanner(System.in);
            int exp = 0;
            while(exp<5){
                exp = sc.nextInt();
            }
            setExperience(exp);
        }
    }

    public void setExperience(int experience){
        if(experience >= 5){
           this.experience = experience;
        }
        else {
            System.out.println("Invalid experience for a judge.");
        }
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
        return false;
    }

    @Override
    public String toString() {
        return "Judge{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", experience=" + experience +
                ", cases=" + cases +
                '}';
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
    public void askQuestion(Citizen c) {

    }

    @Override
    public void takeNotes(Citizen c) {

    }
}
