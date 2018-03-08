package jurists;

import citizens.Citizen;

import java.util.Scanner;

/**
 * Created by Philip on 2/22/2018.
 */
public class Lawyer extends Jurist {
    public Lawyer(String name, int experience, int cases) {
        super(name, Position.LAWYER, experience, cases);
        if(cases < 10){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new number for a number of cases for lawyer.");
            int c;
            do {
                c = sc.nextInt();
            }while(c<10);
            setCases(c);

        }
    }

    public void setCases(int x){
        if(x>=10){
            this.cases = x;
        }else {
            System.out.println("Invalid case number for a lawyer.");
        }
    }

    @Override
    public boolean isLawyer() {
        return true;
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
        System.out.println("LAWYER "+this.name+" asking question to "+ c.getName());
    }

    @Override
    public void takeNotes(Citizen c) {

    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", experience=" + experience +
                ", cases=" + cases +
                '}';
    }
}
